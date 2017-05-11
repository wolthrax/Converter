package com.bsuir.team.calc.controllers;

import com.bsuir.team.calc.entities.Rate;
import com.bsuir.team.calc.logic.IRequestSender;
import com.bsuir.team.calc.logic.RequestSenderImpl;
import com.bsuir.team.calc.utils.EntityBuilder;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class Controller{

	@FXML
	private TextField сurrency1;
	
	@FXML
	private TextField сurrency2;
	
	private Rate rate;
	
	public void convert(KeyEvent event) throws Exception {
		
		IRequestSender requestSender = new RequestSenderImpl();
		EntityBuilder entityBuilder = new EntityBuilder();
		rate = entityBuilder.rateBuilder(requestSender.getRateByCurID("145"));
		сurrency2.setText(String.valueOf(rate.getCurOfficialRate() * Double.valueOf(сurrency1.getText())));
		
	}
}
