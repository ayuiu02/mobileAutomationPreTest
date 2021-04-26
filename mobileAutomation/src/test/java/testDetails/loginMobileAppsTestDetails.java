package testDetails;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.*;

public class loginMobileAppsTestDetails {
	
	static AppiumDriver<MobileElement> driver;
	String validEmail = "iuthopia0211@gmail.com";
	String validPassword = "pretest123";
	String invalidEmail = "invalidemail@gmail.com";
	String invalidPassword = "invalidPassword";
	String name = "Ayu Isnaini";	
	
	@Given("Apps is open")
	public void apps_is_open() {
		DesiredCapabilities desCap = new DesiredCapabilities();
		desCap.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
		desCap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.1.2");
		desCap.setCapability(MobileCapabilityType.DEVICE_NAME,"Redmi 5A");
		desCap.setCapability(MobileCapabilityType.UDID,"28648e7a7ce5");

		desCap.setCapability("appPackage","com.loginmodule.learning");
		desCap.setCapability("appActivity","com.loginmodule.learning.activities.LoginActivity");
		
		try {
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		
		driver = new AppiumDriver<MobileElement>(desCap);
	}

	@When("User enter valid email in email field")
	public void user_enter_valid_email_in_email_field() {
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).sendKeys(validEmail);
	}

	@And("User enter valid password in password field")
	public void user_enter_valid_password_in_password_field() {
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).sendKeys(validPassword);
	}

	@And("User click on Login button")
	public void user_click_on_login_button() {
		driver.findElement(By.id("com.loginmodule.learning:id/appCompatButtonLogin")).click();
	}

	@Then("User should be able to see Name in User List page")
	public void user_should_be_able_to_see_name_in_user_list_page() {
		driver.getPageSource().contains(name);
	}

	@And("User should be able to see Email in User List page")
	public void user_should_be_able_to_see_email_in_user_list_page() {
		driver.getPageSource().contains(validEmail);
	}

	@And("User should be able to see Password in User List page")
	public void user_should_be_able_to_see_password_in_user_list_page() {
		driver.getPageSource().contains(validPassword);
	}

	@And("User enter invalid password in passsword field")
	public void user_enter_invalid_password_in_passsword_field() {
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).sendKeys(invalidPassword);
	}

	@Then("User should be able to see alert message")
	public void user_should_be_able_to_see_alert_message() {
		driver.getPageSource().contains("Enter Valid Email");
	}

	@And("User should still in Login page")
	public void user_should_still_in_login_page() {
		driver.findElement(By.id("com.loginmodule.learning:id/appCompatButtonLogin")).isDisplayed();
	}

	@When("User enter invalid email in email field")
	public void user_enter_invalid_email_in_email_field() {
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).sendKeys(invalidEmail);
	}

	@When("User does not type any email in email field")
	public void user_does_not_type_any_email_in_email_field() {
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).sendKeys("");
	}

	@And("User filled password field")
	public void user_filled_password_field() {
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).sendKeys(validPassword);
	}

	@When("User filled email field")
	public void user_filled_email_field() {
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).sendKeys(validEmail);
	}

	@And("User does not type any password in password field")
	public void user_does_not_type_any_password_in_password_field() {
		driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).sendKeys("");
	}
}
