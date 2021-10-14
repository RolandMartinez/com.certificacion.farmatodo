package com.certificacion.ebs.aonmas.interactions;

import com.certificacion.ebs.aonmas.user_interfaces.RegistroPages;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Login implements Interaction{



	@Override
	public <T extends Actor> void performAs(T actor) {

		
if(RegistroPages.POP_UP.resolveFor(actor).isPresent()){
	actor.attemptsTo(Click.on(RegistroPages.POP_UP));
}
actor.attemptsTo(Click.on(RegistroPages.LOGIN),Click.on(RegistroPages.REGISTRATE_AQUI));

	}
	public static Login conElUsuario () {

		return Tasks.instrumented(Login.class);
	}

}
