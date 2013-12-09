package org.jbehave.webdriver.sp.pages.login;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.jbehave.webdriver.sp.pages.home.SpHomePage;
import org.openqa.selenium.By;
import org.seleniumhq.selenium.fluent.TestableString;
/**
 * 
 * @author Administrator
 * This is the login page object. It includes the locators and actions.
 */
public class SpLoginPage extends FluentWebDriverPage{

	public SpLoginPage(WebDriverProvider webDriverProvider) {
		super(webDriverProvider);
	}
	
	// add locators here
	private By sp_loginpage_link_forgot_password;
	private By sp_loginpage_span_response_massage;
	private By sp_loginpage_input_username;
	private By sp_loginpage_input_password;
	private By sp_loginpage_button_submit;
	
	
	
	
	// actions for login page
	public SpLoginPage open(){
		get("http://test.mysplogon.com/SinglePoint/Login.aspx");
		return this;
	}
	
	public SpLoginPage clickForgetPasswordLink(){
		link(sp_loginpage_link_forgot_password).click();
		return this;
	}
	
	public SpLoginPage inputUserInfo(String username, String password){
		input(sp_loginpage_input_username).sendKeys(username);
		input(sp_loginpage_input_password).sendKeys(password);
		return this;
	}
	
	public String getResponseMessage(){
		return span(sp_loginpage_span_response_massage).getText().toString();
	}
	
	public SpLoginPage clickSubmitButton(){
		button(sp_loginpage_button_submit).click();
		return this;
	}

}
