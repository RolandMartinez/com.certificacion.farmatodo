package com.certificacion.ebs.aonmas.models;

import java.util.List;

public class InformacionRegistro {
	
private static String  NOMBRE ="";
private static String  APELLIDO ="";
private static String  CORREO ="";
private static String  CONTRASEÑA ="";
private static String  CONFIRMAR_CONTRASEÑA ="";
private static String  NUMERO_DE_DOCUMENTO ="";
private static String  NUMERO_DE_TELEFONO ="";



private static void inicializarDatos() {
	NOMBRE ="";	
	 APELLIDO ="";
	 CORREO ="";
	 CONTRASEÑA ="";
	 CONFIRMAR_CONTRASEÑA ="";
	 NUMERO_DE_DOCUMENTO ="";
	 NUMERO_DE_TELEFONO ="";
}
	
public static void setInformacionRegistro(List<String>datosConsulta) {
	inicializarDatos();
	InformacionRegistro.NOMBRE =datosConsulta.get(7).trim();
	InformacionRegistro.APELLIDO =datosConsulta.get(8).trim();
	InformacionRegistro.CORREO =datosConsulta.get(9).trim();
	InformacionRegistro.CONTRASEÑA =datosConsulta.get(10).trim();
	InformacionRegistro.CONFIRMAR_CONTRASEÑA =datosConsulta.get(11).trim();
	InformacionRegistro.NUMERO_DE_DOCUMENTO=datosConsulta.get(12).trim();
	InformacionRegistro.NUMERO_DE_TELEFONO =datosConsulta.get(13).trim();
	
	
}

public static String getNOMBRE() {
	return NOMBRE;
}

public static String getAPELLIDO() {
	return APELLIDO;
}

public static String getCORREO() {
	return CORREO;
}

public static String getCONTRASEÑA() {
	return CONTRASEÑA;
}

public static String getCONFIRMAR_CONTRASEÑA() {
	return CONFIRMAR_CONTRASEÑA;
}

public static String getNUMERO_DE_DOCUMENTO() {
	return NUMERO_DE_DOCUMENTO;
}

public static String getNUMERO_DE_TELEFONO() {
	return NUMERO_DE_TELEFONO;
}
	
	

}
