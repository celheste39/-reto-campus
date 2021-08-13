package com.guru99.bank.stepDefinitions;

import com.guru99.bank.driver.SeleniumWebDriver;
import com.guru99.bank.steps.EditarSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.E;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class EditarStepDefinitions {

    @Steps
    EditarSteps editarSteps = new EditarSteps();

    @Cuando("^quiero editar un cliente$")
    public void quieroEditarUnCliente() {
        editarSteps.editar();
    }

    @Entonces("^ingreso el id de usuario para hacer la modificacion$")
    public void ingresoElIdDeUsuarioParaHacerLaModificacion() {
        SeleniumWebDriver.driver.quit();
    }

}
