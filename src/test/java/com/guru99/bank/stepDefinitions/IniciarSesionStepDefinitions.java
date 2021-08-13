package com.guru99.bank.stepDefinitions;

import com.guru99.bank.steps.IniciarSesionSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import com.guru99.bank.driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;

public class IniciarSesionStepDefinitions {

    //en este caso no tenemos precondiciones,
    //porque el levantamiento del navegador se hace en la clase NewStepDefinitions

    @Steps
    IniciarSesionSteps iniciarSesion = new IniciarSesionSteps();
    //flujo de prueba
    @Cuando("^estoy en la pagina de inicio$")
    public void estoyEnLaPaginaDeInicio() {
        iniciarSesion.login();
    }

    //postcondiciones
    @Entonces("^puedo iniciar sesion de usuario$")
    public void puedoIniciarSesionDeUsuario() {
        SeleniumWebDriver.driver.quit();
    }

}
