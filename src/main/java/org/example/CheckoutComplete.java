package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckoutComplete extends Utils{
    private By _orderNumber=By.xpath("//div[@class=\"order-number\"]");


    private By _successfullyMessage=By.xpath("//div[@class='section order-completed']//div[@class='title']");
    String expectedConfirmMessage="Your order has been successfully processed!";
    public void checkoutConfirmation(){
        System.out.println("ORDER NUMBER: 1034");
        System.out.println("Expected msg:Your order has been successfully processed!");
        waitForElementToBeVisible(_successfullyMessage,10);
        Assert.assertEquals(getTextFromElement(_successfullyMessage),expectedConfirmMessage);
    }
}
