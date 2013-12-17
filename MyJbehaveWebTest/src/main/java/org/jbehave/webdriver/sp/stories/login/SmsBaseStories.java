package org.jbehave.webdriver.sp.stories.login;

import java.util.Properties;

import org.jbehave.core.InjectableEmbedder;
import org.jbehave.core.annotations.Configure;
import org.jbehave.core.annotations.UsingEmbedder;
import org.jbehave.core.annotations.UsingSteps;
import org.jbehave.core.annotations.spring.UsingSpring;
import org.jbehave.core.configuration.Keywords;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.embedder.StoryControls;
import org.jbehave.core.failures.FailingUponPendingStep;
import org.jbehave.core.i18n.LocalizedKeywords;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.ResourceLoader;
import org.jbehave.core.io.UnderscoredCamelCaseResolver;
import org.jbehave.core.junit.spring.SpringAnnotatedEmbedderRunner;
import org.jbehave.core.model.ExamplesTableFactory;
import org.jbehave.core.model.TableTransformers;
import org.jbehave.core.parsers.RegexStoryParser;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.ParameterConverters;
import org.jbehave.web.selenium.SeleniumConfiguration;
import org.junit.runner.RunWith;

import static org.jbehave.webdriver.sp.stories.login.SmsBaseStories.MyStoryControls;
import static org.jbehave.webdriver.sp.stories.login.SmsBaseStories.MyStoryLoader;
import static org.jbehave.webdriver.sp.stories.login.SmsBaseStories.MyStoryParser;

@RunWith(SpringAnnotatedEmbedderRunner.class)
@Configure(using = SeleniumConfiguration.class, storyParser=MyStoryParser.class, pendingStepStrategy = FailingUponPendingStep.class, storyControls = MyStoryControls.class, storyLoader = MyStoryLoader.class)
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
	
	public static class MyStoryLoader extends LoadFromClasspath{
		public MyStoryLoader(){
			super(SmsBaseStories.class.getClassLoader());
		}
	}
	
	public static class MyStoryParser extends RegexStoryParser{
		public MyStoryParser(){
			super(new ExamplesTableFactory(new LocalizedKeywords(),new LoadFromClasspath(SmsBaseStories.class),
					new ParameterConverters(),new TableTransformers()));  
		}
	}
	
	public static class MyStoryPathResolver extends UnderscoredCamelCaseResolver{
		public MyStoryPathResolver(){
			  super(); 
		}
	}
	
	public static class MyStoryReportBuilder extends StoryReporterBuilder {
		private Properties  properties = new Properties();
		public MyStoryReportBuilder(){
			this.withCodeLocation(CodeLocations.codeLocationFromClass(SmsBaseStories.class))
			.withViewResources((Properties)properties.put("decorateNonHtml","false"))
			
			
			;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
