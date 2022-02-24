package demo.pages;

import org.openqa.selenium.By;

import demo.base.TestBase;
import demo.pages.PurchasePage;

public class CheckoutPage extends TestBase {

	// Page objects Encapsulation
	private By checkoutbutton = By.cssSelector("button[class='btn btn-success']");

	// Methods to access page objects
	public PurchasePage clickCheckout() {
		driver.findElement(checkoutbutton).click();
		PurchasePage pp = new PurchasePage();
		return pp;
	}
}
