package com.guru99.bank.steps;

import com.guru99.bank.driver.SeleniumWebDriver;
import com.guru99.bank.pageObjects.IniciarSesionPageObjects;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class IniciarSesionSteps {
    //método que escribe sobre un campo de texto
    public void escrituraTexto(By elemento, String texto) {
        SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto);
    }
    //método que da click
    public void seleccionClick(By elemento) {
        SeleniumWebDriver.driver.findElement(elemento).click();
    }

    //automatización del flujo de inicio de sesión
    @Step
    public void login(){
        //ingresamos el nombre de usuario y contraseña
        escrituraTexto(IniciarSesionPageObjects.getTxtUserID(),"mngr346806");
        escrituraTexto(IniciarSesionPageObjects.getTxtPassword(),"pudYnyd");

        //Espera implicita de 2 segundos
        SeleniumWebDriver.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        //Click en boton Login
        seleccionClick(IniciarSesionPageObjects.getBtnLogin());
    }
}
