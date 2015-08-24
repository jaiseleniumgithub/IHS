package com.cts.qa.pageobject;

import org.openqa.selenium.By;
/*import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
*/




import com.cts.qa.TestBase;

public class HomePage extends TestBase{
	
	public void launchIHS(String browser,String url){
		initWebDriver2(browser);
		getUrl(url);
	}
	
	public void navigateToSolutions() throws Exception{
	
	
		driver.findElement(By.xpath("//a[contains(text(),'PRODUCTS')]")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//a[contains(text(),'OUR EXPERTISE')]")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//a[contains(text(),'EVENTS')]")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//a[contains(text(),'ABOUT US')]")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//a[contains(text(),'SEARCH')]")).click();
		//driver.findElement(By.className("search-btn")).click();
		Thread.sleep(3000);	
		driver.findElement(By.className("ihs-search")).click();
		Thread.sleep(3000);	
		/*
		//First link
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'PRODUCTS')]"))).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Industries')]"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Academic / Education')]")).click();
		Thread.sleep(3000);	
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);	
		
		//Second link
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'PRODUCTS')]"))).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Product Type')]"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Current Event Analysis')]")).click();
		Thread.sleep(3000);	
		((JavascriptExecutor)driver).executeScript("scroll(0,100)");
		Thread.sleep(3000);		
				
	*/
	}
	public void closeBrowser (){
		quitDriver();
	}
	
	}
