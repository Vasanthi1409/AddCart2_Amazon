package miniproject_Amazon2.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.interactions.Actions;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon2_BaseClass {

	public static WebDriver driver;

	public static WebDriver browser_Launch(String browser) {

		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		return driver;
	}

	public static void geturl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void click(WebElement locator) {
		locator.click();
	}

	public static void wait(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}

	public static void mousescroll(int S1, int S2) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(" + S1 + "," + S2 + ")");
	}
	
	public static void keyboard_actions() throws AWTException {
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_ESCAPE);
		R.keyRelease(KeyEvent.VK_ESCAPE);
	}
	
	public static void Scrnshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File SRC = ts.getScreenshotAs(OutputType.FILE);
		File DES = new File("C:\\Users\\inbaraj\\eclipse-workspace\\Maven_TCF\\src\\main\\java\\miniproject_Amazon2\\com\\Capture.png");
		FileUtils.copyFile(SRC, DES);

	}

}
