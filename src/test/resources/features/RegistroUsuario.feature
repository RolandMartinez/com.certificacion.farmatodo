#Author: Roland Martinez
#Company: Farmatodo
#Feature: Registro Usuario
Feature: Verificacion del registro de un usuario en la plataforma de farmatodo

  Background: 
    Given Me autetico en la pagina de farmatodo

  @RegistroUsuario
  Scenario: Verificacion del registro de un usuario en la plataforma de farmatodo
    When ingreso los datos de registro del tercero
      | nombre | apellido | correo                   | contraseña | confirmar contraseña | numero Documento | numero telefono |
      | yurany | cardenas | yuranycardenas@gmail.com | Abrete123  | Abrete123            |          3033916 |      3209528455 |
    And digito codigo de confirmacion
    Then verifico el registro existoso en la plataforma

  @RegistroUsuarioErrorCedula
  Scenario: Verificacion del registro de un usuario donde la cedula ya esta registrada
    When ingreso los datos de registro del tercero
      | nombre | apellido | correo              | contraseña | confirmar contraseña | numero documento | numero telefono |
      | soraya | betancur | soraya123@gmail.com | Abrete123  | Abrete123            |       1069053211 |      3214938670 |
    Then verifico el mensaje para una cedula ya registrada

  @RegistroUsuarioErrortelefono
  Scenario: Verificacion del registro de un usuario donde el telefono ya esta registrada
    When ingreso los datos de registro del tercero
      | nombre | apellido | correo           | contraseña | confirmar contraseña | numero documento | numero telefono |
      | pedro  | cardenas | cata@hotmail.com | Abrete123  | Abrete123            |       1019105702 |      3214938670 |
    Then verifico el mensaje para un telefono ya registrada
