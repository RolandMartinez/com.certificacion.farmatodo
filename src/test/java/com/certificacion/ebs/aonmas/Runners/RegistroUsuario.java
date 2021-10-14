package com.certificacion.ebs.aonmas.Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= "src/test/resources/features/RegistroUsuario.feature",
glue ="",
snippets = SnippetType.CAMELCASE,
tags = "@RegistroUsuarioErrortelefono"
)

public class RegistroUsuario {

}
