package org.jbehave.webdriver.steps;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.AfterStories;
import org.jbehave.core.annotations.AfterStory;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.BeforeStories;
import org.jbehave.core.annotations.BeforeStory;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.ScenarioType;
import org.jbehave.core.annotations.AfterScenario.Outcome;
import org.jbehave.web.selenium.WebDriverProvider;
import org.jbehave.web.selenium.WebDriverSteps;
import org.openqa.selenium.os.WindowsUtils;

public class BeforeAfterSteps extends WebDriverSteps{

	public BeforeAfterSteps(WebDriverProvider driverProvider) {
		super(driverProvider);
	}
	/*
	@BeforeStories
	public void beforeStories() {
		System.out.println("+++++ Before Stories +++++");
	}

	@AfterStories
	public void afterStories() {
		System.out.println("+++++ After Stories +++++");
	}

	@BeforeStory(uponGivenStory = false)
	public void beforeStory() {
		System.out.println("+++++ Before Story +++++");
	}

	@AfterStory(uponGivenStory = false)
	public void afterStory() {
		System.out.println("+++++ After Story +++++");
	}
	*/
	@BeforeScenario
    public void beforeScenario() {
		System.out.println("+++++ Before Scenario +++++");
		driverProvider.initialize();
		
    }
	
    @AfterScenario(uponOutcome = Outcome.ANY)
    public void afterAnyScenario() {
    	System.out.println("+++++ After Any Scenario +++++");
    	 driverProvider.end();
    }
}
