package tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:reports/test-report"},
        features = "classpath:test.feature",
        plugin = "html:reports/test-report",
        tags = "@smokeTest")
public class CucumberRunner {
}
