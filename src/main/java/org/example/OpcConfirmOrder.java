package org.example;

import org.openqa.selenium.By;

public class OpcConfirmOrder extends Utils{
    //locator for confirm button
    private By _confirm=By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
    public void confirmOrder(){
        //click on confirm button
        waitForElementToBeClickable(_confirm,10);
        clickOnElement(_confirm);
    }
}
