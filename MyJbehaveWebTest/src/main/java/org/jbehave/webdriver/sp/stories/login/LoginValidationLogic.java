package org.jbehave.webdriver.sp.stories.login;

import org.jbehave.core.annotations.Configure;
import org.jbehave.core.annotations.UsingEmbedder;
import org.jbehave.core.annotations.UsingSteps;
import org.jbehave.core.annotations.spring.UsingSpring;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.junit.spring.SpringAnnotatedEmbedderRunner;
import org.jbehave.webdriver.stories.BaseStories;
import org.junit.runner.RunWith;

@UsingSteps(instances = {})
@UsingSpring(resources = { "sp/pages/login.xml" })
public class LoginValidationLogic extends BaseStories {

}
