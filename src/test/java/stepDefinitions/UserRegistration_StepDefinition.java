package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import demo.base.TestBase;
import demo.pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistration_StepDefinition extends TestBase {

	HomePage hp = new HomePage();;

	public UserRegistration_StepDefinition() {
		super();
	}

	@Given("User is on the home page of the apllication")
	public void User_is_on_the_home_page_of_the_apllication() {
		initialization();
	}

	@When("User enters registration details like {string}, {string}, {string}, selects {string} and {string} and enters {string}")
	public void user_enters_registration_details_like_selects_and_and_enters(String name, String email, String password,
			String gender, String empstatus, String DateofBirth) {

		// Fill form fields
		hp.setname(name);
		hp.getemail().sendKeys(email);
		hp.getpassword().sendKeys(password);
		hp.getchkboxicecream().click();
		new Select(hp.getgender()).selectByVisibleText(gender);
		List<WebElement> empStatus = hp.getemployeestatus();
		for (WebElement emp : empStatus) {
			if (emp.getAttribute("Value").equals(empstatus))
				emp.click();
		}

		hp.getdateofBirth().sendKeys(DateofBirth);
	}

	@When("submits form using submit button.")
	public void submits_form_using_submit_button() {
		hp.getsubmit().click();
	}

	@Then("User checks for success message.")
	public void user_checks_for_success_message() {
		String expectedMsg = "Success! The Form has been submitted successfully!.";
		String actualMsg = hp.getsuccessMsg().getText();
		Assert.assertTrue((actualMsg.contains(expectedMsg)));
	}

	@After
	public void teardown() {
		driver.quit();
	}

}
