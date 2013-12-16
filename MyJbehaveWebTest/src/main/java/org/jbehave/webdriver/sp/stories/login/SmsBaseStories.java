package org.jbehave.webdriver.sp.stories.login;

import org.jbehave.core.InjectableEmbedder;
import org.jbehave.core.annotations.Configure;
import org.jbehave.core.annotations.UsingEmbedder;
import org.jbehave.core.annotations.UsingSteps;
import org.jbehave.core.annotations.spring.UsingSpring;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.embedder.StoryControls;
import org.jbehave.core.failures.FailingUponPendingStep;
import org.jbehave.core.junit.spring.SpringAnnotatedEmbedderRunner;
import org.jbehave.web.selenium.SeleniumConfiguration;
import org.junit.runner.RunWith;

import static org.jbehave.webdriver.sp.stories.login.SmsBaseStories.MyStoryControls;

@RunWith(SpringAnnotatedEmbedderRunner.class)
@Configure(using = SeleniumConfiguration.class, pendingStepStrategy = FailingUponPendingStep.class, storyControls = MyStoryControls.class)
@UsingEmbedder(embedder = Embedder.class, batch = false, verboseFailures = true, verboseFiltering = true, skip = false, generateViewAfterStories = true, ignoreFailureInStories = true, ignoreFailureInView = false, storyTimeoutInSecs = 60, threads = 1, metaFilters = "-skip")
@UsingSteps(instances = {})
@UsingSpring(resources = { "sms-steps.xml" })
public class SmsBaseStories extends InjectableEmbedder {

	public SmsBaseStories() {

	}

	@Override
	public void run() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static class MyStoryControls extends StoryControls {
		public MyStoryControls() {
			doDryRun(false);
			doSkipScenariosAfterFailure(true);
			doSkipBeforeAndAfterScenarioStepsIfGivenStory(true);
			
			
			// useScenarioMetaPrefix(scenarioMetaPrefix);
			// useStoryMetaPrefix(storyMetaPrefix);
			// scenarioMetaPrefix();
			// skipBeforeAndAfterScenarioStepsIfGivenStory();
			// skipScenariosAfterFailure();
			// storyMetaPrefix();
			// resetStateBeforeScenario();
			// resetStateBeforeStory();
			// doResetStateBeforeScenario(false);
			// doResetStateBeforeStory(false);
		}
	}
}
