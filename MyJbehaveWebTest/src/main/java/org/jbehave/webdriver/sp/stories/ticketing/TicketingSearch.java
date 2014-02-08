package org.jbehave.webdriver.sp.stories.ticketing;

import static java.util.Arrays.asList;
import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;

import java.util.List;

import org.jbehave.core.annotations.UsingSteps;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.webdriver.steps.LoginSteps;
import org.jbehave.webdriver.steps.TicketingSearchSteps;
import org.jbehave.webdriver.stories.BaseStories;

@UsingSteps(instances = {LoginSteps.class,TicketingSearchSteps.class})
public class TicketingSearch extends BaseStories {
	
}
