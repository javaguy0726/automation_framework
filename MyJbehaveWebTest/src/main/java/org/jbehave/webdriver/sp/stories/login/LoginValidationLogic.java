package org.jbehave.webdriver.sp.stories.login;

import org.jbehave.core.annotations.UsingSteps;
import org.jbehave.core.annotations.spring.UsingSpring;
import org.jbehave.webdriver.steps.LoginSteps;
import org.jbehave.webdriver.stories.BaseStories;

@UsingSteps(instances = {LoginSteps.class})
@UsingSpring(resources = { "sp/pages/login.xml" })
public class LoginValidationLogic extends BaseStories {

}
