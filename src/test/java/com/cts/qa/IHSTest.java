package com.cts.qa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cts.qa.pageobject.HomePage;
import com.cts.qa.pageobject.SearchPage;
import com.cts.qa.pageobject.ShoppingCart;

public class IHSTest {
	HomePage homePage = new HomePage();
	SearchPage searchPage = new SearchPage();
	ShoppingCart shoppingCart = new ShoppingCart();

	@Before
	public void setUp() {
		homePage.launchIHS("Chrome","https://www.ihs.com/");
	}

	@Test
	public void testIHS() throws Exception {
		homePage.navigateToSolutions();
		/*homePage.selectAppleIPhone();
		shoppingCart.addToCart();
		searchPage.searchAppleIphone6("apple iphone 6");
		shoppingCart.addToCart();
		shoppingCart.checkOut();*/
	}

	@After
	public void tearDown() {

		/*homePage.closeBrowser();*/
	}

}
