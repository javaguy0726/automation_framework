package org.jbehave.webdriver.util;

import org.openqa.selenium.WebDriver;
import org.seleniumhq.selenium.fluent.FluentWebDriver;
import org.seleniumhq.selenium.fluent.monitors.CompositeMonitor;
import org.seleniumhq.selenium.fluent.monitors.HighlightOnError;

public class FluentSeleniumUtil extends FluentWebDriver{

	public FluentSeleniumUtil(WebDriver webDriver) {
		super(webDriver, new CompositeMonitor(StatRunListener.codahaleMetricsMonitor, new HighlightOnError(webDriver)));
		// TODO Auto-generated constructor stub
	}

	
}
