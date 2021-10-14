package com.certificacion.ebs.aonmas.questions;

import com.certificacion.ebs.aonmas.user_interfaces.RegistroPages;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificacionCelular implements Question<String>{
private String mensaje;
	@Override
	public String answeredBy(Actor actor) {
	
		return mensaje =Text.of(RegistroPages.MENSAJE_ERROR).viewedBy(actor).asString();
		
	}
public static VerificacionCelular fallido() {
	return new VerificacionCelular();
}
}
