package org.jbehave.webdriver.sp.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.jbehave.webdriver.util.FluentSeleniumUtil;
import org.openqa.selenium.By;
import org.seleniumhq.selenium.fluent.FluentSelect;
import org.seleniumhq.selenium.fluent.FluentSelects;
import org.seleniumhq.selenium.fluent.FluentWebDriver;
import org.seleniumhq.selenium.fluent.FluentWebElement;
import org.seleniumhq.selenium.fluent.FluentWebElements;
import org.seleniumhq.selenium.fluent.Period;
import org.seleniumhq.selenium.fluent.TestableString;
import org.seleniumhq.selenium.fluent.internal.NegatingFluentWebDriver;

public abstract class SpAbstractPage extends FluentWebDriverPage {

	public SpAbstractPage(WebDriverProvider driverProvider) {
		super(driverProvider);
	}

}
