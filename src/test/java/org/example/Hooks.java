package org.example;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.net.MalformedURLException;

import static org.example.BasePage.driver;

@Slf4j
public class Hooks {

    DriverManager driverManager = new DriverManager();
    @Before
    public void setUp() throws MalformedURLException {
        driverManager.openBrowser();
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src, "image/png", "screenshot");
        }
        driverManager.closeBrowser();

    }

}
