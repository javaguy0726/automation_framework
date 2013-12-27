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

public class BeforeAfterSteps {

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

	@BeforeScenario
    public void beforeScenario() {
		System.out.println("+++++ Before Scenario +++++");
    }

	@AfterScenario
	public void afterScenario() {
		System.out.println("+++++ After Scenario +++++");
	}
    
	@BeforeScenario(uponType = ScenarioType.EXAMPLE)
    public void beforeExampleScenario() {
    	System.out.println("+++++ Before Example Scenario +++++");
    }

    
    @AfterScenario(uponType= ScenarioType.EXAMPLE)
    public void afterExampleScenario() {
    	System.out.println("+++++ After Example Scenario +++++");
    }

    @AfterScenario(uponOutcome = Outcome.FAILURE)
    public void afterFailedScenario() {
    }

    @AfterScenario(uponOutcome = Outcome.SUCCESS)
    public void afterSuccessfulScenario() {
    }
}
