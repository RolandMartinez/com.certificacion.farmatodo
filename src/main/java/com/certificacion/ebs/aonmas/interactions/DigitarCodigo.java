package com.certificacion.ebs.aonmas.interactions;

import javax.swing.JOptionPane;

import com.certificacion.ebs.aonmas.user_interfaces.RegistroPages;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DigitarCodigo implements Interaction{

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		
		String codigoOTP = JOptionPane.showInputDialog("Digite Codigo OTP");
		
		actor.attemptsTo(Enter.theValue(codigoOTP).into(RegistroPages.CODIGO_DE_VERIFICACION));
		actor.attemptsTo(Click.on(RegistroPages.VERIFICACION_CODIGO));
		actor.attemptsTo(TimeImplicito.enTheApp());
		if(RegistroPages.POP_UP.resolveFor(actor).isPresent()){
			actor.attemptsTo(Click.on(RegistroPages.POP_UP));
		}
		actor.attemptsTo(TimeImplicito.enTheApp());
		if(RegistroPages.RE_INGRESO.resolveFor(actor).isPresent()) {
			actor.attemptsTo(Click.on(RegistroPages.RE_INGRESO));
			actor.attemptsTo(Click.on(RegistroPages.CUENTA));
			
		}
	}
	public static DigitarCodigo SMS() {
		return Tasks.instrumented(DigitarCodigo.class);
	}

}
