package com.certificacion.ebs.aonmas.StepDefinitions;



import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

public class Commons {

	@SuppressWarnings("unchecked")
	@Before
	public void init() {
		OnStage.setTheStage(new Cast());
		
	}
	
}
