package org.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",tags = "@checkout", plugin = {"pretty", "html:target/cucumber-html-report.html"})
public class RunCuke {
}
