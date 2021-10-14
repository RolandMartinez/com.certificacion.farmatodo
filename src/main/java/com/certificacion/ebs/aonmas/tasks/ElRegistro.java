package com.certificacion.ebs.aonmas.tasks;

import java.util.List;

import com.certificacion.ebs.aonmas.models.InformacionRegistro;
import com.certificacion.ebs.aonmas.user_interfaces.RegistroPages;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ElRegistro  implements Task{

	private  String  nombre ="";
	private  String  apellido ="";
	private  String  correo ="";
	private  String  contraseña ="";
	private  String  confirmarContraseña ="";
	private  String  numeroDocumento ="";
	private  String  numeroTelefono ="";
	
	public ElRegistro(String nombre, String apellido, String correo, String contraseña, String confirmarContraseña,String numeroDocumento,String numeroTelefono) {
		this.nombre =nombre;
		this.apellido =apellido;
		this.correo =correo;
		this.contraseña = contraseña;
		this.confirmarContraseña =confirmarContraseña;
		this.numeroDocumento =numeroDocumento;
		this.numeroTelefono =numeroTelefono;
		
	}
	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Enter.theValue(nombre).into(RegistroPages.NOMBRE),Enter.theValue(apellido).into(RegistroPages.APELLIDO),Enter.theValue(correo).into(RegistroPages.CORREO),
				Enter.theValue(contraseña).into(RegistroPages.CONTRASEÑA),Enter.theValue(confirmarContraseña).into(RegistroPages.CONFIRMAR_CONTRASEÑA));
		
		
		actor.attemptsTo(Enter.theValue(numeroDocumento).into(RegistroPages.NUMERO_DOCUMENTO),Enter.theValue(numeroTelefono).into(RegistroPages.NUMERO_DE_CELULAR));
		
		actor.attemptsTo(Click.on(RegistroPages.GENERO),Click.on(RegistroPages.REGISTRARME));
		
	}
public static ElRegistro delUsuario(List<String>datosConsulta) {
	String nombre =datosConsulta.get(7).trim();
	String apellido =datosConsulta.get(8).trim();
	String correo =datosConsulta.get(9).trim();
	String contraseña =datosConsulta.get(10).trim();
	String confirmarContraseña =datosConsulta.get(11).trim();
	String numeroDocumento =datosConsulta.get(12).trim();
	String numeroTelefono =datosConsulta.get(13).trim();

	
	return Tasks.instrumented(ElRegistro.class, nombre, apellido, correo, contraseña, confirmarContraseña,numeroDocumento,numeroTelefono);
}
}
