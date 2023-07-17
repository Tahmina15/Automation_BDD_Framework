package org.example;

import org.openqa.selenium.By;

public class CheckOutAsAGuest extends Utils{
    private By _selectGuest=By.xpath("//button[@class='button-1 checkout-as-guest-button']");
    public void checkOutAsAGuest(){
        waitForElementToBeClickable(_selectGuest,10);
        clickOnElement(_selectGuest);

    }
}
