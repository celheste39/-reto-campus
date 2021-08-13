package com.guru99.bank.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //aqui seleccionamos la herramienta de ejecucion de pruebas
@CucumberOptions(
        features = "src/test/resources/features/Registro.feature", //ruta del escenario de prueba
        glue = "com/guru99/bank/stepDefinitions", //ruta de nuestros stepsDefinitions donde llamamos los metodos de la prueba
        snippets = SnippetType.CAMELCASE) //pone en mayuscula la primera letra de cada palabra en stepDefinitions
public class NewRunner {
}