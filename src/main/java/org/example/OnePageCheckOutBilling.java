package org.example;

import org.openqa.selenium.By;

public class OnePageCheckOutBilling extends Utils{
    private By _firstName=By.id("BillingNewAddress_FirstName");
    private By _LastName=By.id("BillingNewAddress_LastName");
    private By _email=By.id("BillingNewAddress_Email");
    private By _selectCountry=By.id("BillingNewAddress_CountryId");
    private By _state=By.id("BillingNewAddress_StateProvinceId");
    private By _city=By.id("BillingNewAddress_City");
    private By _address=By.id("BillingNewAddress_Address1");
    private By _postCode=By.id("BillingNewAddress_ZipPostalCode");
    private By _phone=By.id("BillingNewAddress_PhoneNumber");
    private By _continueButton=By.xpath("//div[@id='billing-buttons-container']//button[@class='button-1 new-address-next-step-button']");


    public void checkOut(){
        typeTextFromElement(_firstName,"Liyo");
        typeTextFromElement(_LastName,"Bar");
        typeTextFromElement(_email,"abcd12"+timeStamp()+"@gmail.com");
        selectFromDropdownVisibleText(_selectCountry,"Australia");
        typeTextFromElement(_state,"kinbury");
        typeTextFromElement(_city,"Barmingham");
        typeTextFromElement(_address,"56 NorthGreen");
        typeTextFromElement(_postCode,"bh68bq");
        typeTextFromElement(_phone,"897346592354");
        waitForElementToBeClickable(_continueButton,10);
        clickOnElement(_continueButton);

    }
}
