package com.guru99.bank.steps;

import com.guru99.bank.pageObjects.EditarPageObjects;

public class EditarSteps {
    IniciarSesionSteps objeto = new IniciarSesionSteps();

    public void editar(){
        //iniciamos sesion
        objeto.login();
        //igresamos el id de cliente
        objeto.seleccionClick(EditarPageObjects.getBtnEdit());
        objeto.escrituraTexto(EditarPageObjects.getTxtID(),"5670");
        //editamos el campo deseado
        objeto.seleccionClick(EditarPageObjects.getBtnSubmit());
        objeto.escrituraTexto(EditarPageObjects.getTxtState(),"Florida");
        objeto.seleccionClick(EditarPageObjects.getBtnSubmit());
    }
}
