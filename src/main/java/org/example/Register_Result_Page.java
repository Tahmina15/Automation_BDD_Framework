package org.example;


import org.openqa.selenium.By;
import org.testng.Assert;

public class Register_Result_Page extends Utils{

    private By _result=By.className("result");

    //registration successfully message
    String expectedMessage="Your registration completed";
    public void registerResult(){
        //verify the expected message
        Assert.assertEquals(getTextFromElement(_result),expectedMessage);

    }
    private By _continueButton=By.xpath("//a[@class='button-1 register-continue-button']");
    //click on continue button after registration completed
    public void continueAfterRegistration(){
        waitForElementToBeClickable(_continueButton,20);
        clickOnElement(_continueButton);

    }


}
