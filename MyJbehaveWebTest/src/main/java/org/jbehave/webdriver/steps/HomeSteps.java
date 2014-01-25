package org.jbehave.webdriver.steps;

import org.jbehave.webdriver.sp.pages.SpPageFactory;
import org.jbehave.webdriver.sp.pages.home.SpHomePage;
import org.jbehave.webdriver.sp.pages.login.SpLoginPage;

public class HomeSteps {
	private SpLoginPage spLoginPage;
	private SpHomePage spHomePage;
	
	
	public HomeSteps(SpPageFactory factory){
		this.spLoginPage = factory.newSpLogin();
		this.spHomePage = factory.newSpHome();
	}
}
