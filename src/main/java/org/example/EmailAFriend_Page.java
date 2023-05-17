package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;


public class EmailAFriend_Page extends Utils{
    private By _friendsEmail=By.xpath("//input[contains(@id,'FriendEmail')]");
    private By _yourEmail=By.xpath("//input[contains(@id,'YourEmailAddress')]");
    private  By _sendEmail=By.xpath("//button[contains(@name,'send-email')]");
    private By sentSuccessfullyMsg =By.xpath("//div[@class=\"page email-a-friend-page\"]//div[@class=\"result\"]");
   String expectedMsg="Your message has been sent.";
    public void emailAFriendDetails(){
        //enter your friends email
        typeTextFromElement(_friendsEmail,LoadProp.getProperty("FriendEmail"));
        //click on send email button
         clickOnElement(_sendEmail);
        //sent successfully message should appear
        Assert.assertEquals(getTextFromElement(sentSuccessfullyMsg),expectedMsg);
    }


    }

