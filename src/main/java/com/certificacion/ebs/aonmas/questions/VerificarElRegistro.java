package com.certificacion.ebs.aonmas.questions;

import com.certificacion.ebs.aonmas.user_interfaces.RegistroPages;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarElRegistro  implements Question<Boolean>{


	@Override
	public Boolean answeredBy(Actor actor) {
		return RegistroPages.VERIFICACION_LOGIN_EXITOSO.resolveFor(actor).isPresent();
		 
	}

	public static VerificarElRegistro Usuario() {
		return new VerificarElRegistro();
	}

}
