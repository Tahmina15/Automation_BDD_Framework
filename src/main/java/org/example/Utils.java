    package org.example;
    import org.apache.commons.io.FileUtils;


    import org.openqa.selenium.By;
    import org.openqa.selenium.OutputType;
    import org.openqa.selenium.TakesScreenshot;
    import org.openqa.selenium.support.ui.ExpectedConditions;
    import org.openqa.selenium.support.ui.Select;
    import org.openqa.selenium.support.ui.WebDriverWait;

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
        public static String getCurrentUrl() {
            return driver.getCurrentUrl();
        }

        //method for timestamp to use mail multiple time
        public static long timeStamp() {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            return timestamp.getTime();
        }



        //method for waiting until click
        public static void waitForElementToBeClickable(By by, int duration) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
            wait.until(ExpectedConditions.elementToBeClickable(by));

        }
         //method for waiting until the element visible
        public static void waitForElementToBeVisible( By by,int duration) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));

        }
        //method for wait before the element invisible
        public static void waitForInvisibleElement(By by, int duration) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
        }

        //method for select option from dropdown by text
        public static void selectFromDropdownVisibleText(By by, String text) {
            Select dropdown = new Select(driver.findElement(by));
            dropdown.selectByVisibleText(text);
        }
        //method for select option from dropdown by value
        public static void selectFromDropdownValue(By by, String value) {
            Select dropDown = new Select(driver.findElement(by));
            dropDown.selectByValue(value);
        }
        //method for select option from dropdown by index
        public static void SelectFromDropdownIndex(By by, int index) {
            Select select = new Select(driver.findElement(by));
            select.selectByIndex(index);
        }
       // method for timestamp to reuse the mail
        public static String currentTimeStamp(){
            Date date = new Date();
            SimpleDateFormat sdf =new SimpleDateFormat("ddMMyymmss");
            return sdf.format(date);
        }


    //method for taking screenshot when test fail
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
