package org.jbehave.webdriver.stories;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Properties;

import org.jbehave.core.Embeddable;
import org.jbehave.core.InjectableEmbedder;
import org.jbehave.core.annotations.Configure;
import org.jbehave.core.annotations.UsingEmbedder;
import org.jbehave.core.annotations.UsingSteps;
import org.jbehave.core.annotations.spring.UsingSpring;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.Keywords;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.embedder.StoryControls;
import org.jbehave.core.embedder.executors.SameThreadExecutors;
import org.jbehave.core.failures.FailingUponPendingStep;
import org.jbehave.core.i18n.LocalizedKeywords;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.ResourceLoader;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.io.UnderscoredCamelCaseResolver;
import org.jbehave.core.junit.spring.SpringAnnotatedEmbedderRunner;
import org.jbehave.core.model.ExamplesTableFactory;
import org.jbehave.core.model.TableTransformers;
import org.jbehave.core.parsers.RegexPrefixCapturingPatternParser;
import org.jbehave.core.parsers.RegexStoryParser;
import org.jbehave.core.reporters.CrossReference;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.ParameterConverters;
import org.jbehave.core.steps.ParameterConverters.DateConverter;
import org.jbehave.web.selenium.ContextView;
import org.jbehave.web.selenium.LocalFrameContextView;
import org.jbehave.web.selenium.PerScenarioWebDriverSteps;
import org.jbehave.web.selenium.PerStoriesWebDriverSteps;
import org.jbehave.web.selenium.SeleniumConfiguration;
import org.jbehave.web.selenium.SeleniumContext;
import org.jbehave.web.selenium.SeleniumContextOutput;
import org.jbehave.web.selenium.SeleniumStepMonitor;
import org.jbehave.web.selenium.WebDriverSteps;
import org.junit.Test;
import org.junit.runner.RunWith;

import static java.util.Arrays.asList;
import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;
import static org.jbehave.core.reporters.Format.CONSOLE;
import static org.jbehave.core.reporters.Format.XML;
import static org.jbehave.web.selenium.WebDriverHtmlOutput.WEB_DRIVER_HTML;
import static org.jbehave.webdriver.stories.BaseStories.MyDateConverter;
import static org.jbehave.webdriver.stories.BaseStories.MyPatternParser;
import static org.jbehave.webdriver.stories.BaseStories.MyStepMonitor;
import static org.jbehave.webdriver.stories.BaseStories.MyStoryControls;
import static org.jbehave.webdriver.stories.BaseStories.MyStoryLoader;
import static org.jbehave.webdriver.stories.BaseStories.MyStoryParser;
import static org.jbehave.webdriver.stories.BaseStories.MyStoryReportBuilder;


@RunWith(SpringAnnotatedEmbedderRunner.class)
@Configure(using = SeleniumConfiguration.class, 
					stepMonitor = MyStepMonitor.class, 
					stepPatternParser = MyPatternParser.class, 
					parameterConverters = { MyDateConverter.class }, 
					storyReporterBuilder = MyStoryReportBuilder.class, 
					storyParser = MyStoryParser.class, 
					pendingStepStrategy = FailingUponPendingStep.class, 
					storyControls = MyStoryControls.class, 
					storyLoader = MyStoryLoader.class)
@UsingEmbedder(embedder = Embedder.class, 
							batch = false, 
							verboseFailures = true, 
							verboseFiltering = true, 
							skip = false, 
							generateViewAfterStories = true, 
							ignoreFailureInStories = true, 
							ignoreFailureInView = true, 
							storyTimeoutInSecs = 300, 
							threads = 1, 
							metaFilters = "-skip")
@UsingSteps(instances = {})
@UsingSpring(resources = {"context_configs.xml"})
public class BaseStories extends InjectableEmbedder {

	protected static Properties properties = new Properties();
	protected static SeleniumContext seleniumContext = new SeleniumContext();
	protected static ContextView contextView = new LocalFrameContextView().sized(640, 120);
	protected static CrossReference crossReference  = new CrossReference().withJsonOnly(); 
	protected static Format[] formats = new Format[] { new SeleniumContextOutput(seleniumContext), CONSOLE,XML, WEB_DRIVER_HTML };
	protected static Keywords keyword = new LocalizedKeywords();
	protected static ResourceLoader  resourceLoader = new LoadFromClasspath(BaseStories.class);
	protected static ParameterConverters parameterConverters = new ParameterConverters();
	protected static TableTransformers  tableTransformers = new TableTransformers();
	protected static ExamplesTableFactory  examplesTableFactory = new ExamplesTableFactory(keyword,resourceLoader,parameterConverters,tableTransformers);
	
	public BaseStories() {
		Configuration configuration = injectedEmbedder().configuration();
		if (configuration instanceof SeleniumConfiguration) {
            SeleniumConfiguration seleniumConfiguration = (SeleniumConfiguration) configuration;
            seleniumConfiguration.useSeleniumContext(seleniumContext);
        }
	}

	@Test
	public void run() throws Throwable {
		 injectedEmbedder().runStoriesAsPaths(storyPaths());
		
	}
	
	//find the story text
	protected List<String> storyPaths() {
        return new StoryFinder().findPaths(codeLocationFromClass(this.getClass()).getFile(),
                asList("**/*.story"), null);
    }
	

	public static class MyStoryControls extends StoryControls {
		public MyStoryControls() {
			doDryRun(false);
			doSkipScenariosAfterFailure(true);
			doSkipBeforeAndAfterScenarioStepsIfGivenStory(true);
			doResetStateBeforeScenario(true);
			doResetStateBeforeStory(true);

			// useScenarioMetaPrefix(scenarioMetaPrefix);
			// useStoryMetaPrefix(storyMetaPrefix);
			// scenarioMetaPrefix();
			// skipBeforeAndAfterScenarioStepsIfGivenStory();
			// skipScenariosAfterFailure();
			// storyMetaPrefix();
			// resetStateBeforeScenario();
			// resetStateBeforeStory();
		}
	}
	
	public static class MyStoryLoader extends LoadFromClasspath{
		public MyStoryLoader(){
			super(BaseStories.class.getClassLoader());
		}
	}
	
	public static class MyStoryParser extends RegexStoryParser{
		public MyStoryParser(){
			super(examplesTableFactory);  
		}
	}
	
	public static class MyStoryPathResolver extends UnderscoredCamelCaseResolver{
		public MyStoryPathResolver(){
			  super(); 
		}
	}
	
	//configure the reporter builder class
	public static class MyStoryReportBuilder extends StoryReporterBuilder {
		
		public MyStoryReportBuilder(){
			properties.put("decorateNonHtml","false");
			this.withCodeLocation(CodeLocations.codeLocationFromClass(BaseStories.class))
			.withViewResources(properties)
			.withDefaultFormats()
			.withFormats(formats)
			.withFailureTrace(true)
			.withFailureTraceCompression(true)
			.withCrossReference(crossReference)
			;
		}
	}
	
	//customize the converter class
	public static class MyDateConverter extends DateConverter {
        public MyDateConverter() {
            super(new SimpleDateFormat("yyyy-MM-dd"));
        }
    }
	
	public static class MyPatternParser extends RegexPrefixCapturingPatternParser {
        public MyPatternParser() {
            super("$");
            
        }
    }
	
	public static class MyStepMonitor extends SeleniumStepMonitor{
		public MyStepMonitor() {
			super(contextView, seleniumContext, crossReference.getStepMonitor());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
