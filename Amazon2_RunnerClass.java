package miniproject_RunnerClass_Amazon2.com;

import java.awt.AWTException;
import java.io.IOException;

import miniproject_Amazon2.com.Amazon2_BaseClass;
import miniproject_Amazon2.com.Amazon2_Pom_Homepage;
import miniproject_Amazon2.com.Amazon2_Pom_ShopNow;

public class Amazon2_RunnerClass extends Amazon2_BaseClass {

	public static void main(String[] args) throws AWTException, IOException {
		
		browser_Launch("Chrome");
		geturl("https://www.amazon.in/");
		
		Amazon2_Pom_Homepage home = new Amazon2_Pom_Homepage(driver);
		
	//Product 1
		click(home.getMobiles());
		wait(3000);
		click(home.getAccessories());
		wait(3000); 
		mousescroll(0, 1600);

		Amazon2_Pom_ShopNow shop = new Amazon2_Pom_ShopNow(driver);
		click(shop.getProduct1());
		wait(3000);
		mousescroll(0, 200);
		click(shop.getAddcart1());
		wait(6000);
		keyboard_actions();
		
	//Product 2
		try {
			click(home.getMobiles());
		}catch(Exception e) {
			
		}
		click(home.getMobiles());
		wait(3000);
		click(home.getAccessories());
		wait(3000);
		mousescroll(0, 1600);
		
		click(shop.getProduct2());
		wait(3000);
		mousescroll(0,200);
		click(shop.getAddcart2());
		wait(6000);
		keyboard_actions();
		
	//Product 3
		try {
			click(home.getMobiles());
		}catch(Exception e) {
			
		}
		click(home.getMobiles());
		wait(3000);
		click(home.getAccessories());
		wait(3000);
		mousescroll(0, 1600);
			
		click(shop.getProduct3());
		wait(3000);
		mousescroll(0,200);
		click(shop.getAddcart3());
		wait(6000);
		keyboard_actions();

	//Product 4
		try {
			click(home.getMobiles());
		}catch(Exception e) {
			
		}
		click(home.getMobiles());
		wait(3000);
		click(home.getAccessories());
		wait(3000);
		mousescroll(0, 1600);
					
		click(shop.getProduct4());
		wait(3000);
		mousescroll(0,200);
		click(shop.getAddcart4());
		wait(6000);
		keyboard_actions();
		
	//Product 5
		try {
			click(home.getMobiles());
		}catch(Exception e) {
			
		}
		click(home.getMobiles());
		wait(3000);
		click(home.getAccessories());
		wait(3000);
		mousescroll(0, 1600);
							
		click(shop.getProduct5());
		wait(3000);
		mousescroll(0,200);
		click(shop.getAddcart5());
		wait(6000);
		keyboard_actions();
		
	//Shopping Cart
		try {
			click(shop.getCartpage());
		}catch(Exception e) {
			
		}
		click(shop.getCartpage());
		Scrnshot();
		
	}
}
