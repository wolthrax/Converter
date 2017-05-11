package com.bsuir.team.calc.utils;

import com.bsuir.team.calc.entities.Rate;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class EntityBuilder {

	public Rate rateBuilder(String json){
		JsonParser parser = new JsonParser();
		JsonObject mainObject = parser.parse(json).getAsJsonObject();
		
		Rate rate = new Rate();
		rate.setCurID(mainObject.get("Cur_ID").getAsLong());
		rate.setDate(mainObject.get("Date").getAsString());
		rate.setCurAbbreviation(mainObject.get("Cur_Abbreviation").getAsString());
		rate.setCurScale(mainObject.get("Cur_Scale").getAsInt());
		rate.setCurName(mainObject.get("Cur_Name").getAsString());
		rate.setCurOfficialRate(mainObject.get("Cur_OfficialRate").getAsDouble());
		
		return rate;
	}
}
