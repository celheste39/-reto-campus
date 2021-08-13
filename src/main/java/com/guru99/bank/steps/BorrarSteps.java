package com.guru99.bank.steps;

import com.guru99.bank.pageObjects.BorrarPageObjects;


public class BorrarSteps {
    IniciarSesionSteps objeto = new IniciarSesionSteps();

    public void eliminacion(){
        objeto.login();
        objeto.seleccionClick(BorrarPageObjects.getBtnDelete());
        objeto.escrituraTexto(BorrarPageObjects.getTxtID(),"5670");
        objeto.seleccionClick(BorrarPageObjects.getBtnSubmit());
    }
}
