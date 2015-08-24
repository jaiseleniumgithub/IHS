package com.cts.qa.pageobject;

import org.openqa.selenium.By;

import com.cts.qa.TestBase;

public class ShoppingCart extends TestBase{
	
	public void addToCart() throws Exception{
		//add to cart		
		implicitWait(20);
		clickButton(By.id("bb_atc_button"));		
	}
	
	// Customer login and checkout
	public void checkOut() throws Exception{
		implicitWait(20);
		clickButton(By.xpath("//*[@id='hlb-ptc-btn-native']"));
		implicitWait(20);
		enterText(By.id("ap_email"), "test20mail15@gmail.com");
		enterText(By.id("ap_password"), "test20_mail15");
		clickButton(By.xpath("//*[@id='signInSubmit-input']"));
		implicitWait(20); 
		clickButton(By.xpath("/html/body/div/div/form/div/div/div/span/a"));		
		implicitWait(20);
		clickButton(By.className("a-button-text"));
		implicitWait(30);
	}

}
