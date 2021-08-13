package com.guru99.bank.pageObjects;

import org.openqa.selenium.By;

public class IniciarSesionPageObjects {
    //mapeo de localizadores, en este caso solo utilizo xpath
    private static By txtUserID = By.xpath("//input[@name='uid']");
    private static By txtPassword = By.xpath("//input[@name='password']");
    private static By btnLogin = By.xpath("//input[@name='btnLogin']");

    //declaración de getters para el llamado de los localizadores
    public static By getTxtUserID() {
        return txtUserID;
    }
    public static By getTxtPassword() {
        return txtPassword;
    }
    public static By getBtnLogin() {
        return btnLogin;
    }
}
