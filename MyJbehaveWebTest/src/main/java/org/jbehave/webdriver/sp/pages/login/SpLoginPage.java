package org.jbehave.webdriver.sp.pages.login;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
/**
 * 
 * @author Administrator
 * This is the login page object. It includes the locators and actions.
 */
public class SpLoginPage extends FluentWebDriverPage{

	// add locators here
	private By sp_loginpage_link_forgotpassword;
	
	public SpLoginPage(WebDriverProvider webDriverProvider) {
		super(webDriverProvider);
	}
	
	public SpLoginPage clickForgotPasswordLink(){
		link(sp_loginpage_link_forgotpassword).click();
		return this;
	}

}
