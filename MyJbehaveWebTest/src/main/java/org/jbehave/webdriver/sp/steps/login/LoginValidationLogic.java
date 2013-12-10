package org.jbehave.webdriver.sp.steps.login;

import org.jbehave.core.annotations.Aliases;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.webdriver.sp.pages.SpPageFactory;
import org.jbehave.webdriver.sp.pages.home.SpHomePage;
import org.jbehave.webdriver.sp.pages.login.SpLoginPage;
import org.openqa.selenium.By;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginValidationLogic {

	private SpLoginPage spLoginPage;
	private SpHomePage spHomePage;
	
	
	public LoginValidationLogic(SpPageFactory factory){
		this.spLoginPage = factory.newSpLogin();
		this.spHomePage = factory.newSpHome();
	}
	
	@Given("user get to the Login page")
	public void userGetToLoginPage(){
		this.spLoginPage = spLoginPage.open();
	}
	
	@Given("user input the correct username $username and password $password")
	@Aliases(values={"user input the incorrect username $username and password $password"})
	public void userInputCorrectInfo(String username, String password){
		this.spLoginPage=spLoginPage.inputUserInfo(username, password);
	}
	
	@When("user click \"Forgot Password\" link")
	public void userClickForgetPasswodLink(){
		this.spLoginPage = spLoginPage.clickForgetPasswordLink();
	}
	
	@When("user click submit button")
	public void userClickLogin(){
		this.spLoginPage = spLoginPage.clickSubmitButton();
	}
	
	@Then("message $message should be displayed")
	public void messageShouldDisplay(String message){
		assertThat(spLoginPage.getResponseMessage(), equalTo(message));
	}
	
	@Then("user should get to the Home page")
	public void homepageShouldDisplay(){
		assertThat(spHomePage.getTitle(), equalTo(""));
	}
	
	

}
