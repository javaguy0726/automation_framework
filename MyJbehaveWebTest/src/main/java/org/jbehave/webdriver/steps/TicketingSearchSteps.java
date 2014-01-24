package org.jbehave.webdriver.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.webdriver.sp.pages.SpPageFactory;
import org.jbehave.webdriver.sp.pages.home.SpHomePage;
import org.jbehave.webdriver.sp.pages.login.SpLoginPage;
import org.jbehave.webdriver.sp.pages.ticketing.SpTicketingSearchPage;

public class TicketingSearchSteps {

	private SpLoginPage spLoginPage;
	private SpHomePage spHomePage;
	private SpTicketingSearchPage spTicketingSearchPage;
	
	public TicketingSearchSteps(SpPageFactory factory){
		this.spLoginPage = factory.newSpLogin();
		this.spHomePage =  factory.newSpHome();
	}
	
	@Given("User go to the Search screen under Ticketing menu")
	public void userGetToLoginPage(String username, String password){
//		spLoginPage.open().inputUserInfo(username, password).clickSubmitButton()
		
	}
}
