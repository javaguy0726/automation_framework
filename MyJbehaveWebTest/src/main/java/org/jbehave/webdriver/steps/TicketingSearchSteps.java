package org.jbehave.webdriver.steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.model.ExamplesTable;
import org.jbehave.webdriver.sp.pages.SpPageFactory;
import org.jbehave.webdriver.sp.pages.home.SpHomePage;
import org.jbehave.webdriver.sp.pages.ticketing.SpTicketingSearchPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

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
	
	@Then("The texts should be as follows: $texts")
	public void labelShouldBeCorrect(ExamplesTable texts){
		List<String> expected = new ArrayList<>();
		for(Map<String, String> row: texts.getRows()){
			expected.add(row.get("texts"));
		}
		System.out.println("+++++++"+expected+"++++++++"+spTicketingSearchPage.getPageLabels());
		assertThat(expected, equalTo(spTicketingSearchPage.getPageLabels()));
	}
	
	
}
