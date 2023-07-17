package org.example;

import org.openqa.selenium.By;

public class PaymentMethod extends Utils{
    private By _creditCard=By.xpath("//input[@id='paymentmethod_1']");
    private By _continue=By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    public void payMethod(){
        waitForElementToBeClickable(_creditCard,10);
        clickOnElement(_creditCard);
        clickOnElement(_continue);
    }
}
