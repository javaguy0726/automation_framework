package org.jbehave.webdriver.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.webdriver.sp.pages.SpPageFactory;
import org.jbehave.webdriver.sp.pages.home.SpHomePage;
import org.jbehave.webdriver.sp.pages.login.SpLoginPage;
import org.jbehave.webdriver.sp.pages.ticketing.SpTicketingSearchPage;
import org.openqa.selenium.By;

public class TicketingSearchSteps {

	private SpHomePage spHomePage;
	private SpTicketingSearchPage spTicketingSearchPage;
	
	public TicketingSearchSteps(SpPageFactory factory){
		this.spHomePage =  factory.newSpHome();
		this.spTicketingSearchPage = factory.newSpTicketingSearch();
	}
	
	@Given("User go to the Search screen under Ticketing menu")
	public void userGetToLoginPage(String username, String password){
		this.spTicketingSearchPage = spHomePage.openTicketingSearch();
	}
	
	@Then("The labels <labels> should be correctly spelled")
	public void labelShouldBeCorrect(){
		
	}
}
