package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager extends Utils {
 public void openBrowser(){
     String browserName = LoadProp.getProperty("browser");

         if (browserName.equalsIgnoreCase("Chrome")) {
             driver = new ChromeDriver();
         } else if (browserName.equalsIgnoreCase("Edge")) {
             driver = new EdgeDriver();

         } else if (browserName.equalsIgnoreCase("Firefox")) {
             driver = new FirefoxDriver();

         } else {
             System.out.println("Your browser name is wrong or not implemented: " + browserName);
}
     //maximize the window
     driver.manage().window().maximize();
     //type Url
     driver.get(LoadProp.getProperty("Url"));
     //apply the implicitly wait
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 }
 public void closeBrowser(){
     //close the browser
     driver.close();
 }


}
