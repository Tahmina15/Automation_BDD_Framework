package org.example;

import org.openqa.selenium.By;

public class LogInPage extends Utils{
    private By _loginEmail=By.id("Email");
    private By _loginPassword=By.id("Password");
    private By _logInButton =By.xpath("//button[@class='button-1 login-button']");

    public void loginDetails(){
        waitForElementToBeClickable(_loginEmail,10);
        //enter your email address
        typeTextFromElement(_loginEmail,LoadProp.getProperty("completeEmail"));
        //enter password
        typeTextFromElement(_loginPassword,"hd12345");
        //enter log in button
        clickOnElement(_logInButton);

    }

}
