package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegisterPage extends Utils{
    private By _firstName =By.id("FirstName");
    private By _lastName =By.id("LastName");
    private By _email=By.name("Email");
    private By _Password=By.id("Password");
    private By _confirmPassword =By.id("ConfirmPassword");
    private By _birthDate=By.xpath("//select[@name='DateOfBirthDay']");
    private By _birthMonth=By.xpath("//select[@name='DateOfBirthMonth']");
    private By _birthYear=By.xpath("//select[@name='DateOfBirthYear']");
    private By _RegisterButton=By.cssSelector("button#register-button");

    public void registerDetailsForReferAProduct(){
        //type first name
        typeTextFromElement(_firstName,LoadProp.getProperty("Firstname"));
        //type last name
        typeTextFromElement(_lastName,LoadProp.getProperty("Lastname"));
        //select birthdate
        selectFromDropdownVisibleText(_birthDate,LoadProp.getProperty("DateOfBirth"));
        //select birth Month
        selectFromDropdownVisibleText(_birthMonth,LoadProp.getProperty("MonthOfBirth"));
        //select birth month
        selectFromDropdownVisibleText(_birthYear,LoadProp.getProperty("BirthYear"));
        //type you email-address
        typeTextFromElement(_email,LoadProp.getProperty("completeEmail"));
        //enter password
        typeTextFromElement(_Password,LoadProp.getProperty("password"));
        //enter confirm password
        typeTextFromElement(_confirmPassword,LoadProp.getProperty("password"));
        //click on register button
        clickOnElement(_RegisterButton);

    }
    public void registerDetails(){
        //type first name
        typeTextFromElement(_firstName,LoadProp.getProperty("Firstname"));
        //type last name
        typeTextFromElement(_lastName,LoadProp.getProperty("Lastname"));
        //select birthdate
        selectFromDropdownVisibleText(_birthDate,LoadProp.getProperty("DateOfBirth"));
        //select birth Month
        selectFromDropdownVisibleText(_birthMonth,LoadProp.getProperty("MonthOfBirth"));
        //select birth month
        selectFromDropdownVisibleText(_birthYear,LoadProp.getProperty("BirthYear"));
        //type you email-address
        typeTextFromElement(_email,LoadProp.getProperty("email")+timeStamp()+LoadProp.getProperty("email_Domain"));
        //enter password
        typeTextFromElement(_Password,LoadProp.getProperty("password"));
        //enter confirm password
        typeTextFromElement(_confirmPassword,LoadProp.getProperty("password"));
        //click on register button
        clickOnElement(_RegisterButton);

    }



}
