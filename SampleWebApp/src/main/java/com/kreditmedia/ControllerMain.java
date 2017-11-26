package com.kreditmedia;

import java.io.IOException;
import java.net.Authenticator.RequestorType;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.JsonObject;


@Controller
public class ControllerMain{

	@RequestMapping(value = "/addUser", method=RequestMethod.POST)
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
		HttpServletResponse response,@ModelAttribute("userDetails") User user) throws Exception {
		System.out.println("================adduser=======================");
		
		ModelAndView model = new ModelAndView("landing");
		
		Queries.insertUser(user.getUserName(), user.getLinkedinUrl(), user.getCompanyName(), user.getLoanId());
		Object[] objs = Queries.getUserId();
		prepareLinkedinMsg((Integer) objs[0],(String) objs[2]);
		prepareGlassdoorMsg((Integer) objs[0],(String) objs[1]);
		return model;
	}
	
	private void prepareGlassdoorMsg(int userId,String company) throws IOException, InterruptedException {
		GlassdoorAPI gApi = new GlassdoorAPI();
		GlassdoorClient gClient = new GlassdoorClient("10.1.54.91", 9094);
		JsonObject obj = new JsonObject();
		obj.addProperty("customer-id", userId);
		obj.add("company-name", gApi.getCompanyReviewJson(company));
	    gClient.sendMessage(obj.toString());
	}

	private void prepareLinkedinMsg(int userId,String linkedIn) throws IOException, InterruptedException {
		LinkedinAPI lApi = new LinkedinAPI();
		LinkedinClient lClient = new LinkedinClient("10.1.54.91", 9093);
		JsonObject obj = new JsonObject();
		obj.addProperty("customer-id", userId);
		obj.addProperty("bio", lApi.getLinkedinDetails(linkedIn));
		lClient.sendMessage(obj.toString());
	}

	@RequestMapping(value = "/welcome", method={RequestMethod.GET, RequestMethod.POST})
	protected ModelAndView handleRequestInternal1(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		System.out.println("================welcome=======================");
		ModelAndView andView = new ModelAndView();
		andView.addObject(new User());
		return andView;
	}
}