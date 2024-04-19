package Runner_Demo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.junit.runner.RunWith;
import Base.Base_Demo;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\deiva\\eclipse-workspace\\vmmaps\\Feature\\vmmaps.Feature\\"
    , glue = "Step_Demo"
   
		)

public class TestRunner extends Base_Demo {
	public static WebDriver driver;

	@BeforeClass
	public static void setup() {
		browser_Launch("Edge");

	}

	@AfterClass
	public static void teardown() {
		quit();
	}
}
