package com.bsuir.team.calc.logic;

public interface IRequestSender {

	String getRates() throws Exception;
	String getRateByCurID(String CurID) throws Exception;
	
}
