package org.example;
import org.apache.commons.io.FileUtils;


import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Utils extends BasePage{


    //method for click on elements
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    //method for typing text
    public static void typeTextFromElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    //method to get message
    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    //method for get URL
    public static String getUrl(By by) {
        return driver.getCurrentUrl();
    }

    //method for timestamp to use mail multiple time
    public static long timeStamp() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();
    }



    //method for waiting
    public static void waitForElementToBeClickable(By by, int duration) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.elementToBeClickable(by));

    }

    public static void waitForElementToBeVisible(By by, int duration) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }

    public static void waitForInvisibleElement(By by, int duration) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    //method for select option from dropdown
    public static void selectFromDropdownVisibleText(By by, String text) {
        Select dropdown = new Select(driver.findElement(by));
        dropdown.selectByVisibleText(text);
    }

    public static void selectFromDropdownValue(By by, String value) {
        Select dropDown = new Select(driver.findElement(by));
        dropDown.selectByValue(value);
    }

    public static void SelectFromDropdownIndex(By by, int index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }
    public static String currentTimeStamp(){
        Date date = new Date();
        SimpleDateFormat sdf =new SimpleDateFormat("ddMMyymmss");
        return sdf.format(date);
    }



    public static void captureScreenshot(String fileName) {
        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot
                = ((TakesScreenshot) driver);
        //Call getScreenshotAs method to create image file
        File
                SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        //Move image file to new destination
        File destFile = new
                File("src\\test\\Screenshots\\" + fileName + "" + currentTimeStamp()+".png");

        //Copy file at destination
        try
        {
            FileUtils.copyFile(SrcFile, destFile);
        }
        catch (IOException e)
        {
            e.printStackTrace();


        }


    }
}
