package com.guru99.bank.steps;

import com.guru99.bank.driver.SeleniumWebDriver;
import com.guru99.bank.pageObjects.NewPageObjects;
import net.thucydides.core.annotations.Step;

import java.util.concurrent.TimeUnit;

public class NewSteps {
    /*creamos un objeto que instancia la clase RegistroSteps
     * para invocar los metodos de escribir y dar click*/
    IniciarSesionSteps objeto = new IniciarSesionSteps();

    //automatización del flujo de registro
    @Step
    public void registro(){
        //invocamos el inicio de sesión
        objeto.login();

        //click en la opcion del menu
        objeto.seleccionClick(NewPageObjects.getBtnNewCustomer());

        //llenamos los campos del formulario
        objeto.escrituraTexto(NewPageObjects.getTxtCustomerName(),"Nombre");
        objeto.escrituraTexto(NewPageObjects.getTxtFecha(),"572024");
        objeto.escrituraTexto(NewPageObjects.getTxtAddress(),"dir48546544");
        objeto.escrituraTexto(NewPageObjects.getTxtCity(),"Los Angeles");
        objeto.escrituraTexto(NewPageObjects.getTxtState(),"California");
        objeto.escrituraTexto(NewPageObjects.getTxtPin(),"777777");
        objeto.escrituraTexto(NewPageObjects.getTxtTeleofono(),"3338883399");
        objeto.escrituraTexto(NewPageObjects.getTxtEmail(),"correo@sqasa.co");
        objeto.escrituraTexto(NewPageObjects.getTxtPassword(),"kUyrrty8**/1354");

        //click en el boton que envia el formulario
        objeto.seleccionClick(NewPageObjects.getBtnSubmit());
    }


}
