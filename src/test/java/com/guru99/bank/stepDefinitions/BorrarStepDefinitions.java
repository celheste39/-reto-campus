package com.guru99.bank.stepDefinitions;

import com.guru99.bank.driver.SeleniumWebDriver;
import com.guru99.bank.steps.BorrarSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class BorrarStepDefinitions {
    @Steps
    BorrarSteps borrarSteps = new BorrarSteps();

    @Cuando("^voy a eliminar la cuenta de un cliente$")
    public void voyAEliminarLaCuentaDeUnCliente() {
        borrarSteps.eliminacion();
    }
    @Entonces("^ingreso el id de usuario para hacer la eliminacion$")
    public void ingresoElIdDeUsuarioParaHacerLaEliminacion() {
        SeleniumWebDriver.driver.quit();
    }
}
