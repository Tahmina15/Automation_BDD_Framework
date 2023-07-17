package org.example;

import org.openqa.selenium.By;

public class ShippingMethod extends Utils{
    private By _nextDayShipping=By.id("shippingoption_1");
    private By _keepContinue=By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    public void checkOut(){
        waitForElementToBeClickable(_nextDayShipping,10);
        clickOnElement(_nextDayShipping);
        clickOnElement(_keepContinue);
    }
}
