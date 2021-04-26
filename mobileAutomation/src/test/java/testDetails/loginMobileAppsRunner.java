package testDetails;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features", 
		glue= {"testDetails"},
		tags="@allLoginFeatureMobileApp",
		monochrome = true,
		plugin = {"pretty","html:target/loginMobileAppsReports.html"}
		)
public class loginMobileAppsRunner {

}
