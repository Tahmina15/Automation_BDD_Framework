package org.example;

import org.openqa.selenium.By;

public class OpcPaymentInfo extends Utils{
    private By _cardType=By.id("CreditCardType");
    private By _cardholderName=By.id("CardholderName");
    private By _cardNumber=By.id("CardNumber");
    private By _expiryDate=By.id("ExpireMonth");
    private By _expiryYear=By.id("ExpireYear");
    private By _cardCode=By.xpath("//input[@name='CardCode']");
    private By _continueNext=By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    public void checkOutPaymentInfo(){
        waitForElementToBeClickable(_cardType,10);
        selectFromDropdownVisibleText(_cardType,"Visa");
        typeTextFromElement(_cardholderName,"Hasfi");
        waitForElementToBeClickable(_cardNumber,10);
        typeTextFromElement(_cardNumber,"4024007193644126");
        selectFromDropdownValue(_expiryDate,"5");
        selectFromDropdownValue(_expiryYear,"2028");
        typeTextFromElement(_cardCode,"327");
        clickOnElement(_continueNext);
    }




}
