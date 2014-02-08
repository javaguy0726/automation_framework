package org.jbehave.webdriver.sp.stories.ticketing;

import org.jbehave.core.annotations.UsingSteps;
import org.jbehave.webdriver.steps.LoginSteps;
import org.jbehave.webdriver.steps.TicketingSearchSteps;
import org.jbehave.webdriver.stories.BaseStories;

@UsingSteps(instances = {LoginSteps.class,TicketingSearchSteps.class})
public class TicketingSearch extends BaseStories {

}
