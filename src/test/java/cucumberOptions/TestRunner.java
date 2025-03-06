package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",
        glue = {"stepDefinitions"},
        tags = "@NetBanking",
        plugin = {
                "pretty",                                    // Pretty console output
                "html:target/cucumber-reports/cucumber.html", // Basic HTML report
                  })
public class TestRunner {
}
