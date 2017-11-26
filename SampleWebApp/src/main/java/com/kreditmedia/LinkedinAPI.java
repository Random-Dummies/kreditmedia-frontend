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

public class LinkedinAPI {

	static String localJsonPath = "C:/Users/rishabh.srivastava/Desktop/Nuc/linkedin-bio.txt";
	
	//Returns bio from linkedin-id
	//If there is a connection failure, local file is loaded
	public String getLinkedinDetails(String linkedinUrl)
	{
	
		String USER_AGENT = "Mozilla/5.0";
		try{
			URL obj = new URL(linkedinUrl);
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
			JsonObject responsejson = parser.parse(responseString).getAsJsonObject();
			//Need to correct this line
			System.out.println("bio: : " + responsejson.get("headline"));
			return responsejson.get("headline").toString();
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Failed to connect to linkedin");
			return loadLocalFile(); 
		}
	}
	
	private String loadLocalFile()
	{
		System.out.println("Loading local linkedin file ... ");
		String content = null;
		try {
			content = new Scanner(new File(localJsonPath)).useDelimiter("\\Z").next();
		} catch (FileNotFoundException e) {
			System.out.println("local glassdoor file could not be loaded");
			e.printStackTrace();
		}
		return content;
	}
}
