package com.sin.xyzbank.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.sin.xyzbank.steps", "com.sin.xyzbank.core"},
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber-report.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        monochrome = true
)
public class AccountNumberMatchTestRunner extends AbstractTestNGCucumberTests {
}
