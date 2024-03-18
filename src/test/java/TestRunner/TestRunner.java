package TestRunner;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
//features= {".//Features/"},
//		features = { ".//src/test/resources/Features/smoke.feature" },
		features = { ".//src/test/resources/Features/ZigWheels.feature" },
//		features = {".//src/test/resources/Features/Regression.feature" },
		glue = "com.zigwheels.StepDefinition", plugin = { "pretty", "html:reports/myreport.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },

		dryRun = false, // checks mapping between scenario steps and step definition methods
		monochrome = true, // to avoid junk characters in output
		publish = true // to publish report in cucumber server
//tags="@Smoke" // this will execute scenarios tagged with @smoke
//		tags = "@Regression"
//tags="@Smoke and @Regression" //Scenarios tagged with both @smoke and @regression
//tags="@Smoke and not @Regression" //Scenarios tagged with @smoke but not @Regression
)

//extending the functionality provided by AbstractTestNGCucumberTests to run Cucumber tests with TestNG
//Abstract TestNG Cucumber Test Runs each cucumber scenario found in the features as separated test
public class TestRunner extends AbstractTestNGCucumberTests {

}
