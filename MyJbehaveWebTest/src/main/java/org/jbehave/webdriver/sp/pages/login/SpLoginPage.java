package org.jbehave.webdriver.sp.pages.login;

import java.util.List;

import org.jbehave.web.selenium.WebDriverProvider;
import org.jbehave.webdriver.sp.pages.SpAbstractPage;
import org.jbehave.webdriver.sp.pages.home.SpHomePage;
import org.openqa.selenium.By;
/**
 * 
 * @author Administrator
 * This is the login page object. It provides the locators and actions methods.
 */
public class SpLoginPage extends SpAbstractPage{

	private final WebDriverProvider driverProvider;
	
	public SpLoginPage(WebDriverProvider driverProvider) {
		super(driverProvider);
		this.driverProvider =driverProvider;
	}
	
	/*Locators for sp login page*/
	public static By sp_loginpage_link_forgot_password;
	public static By sp_loginpage_span_response_massage;
	public static By sp_loginpage_input_username;
	public static By sp_loginpage_input_password;
	public static By sp_loginpage_button_submit;
	
	
	/*actions for login page*/
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
	
	public SpLoginPage clearUserInfo(String username, String password){
		input(sp_loginpage_input_username).clearField();
		input(sp_loginpage_input_password).clearField();
		return this;
	}
	
	public String getResponseMessage(){
		return span(sp_loginpage_span_response_massage).getText().toString();
	}
	
	public SpLoginPage clickSubmitButton(){
		input(sp_loginpage_button_submit).click();
		return this;
	}

	public SpLoginPage submitFail(){
		return new SpLoginPage(driverProvider);
	}
	
	public SpHomePage submitSucceed(){
		return new SpHomePage(driverProvider);
	}
	
	
	
	
	
	
	
	
	
	
	//properties setters here
	public void setSp_loginpage_link_forgot_password(
			By sp_loginpage_link_forgot_password) {
		SpLoginPage.sp_loginpage_link_forgot_password = sp_loginpage_link_forgot_password;
	}

	public void setSp_loginpage_span_response_massage(
			By sp_loginpage_span_response_massage) {
		SpLoginPage.sp_loginpage_span_response_massage = sp_loginpage_span_response_massage;
	}

	public void setSp_loginpage_input_username(By sp_loginpage_input_username) {
		SpLoginPage.sp_loginpage_input_username = sp_loginpage_input_username;
	}

	public void setSp_loginpage_input_password(By sp_loginpage_input_password) {
		SpLoginPage.sp_loginpage_input_password = sp_loginpage_input_password;
	}

	public void setSp_loginpage_button_submit(By sp_loginpage_button_submit) {
		SpLoginPage.sp_loginpage_button_submit = sp_loginpage_button_submit;
	}

	
	
}
