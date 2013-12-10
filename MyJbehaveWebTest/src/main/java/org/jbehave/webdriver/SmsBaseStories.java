package org.jbehave.webdriver;

import org.jbehave.core.InjectableEmbedder;
import org.jbehave.core.annotations.Configure;
import org.jbehave.core.annotations.UsingEmbedder;
import org.jbehave.core.annotations.UsingSteps;
import org.jbehave.core.annotations.spring.UsingSpring;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.failures.FailingUponPendingStep;
import org.jbehave.core.junit.spring.SpringAnnotatedEmbedderRunner;
import org.jbehave.web.selenium.SeleniumConfiguration;
import org.junit.runner.RunWith;

@RunWith(SpringAnnotatedEmbedderRunner.class)
@Configure(using = SeleniumConfiguration.class, pendingStepStrategy = FailingUponPendingStep.class )
@UsingEmbedder(embedder = Embedder.class, generateViewAfterStories = true, ignoreFailureInStories = true, ignoreFailureInView = false, storyTimeoutInSecs = 100, threads = 1, metaFilters = "-skip")
@UsingSteps(instances= {})
@UsingSpring(resources = { "sms-steps.xml"})
public class SmsBaseStories extends InjectableEmbedder{

	public SmsBaseStories(){
		
	}
	
	@Override
	public void run() throws Throwable {
		// TODO Auto-generated method stub
		
	}

}
