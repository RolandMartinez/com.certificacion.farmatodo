package com.certificacion.ebs.aonmas.interactions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class TimeImplicito implements Interaction{

	@Override
	public <T extends Actor> void performAs(T actor) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	public static TimeImplicito enTheApp() {
		return Tasks.instrumented(TimeImplicito.class);
	}

}
