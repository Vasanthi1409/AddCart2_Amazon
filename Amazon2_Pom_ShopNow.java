package miniproject_Amazon2.com;

import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon2_Pom_ShopNow {
	
	public WebDriver driver;
	
	public Amazon2_Pom_ShopNow(WebDriver launched_browser) {
		driver = launched_browser;
		PageFactory.initElements(driver, this);
	}
	
//Product 1
	@FindBy(xpath="(//img[@alt='Shop now'])[11]")
	private WebElement product1;

	public WebElement getProduct1() {
		return product1;
	}
	
	@FindBy(id = "add-to-cart-button")
	private WebElement addcart1;

	public WebElement getAddcart1() {
		return addcart1;
	}
	
//Product 2
	@FindBy(xpath="(//img[@alt='Shop now'])[12]")
	private WebElement product2;

	public WebElement getProduct2() {
		return product2;
	}
	
	@FindBy(id = "add-to-cart-button")
	private WebElement addcart2;

	public WebElement getAddcart2() {
		return addcart2;
	}
	
//Product 3
	@FindBy(xpath="(//img[@alt='Shop now'])[13]")
	private WebElement product3;

	public WebElement getProduct3() {
		return product3;
	}
		
	@FindBy(id = "add-to-cart-button")
	private WebElement addcart3;

	public WebElement getAddcart3() {
		return addcart3;
	}
	
//Product 4
	@FindBy(xpath="(//img[@alt='Shop now'])[14]")
	private WebElement product4;

	public WebElement getProduct4() {
		return product4;
	}
			
	@FindBy(id = "add-to-cart-button")
	private WebElement addcart4;

	public WebElement getAddcart4() {
		return addcart4;
	}

//Product 5
	@FindBy(xpath="(//img[@alt='Shop now'])[15]")
	private WebElement product5;

	public WebElement getProduct5() {
		return product5;
	}
				
	@FindBy(id = "add-to-cart-button")
	private WebElement addcart5;

	public WebElement getAddcart5() {
		return addcart5;
	}
	
//Shopping Cart
	@FindBy(id = "nav-cart-count")
	private WebElement Cartpage;

	public WebElement getCartpage() {
		return Cartpage;
	}

}
