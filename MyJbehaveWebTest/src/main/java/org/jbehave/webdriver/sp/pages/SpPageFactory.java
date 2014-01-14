package org.jbehave.webdriver.sp.pages;

import org.jbehave.web.selenium.WebDriverProvider;
import org.jbehave.webdriver.sp.pages.home.SpHomePage;
import org.jbehave.webdriver.sp.pages.login.SpLoginPage;
import org.seleniumhq.selenium.fluent.FluentWebDriver;

public class SpPageFactory {

	public final WebDriverProvider webDriverProvider;
	
	public SpPageFactory(WebDriverProvider webDriverProvider){
		this.webDriverProvider = webDriverProvider;
	}
	
	public SpLoginPage newSpLogin(){
		return new SpLoginPage(webDriverProvider);
	}
	
	public SpHomePage newSpHome(){
		return new SpHomePage(webDriverProvider);
	}
}
