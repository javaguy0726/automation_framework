package org.jbehave.webdriver.util;

/**
 * 
 * Monitor the running status and record the stats to log file.
 */


import java.util.concurrent.TimeUnit;

import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;
import org.seleniumhq.selenium.fluent.monitors.CodaHaleMetricsMonitor;

import com.codahale.metrics.ConsoleReporter;

public class StatRunListener extends RunListener {
	@Override
	public void testRunFinished(Result result) throws Exception {
		super.testRunFinished(result);

		final ConsoleReporter reporter = ConsoleReporter
				.forRegistry(codahaleMetricsMonitor.getMetrics())
				.convertRatesTo(TimeUnit.MILLISECONDS)
				.convertDurationsTo(TimeUnit.MILLISECONDS).outputTo(System.out)
				.build();
		reporter.report();

	}

	public static final CodaHaleMetricsMonitor codahaleMetricsMonitor = new CodaHaleMetricsMonitor(
			"org.jbehave.webdriver.");
}
