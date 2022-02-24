package stepDefinitions;

import org.junit.Assert;

import demo.base.TestBase;
import demo.pages.CheckoutPage;
import demo.pages.HomePage;
import demo.pages.PurchasePage;
import demo.pages.ShopPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoppingFlow_StepDefinition extends TestBase{
	
	HomePage hp; 
	ShopPage sp;
	PurchasePage pp;
	CheckoutPage cp;
	
	public ShoppingFlow_StepDefinition() {
		super();
	}
	
	@Given("User is on the home page")
	public void User_is_on_the_home() {
		initialization();
	}
	
	@When("User clicks on the shop link")
	public void user_clicks_on_the_shop_link() {
		hp = new HomePage();
		sp = hp.clickLinkShop();
	}
	
	@When("selects items {string} and {string} and clicks on Checkout button")
	public void selects_items_and_and_clicks_on_checkout_button(String item1, String item2) {
	 	sp.selectandAddItem(item1);
		sp.selectandAddItem(item2);
		cp = sp.checkoutitem();
	}
	
	@When("User clicks on the Checkout button on the checkout page")
	public void user_clicks_on_the_checkout_button_on_the_checkout_page() {
		pp = cp.clickCheckout();
	}

	@When("purchase page is displayed here user selects country and Agreees to terms and conditions")
	public void purchase_page_is_displayed_here_user_selects_country_and_agreees_to_terms_and_conditions() {
		pp.enterCountry("India");
		pp.agreeTermsandConditions();
	}

	@When("clicks on purchase button")
	public void clicks_on_purchase_button() {
		pp.clickPurchase();
	}

	@Then("User Checks for success message displayed on the page.")
	public void user_checks_for_success_message_displayed_on_the_page() {
		String actualMsg = pp.getSuccessMessage();
		Assert.assertTrue(actualMsg.contains("Success"));
	}
	
	@After
	public void teardown() {
		driver.quit();
	}
}
