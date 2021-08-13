package com.guru99.bank.pageObjects;

import org.openqa.selenium.By;

public class EditarPageObjects {
    //mapeo de localizadores
    private static By btnEdit = By.xpath("//a[@href='EditCustomer.php']");
    private static By txtID = By.xpath("//input[@name='cusid']");
    private static By btnSubmit = By.xpath("//input[@type='submit']");
    private static By txtState = By.xpath("//input[@name='state']");

    //declaración de getters para el llamado de los localizadores
    public static By getBtnEdit() {
        return btnEdit;
    }
    public static By getTxtID() {
        return txtID;
    }
    public static By getBtnSubmit() {
        return btnSubmit;
    }
    public static By getTxtState() {
        return txtState;
    }
}
