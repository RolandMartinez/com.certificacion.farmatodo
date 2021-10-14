package com.certificacion.ebs.aonmas.questions;

import com.certificacion.ebs.aonmas.user_interfaces.RegistroPages;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificacionCaso implements Question<Boolean>{

	
	@Override
	public Boolean answeredBy(Actor actor) {
		return  RegistroPages.MENSAJE_ERROR.resolveFor(actor).isPresent();
	}

	public static VerificacionCaso fallido() {
		return new VerificacionCaso();
	}


}
