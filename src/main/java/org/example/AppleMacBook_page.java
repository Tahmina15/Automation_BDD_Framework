package org.example;

import org.openqa.selenium.By;

public class AppleMacBook_page extends Utils{
    private By _emailAFriendButton=By.xpath("//div[@class=\"overview-buttons\"]/div[3]");

    public void emailAFriend(){
        //click on email a friend button
        clickOnElement(_emailAFriendButton);
    }
}
