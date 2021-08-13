package com.guru99.bank.pageObjects;

import org.openqa.selenium.By;

public class BorrarPageObjects {
    private static By btnDelete = By.xpath("//a[@href='DeleteCustomerInput.php']");
    private static By txtID = By.xpath("//input[@name='cusid']");
    private static By btnSubmit = By.xpath("//input[@type='submit']");

    public static By getBtnDelete() {
        return btnDelete;
    }
    public static By getTxtID() {
        return txtID;
    }
    public static By getBtnSubmit() {
        return btnSubmit;
    }
}
