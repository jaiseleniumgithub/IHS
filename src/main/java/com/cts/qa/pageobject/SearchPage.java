package com.cts.qa.pageobject;

import org.openqa.selenium.By;

import com.cts.qa.TestBase;

public class SearchPage extends TestBase{

public void searchAppleIphone6(String nameValue) throws Exception{
	
	//add an apple iphone 6 using search box
	
	    enterText(By.id("twotabsearchtextbox"), nameValue);
		implicitWait(20);
		clickButton(By.className("nav-input"));
		implicitWait(20);
		clickButton(By.xpath(".//*[contains(text(),'Apple iphone 6 - SIM FREE 4.7')]"));				
		implicitWait(20);		 
		selectFromDropdown(By.id("firstDimension"), "16GB");
		implicitWait(20);
		selectFromDropdown(By.id("asinRedirect"), "SILVER");
		implicitWait(20);	 
		selectFromDropdown(By.id("quantity"), "2");
		implicitWait(20);
		
}	

}
