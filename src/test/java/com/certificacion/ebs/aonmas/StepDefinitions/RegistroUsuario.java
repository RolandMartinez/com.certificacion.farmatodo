package com.certificacion.ebs.aonmas.StepDefinitions;

import java.util.List;

import org.mockito.internal.matchers.Equals;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import com.certificacion.ebs.aonmas.interactions.DigitarCodigo;
import com.certificacion.ebs.aonmas.interactions.Login;
import com.certificacion.ebs.aonmas.models.InformacionRegistro;
import com.certificacion.ebs.aonmas.questions.VerificacionCaso;
import com.certificacion.ebs.aonmas.questions.VerificacionCelular;
import com.certificacion.ebs.aonmas.questions.VerificarElRegistro;
import com.certificacion.ebs.aonmas.tasks.ElRegistro;
import com.ibm.icu.impl.LocaleDisplayNamesImpl.DataTable;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import static org.hamcrest.Matchers.equalTo;

public class RegistroUsuario {

	@Managed(driver = "chrome")
	private WebDriver browser;

	Actor Roland = Actor.named("Roland");



	@Given("^Me autetico en la pagina de farmatodo$")
	public void meAuteticoEnLaPaginaDeFarmatodo() {
		Roland.can(BrowseTheWeb.with(browser));
		
		Roland.wasAbleTo(Open.url("https://www.farmatodo.com.co"));

	}


	@When("^ingreso los datos de registro del tercero$")
	public void ingresoLosDatosDeRegistroDelTercero(List<String>datosConsulta) {

		InformacionRegistro.setInformacionRegistro(datosConsulta);
		Roland.attemptsTo(Login.conElUsuario());
		Roland.attemptsTo(ElRegistro.delUsuario(datosConsulta));
		
		
		
	}
	@And("^digito codigo de confirmacion$")
	public void digitocodigoDeConfirmacion() {

Roland.attemptsTo(DigitarCodigo.SMS());
		
		
	}
	

	@Then("^verifico el registro existoso en la plataforma$")
	public void verificoElRegistroExistosoEnLaPlataforma() {
		

Roland.should(GivenWhenThen.seeThat(VerificarElRegistro.Usuario()));
	}
	
	@Then("^verifico el mensaje para una cedula ya registrada$")
	public void verificoElMensajeParaUnacedulaYaRegistrada() {
		Roland.should(GivenWhenThen.seeThat(VerificacionCaso.fallido()));

	}
	
	@Then("^verifico el mensaje para un telefono ya registrada$")
	public void verificoElMensajeParaUnTelefonoYaRegistrada() {

		Roland.should(GivenWhenThen.seeThat(VerificacionCelular.fallido(), equalTo("El número celular esta asignado a otro usuario")));
	
		
	}

}
