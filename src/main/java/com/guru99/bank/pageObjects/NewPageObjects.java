package com.guru99.bank.pageObjects;

import org.openqa.selenium.By;

public class NewPageObjects {

    //mapeo de localizadores, en este caso solo utilizo xpath
    private static By btnNewCustomer = By.xpath("//a[@href='addcustomerpage.php']");
    private static By txtCustomerName = By.xpath("//input[@onkeyup='validatecustomername();']");
    private static By txtFecha = By.xpath("//input[@id='dob']");
    private static By txtAddress = By.xpath("//textarea[@rows='5']");
    private static By txtCity = By.xpath("//input[@name='city']");
    private static By txtState = By.xpath("//input[@name='state']");
    private static By txtPin = By.xpath("//input[@name='pinno']");
    private static By txtTeleofono = By.xpath("//input[@name='telephoneno']");
    private static By txtEmail = By.xpath("//input[@name='emailid']");
    private static By txtPassword = By.xpath("//input[@name='password']");
    private static By btnSubmit = By.xpath("//input[@type='submit']");

    //declaración de getters para el llamado de los localizadores
    public static By getBtnNewCustomer() {
        return btnNewCustomer;
    }
    public static By getTxtCustomerName() {
        return txtCustomerName;
    }
    public static By getTxtFecha() {
        return txtFecha;
    }
    public static By getTxtAddress() {
        return txtAddress;
    }
    public static By getTxtCity() {
        return txtCity;
    }
    public static By getTxtState() {
        return txtState;
    }
    public static By getTxtPin() {
        return txtPin;
    }
    public static By getTxtTeleofono() {
        return txtTeleofono;
    }
    public static By getTxtEmail() {
        return txtEmail;
    }
    public static By getTxtPassword() {
        return txtPassword;
    }
    public static By getBtnSubmit() {
        return btnSubmit;
    }
}
