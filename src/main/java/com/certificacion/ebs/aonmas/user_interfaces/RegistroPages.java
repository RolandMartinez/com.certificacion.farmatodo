package com.certificacion.ebs.aonmas.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegistroPages {
	
	
	public static  final Target POP_UP =Target.the("Pop Up")
			.locatedBy("//*[@id='banner']");

	public static  final Target LOGIN =Target.the("Login")
			.locatedBy("//*[contains(text(),'Inicia sesión')]");
	
	public static  final Target REGISTRATE_AQUI =Target.the("Registrate aqui")
			.locatedBy("//*[@id='login-open-sign-up']");
	
	public static  final Target NOMBRE =Target.the("Nombre")
			.locatedBy("//*[@id='sign-up-name']");
	
	public static  final Target APELLIDO =Target.the("Apellido")
			.locatedBy("//*[@id='sign-up-last-name']");
	
	public static  final Target CORREO =Target.the("Correo")
			.locatedBy("//*[@id='sign-up-email']");
	
	public static  final Target CONTRASEÑA =Target.the("Contraseña")
			.locatedBy("//*[@id='sign-up-password']");
	
	public static  final Target CONFIRMAR_CONTRASEÑA =Target.the("Confirmar Contraseña")
			.locatedBy("//*[@id='sign-up-confirm-password']");

	public static  final Target NUMERO_DOCUMENTO =Target.the("Numero de documento")
			.locatedBy("//*[@id='sign-up-document-number']");
	
	public static  final Target NUMERO_DE_CELULAR =Target.the("Numero de celular")
			.locatedBy("//*[@id='sign-up-phone']");
	
	public static  final Target GENERO =Target.the("Genero")
			.locatedBy("//*[@id='sign-up-male']");
	
	public static  final Target REGISTRARME =Target.the("Registrarme")
			.locatedBy("//*[@id='sign-up-validate-customer']");
	
	public static  final Target CODIGO_DE_VERIFICACION =Target.the("Registrarme")
			.locatedBy("//*[@id='sign-up-validate-phone-token']");

	
	public static  final Target MENSAJE_ERROR =Target.the("registro fallido")
			.locatedBy("//*[@id='sign-up-general-error-message']");
	
	public static  final Target VERIFICACION_LOGIN_EXITOSO =Target.the("Verificacion login exitoso")
			.locatedBy("//*[@id='customer-profile-menu-option-pSrofile']");
	
	public static  final Target RE_INGRESO =Target.the("RE ingreso")
			.locatedBy("//*[@id='nav-bar-profile-redirect']");
	
	public static  final Target VERIFICACION_CODIGO =Target.the("Verificacion codigo")
			.locatedBy("//*[@id='sign-up-validate-phone-validate']");
	
	public static  final Target CUENTA =Target.the("Cuenta")
			.locatedBy("//*[@id='nav-bar-menu-option-profile']/b");
	
	
	
	
}

