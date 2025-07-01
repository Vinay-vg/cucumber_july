package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/feature",
    glue = "cucumber",
    plugin = {"pretty", "html:target/HtmlReports/report.html",
    		"pretty","junit:target/Junitreports/report.xml",
    		"pretty","json:target/JsonReports/report.json"},
            
    monochrome = true
)
public class testrunner {

}
