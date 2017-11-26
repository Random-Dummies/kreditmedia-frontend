package com.kreditmedia;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class GlassdoorAPI {
	
	static double defaultRating = 3;
	static long thresholdNumberOfRatings = 500;
	static double thresholdCut = 0.8;//Rating will be reduced to this much if threshold not crossed
	
	//Weights relative to each other
	static double overallRatingWeightage = 50;
	static double careerOpportunitiesRatingWeightage = 30;
	static double seniorLeadershipRatingWeightage = 20;
	static double workLifeBalanceRatingWeightage = 20;
	
	static String localJsonPath = "C:/Users/rishabh.srivastava/Desktop/Nuc/glassdoor-nucleus-json.txt";
	
	public double getCompanyRating(String companyName, boolean isCurrentCompany)
	{
		JsonObject responsejson = getCompanyReviewJson(companyName);
		//TODO extract company rating(overall)
		double overallRating = getSpecificRating(responsejson, "overallRating");
		double careerOpportunitiesRating = getSpecificRating(responsejson, "careerOpportunitiesRating");
		double seniorLeadershipRating = getSpecificRating(responsejson, "seniorLeadershipRating");
		double workLifeBalanceRating = getSpecificRating(responsejson, "workLifeBalanceRating");
		double numberOfRatings = getSpecificRating(responsejson, "numberOfRatings");
		
		double rating = overallRating*overallRatingWeightage + careerOpportunitiesRating*careerOpportunitiesRatingWeightage;
		rating += seniorLeadershipRating * seniorLeadershipRatingWeightage;
		double totalOfWeights = overallRatingWeightage + careerOpportunitiesRatingWeightage + seniorLeadershipRatingWeightage;
		if(isCurrentCompany){//Include work-life balance
			rating += workLifeBalanceRating * workLifeBalanceRatingWeightage;
			totalOfWeights += workLifeBalanceRatingWeightage;
		}
		rating /= totalOfWeights;
		if(numberOfRatings < thresholdNumberOfRatings){
			rating *= thresholdCut;
		}
		return rating;
	}
	
	private double getSpecificRating(JsonObject json, String ratingName)
	{
		try{
//			System.out.println("json : \n" + json.getAsJsonObject("response").getAsJsonArray("employers").get(0));
			//TODO get rating from json
			return 3;
		}
		catch(Exception e){return 3;}
	}
	
	public JsonObject getCompanyReviewJson(String companyName)
	{
		String USER_AGENT = "Mozilla/5.0";
		companyName = companyName.toLowerCase();
		JsonObject responsejson = null;
		try{
			//String url = "http://api.glassdoor.com/api/api.htm?t.p=215697&t.k=cJxee9qv39Y&userip=0.0.0.0&useragent=&format=json&v=1&action=employers&q=Nucleus%20Software&location=noida";
			String url = "http://api.glassdoor.com/api/api.htm?t.p=215697&t.k=cJxee9qv39Y&userip=0.0.0.0&useragent=&format=json&v=1&action=employers&q="+companyName;
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	
			// optional default is GET
			con.setRequestMethod("GET");
	
			// add request header
			con.setRequestProperty("User-Agent", USER_AGENT);
	
	//		int responseCode = con.getResponseCode();
			// System.out.println("\nSending 'GET' request to URL : " + url);
			// System.out.println("Response Code : " + responseCode);
	
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			String responseString = response.toString();
			JsonParser parser = new JsonParser();
			responsejson = parser.parse(responseString).getAsJsonObject();
		}
		catch(Exception e){
			//send empty json
			responsejson = loadEmptyJson();
		}
		return responsejson;
	}
	
	public double getCEORating(String companyName)
	{
		JsonObject responsejson = getCompanyReviewJson(companyName);
		double rating = 3;//TODO extract from json
		return rating;
	}
	
	private JsonObject loadEmptyJson()
	{
		System.out.println("Loading local glassdoor file ... ");
		String content;
		JsonObject jsonObject = null;
		try {
			content = new Scanner(new File(localJsonPath)).useDelimiter("\\Z").next();
			System.out.println("local json : \n" + content);//TODO remove this
			JsonParser parser = new JsonParser();
			jsonObject = parser.parse(content).getAsJsonObject();
		} catch (FileNotFoundException e) {
			System.out.println("local glassdoor file could not be loaded");
			e.printStackTrace();
		}
		return jsonObject;
	}

}
