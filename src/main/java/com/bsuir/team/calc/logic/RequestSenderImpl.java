package com.bsuir.team.calc.logic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RequestSenderImpl implements IRequestSender {

	public String getRates() throws Exception {
		String url = "http://www.nbrb.by/API/ExRates/Rates/145";

	    URL obj = new URL(url);
	    HttpURLConnection con = (HttpURLConnection) obj.openConnection();

	    // optional default is GET
	    con.setRequestMethod("GET");

	    //add request header
	    //con.setRequestProperty("User-Agent", USER_AGENT);

	    BufferedReader in = new BufferedReader(
	            new InputStreamReader(con.getInputStream()));
	    String inputLine;
	    StringBuffer response = new StringBuffer();

	    while ((inputLine = in.readLine()) != null) {
	        response.append(inputLine);
	    }
	    in.close();
	    
	    return response.toString();
	}

	@Override
	public String getRateByCurID(String CurID) throws Exception {
		String url = "http://www.nbrb.by/API/ExRates/Rates/"+ CurID;

	    URL obj = new URL(url);
	    HttpURLConnection con = (HttpURLConnection) obj.openConnection();

	    // optional default is GET
	    con.setRequestMethod("GET");

	    //add request header
	    //con.setRequestProperty("User-Agent", USER_AGENT);

	    BufferedReader in = new BufferedReader(
	            new InputStreamReader(con.getInputStream()));
	    String inputLine;
	    StringBuffer response = new StringBuffer();

	    while ((inputLine = in.readLine()) != null) {
	        response.append(inputLine);
	    }
	    in.close();
	    
	    return response.toString();
	}
}
