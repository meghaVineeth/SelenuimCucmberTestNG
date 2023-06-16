package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Resources/Features",
        glue = "StepDefinitions",
        monochrome = true,
//        plugin = {"pretty","html:target/htmlReports/reports.html"},
//        plugin = {"pretty","json:target/jsonReports/reports.json"},
        plugin = {"pretty","junit:target/junitReports/reports.xml"},
        tags = "@smokescenario"
)


public class TestRunner {

}
