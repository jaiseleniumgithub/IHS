package com.cts.qa;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class TestBase {
	
	protected static WebDriver driver;
	
		// Initialize the browser
		public void initWebDriver(String browserName) {
				driver = new FirefoxDriver();
				implicitWait(10);
				maximizeWindow();				
			}
		// Initialize the chrome browser
		public void initWebDriver2(String browserName) {
	    	System.setProperty("webdriver.chrome.driver", "F://selenium//chromedriver.exe");
	    	driver = new ChromeDriver();
	    	implicitWait(10);
			maximizeWindow();
			}
		// Open the URL in the browser
		public static void getUrl(String url) {
			driver.get(url);
		}

		// Quit the web driver
		public static void quitDriver() {
			if (driver != null) {
				driver.quit();				
			}
		}
		
		// Enter Text
		public void enterText(By by, String nameValue) throws Exception {
			explicitWait(by, 20);
			findWebElement(by).clear();
			findWebElement(by).sendKeys(nameValue);
		}
		
		// Click a Button
		public void clickButton(By by) throws Exception {
			explicitWait(by, 10);
			findWebElement(by).click();
		}


		// Select From Drop down
		public void selectFromDropdown(By by, String options) throws Exception {
			explicitWait(by, 10);
			WebElement dropDown = findWebElement(by);
			Select select = new Select(dropDown);
			select.selectByVisibleText(options);
		}
		
		//click hover 
		public void clickHover (WebElement menu, WebElement menuOption, Actions submenu) throws Exception {
		Actions builder = new Actions(driver);    
		builder.moveToElement(menu).build().perform();
		Thread.sleep(3000);
		builder.moveToElement(menuOption).build().perform();
		//then click when menu option is visible
		Thread.sleep(2000);
		submenu.click();
		}
		
		// Implicit Wait
		public void implicitWait(int secs) {
			driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
		}

		// Explicit Wait
		public Boolean explicitWait(final By by, int secs) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, secs);
				return wait.until(new ExpectedCondition<Boolean>() {
					public Boolean apply(WebDriver d) {
						return d.findElement(by).isDisplayed();
					}
				});
			} catch (TimeoutException e) {
				System.out.println(("Unable to find the element  prior to the time specified - "
						+ secs + " seconds"));

			}
			return false;
		}
		
		// Find a Web element
		public static WebElement findWebElement(By by) {
			WebElement element = null;
			try {
				element = driver.findElement(by);

			} catch (NoSuchElementException e) {
				System.out.println(("Unable to find the element  prior to the time specified"));
			}
			return element;
		}
		
		

		// Maximize browser window
		public void maximizeWindow() {
			driver.manage().window().maximize();
		}
}
