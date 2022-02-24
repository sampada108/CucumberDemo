package demo.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import demo.base.TestBase;

public class PurchasePage extends TestBase{

	//Page Objects
	private By country = By.cssSelector("#country");
	private By agreecondition = By.xpath("//label[@for='checkbox2']");
	private By purchase = By.cssSelector("input[value='Purchase']");
	private By successMsg = By.cssSelector("div[class*='alert-success']");

	// Methods used on page objects
	public void enterCountry(String countryname) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.findElement(country).sendKeys(countryname);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(countryname))).click();

	}

	public void agreeTermsandConditions() {
		driver.findElement(agreecondition).click();
	}

	public void clickPurchase() {
		driver.findElement(purchase).click();
	}

	public String getSuccessMessage() {
		return driver.findElement(successMsg).getText();
	}
}
