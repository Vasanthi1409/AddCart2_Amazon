package miniproject_Amazon2.com;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon2_Pom_Homepage {
	
	public WebDriver driver;
	
	public Amazon2_Pom_Homepage(WebDriver launched_browser) {
		driver = launched_browser;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Mobiles']")
	private WebElement Mobiles;

	public WebElement getMobiles() {
		return Mobiles;
	}
	
	@FindBy(xpath = "//span[text()='Mobile Accessories']")
	private WebElement accessories;

	public WebElement getAccessories() {
		return accessories;
	}
	

}
