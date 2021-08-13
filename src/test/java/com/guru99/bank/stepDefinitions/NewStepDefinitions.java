package com.guru99.bank.stepDefinitions;

//llamado de librerias
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import com.guru99.bank.driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import com.guru99.bank.steps.NewSteps;

public class NewStepDefinitions {
    //declaración de objeto para invocar métodos de su clase
    @Steps
    NewSteps newSteps = new NewSteps();

    //precondiciones
    @Dado("^que me encuentro en el sitio web http://demo\\.guru(\\d+)\\.com/V(\\d+)/index\\.php$")
    public void queMeEncuentroEnElSitioWebHttpDemoGuruComVIndexPhp(int arg1, int arg2) {

        //invocacion de la clase donde levantamos el navegador web
        SeleniumWebDriver.chromeDrive("http://demo.guru99.com/V4/index.php");
    }
    //flujo de prueba
    @Cuando("^quiero registrarme en la pagina$")
    public void quieroRegistrarmeEnLaPagina() {

        //invocación del método del flujo de registro
        newSteps.registro();
    }
    //postcondicones
    @Entonces("^ingreso mis datos para crear la cuenta$")
    public void ingresoMisDatosParaCrearLaCuenta() {

        //método de las librerías de Selenium que permite cerrar el navegador
        SeleniumWebDriver.driver.quit();
    }
}
