package demo.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import demo.base.TestBase;

public class ShopPage extends TestBase{
	
	private By cards = By.xpath("//div[@class='card h-100']");
	private By cardtext = By.xpath("div/h4");
	private By addbutton = By.xpath("div/button");
	private By checkoutButton = By.cssSelector("a[class='nav-link btn btn-primary']");

	public void selectandAddItem(String item) {
		List<WebElement> products = driver.findElements(cards);
		for (WebElement product : products) {
			String Text = product.findElement(cardtext).getText();
			if (Text.equals(item)) {
				product.findElement(addbutton).click();
				break;
			}
		}
	}

	public CheckoutPage checkoutitem() {
		driver.findElement(checkoutButton).click();
		CheckoutPage cp = new CheckoutPage();
		return cp;
	}
}
