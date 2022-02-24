package demo.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import demo.base.TestBase;

public class HomePage extends TestBase{

	// Page objects - Private - Encapsulation concept
	private By name = By.name("name");
	private By email = By.name("email");
	private By password = By.cssSelector("input[type='password']");
	private By chkboxicecream = By.id("exampleCheck1");
	private By gender = By.cssSelector("#exampleFormControlSelect1");
	private By empStatus = By.xpath("//div[@class='form-check form-check-inline']/input");
	private By dateofBirth = By.cssSelector("input[name='bday']");
	private By submit = By.cssSelector("input[type='submit']");
	private By successMsg = By.cssSelector("div[class*='alert-success']");
	private By shopLink = By.cssSelector("a[href*='shop']");

	// Methods to access page objects
	public void setname(String username) {
		driver.findElement(name).sendKeys(username);
	}

	public WebElement getemail() {
		//driver.findElement(email).clear();
		return driver.findElement(email);
	}

	public WebElement getpassword() {
		//driver.findElement(password).clear();
		return driver.findElement(password);
	}

	public WebElement getchkboxicecream() {
		return driver.findElement(chkboxicecream);
	}

	public WebElement getgender() {
		return driver.findElement(gender);
	}

	public List<WebElement> getemployeestatus() {
		return driver.findElements(empStatus);
	}

	public WebElement getdateofBirth() {
		return driver.findElement(dateofBirth);
	}

	public WebElement getsubmit() {
		return driver.findElement(submit);
	}

	public WebElement getsuccessMsg() {
		return driver.findElement(successMsg);
	}

	public ShopPage clickLinkShop() {
		driver.findElement(shopLink).click();
		ShopPage sp = new ShopPage();
		return sp;
	}
}
