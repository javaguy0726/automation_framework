package org.jbehave.webdriver.sp.pages.home;

import org.jbehave.web.selenium.WebDriverProvider;
import org.jbehave.webdriver.sp.pages.SpAbstractPage;
import org.jbehave.webdriver.sp.pages.ticketing.SpTicketingSearchPage;
import org.openqa.selenium.By;
import org.seleniumhq.selenium.fluent.Period.Seconds;

public class SpHomePage extends SpAbstractPage{

	private final WebDriverProvider driverProvider;
	
	public SpHomePage(WebDriverProvider driverProvider) {
		super(driverProvider);
		this.driverProvider=driverProvider;
	}

	/*Locators for sp home page*/
	/*tds*/
	public static By sp_homepage_td_ticketing;
	public static By sp_homepage_td_ticketing_search;

	
	
	/*actions for home page*/
	public SpTicketingSearchPage openTicketingSearch(){
		td(sp_homepage_td_ticketing).click().within(Seconds.secs(10)).td(sp_homepage_td_ticketing_search);
		return new SpTicketingSearchPage(driverProvider);
	}

	/*setters*/
	public static void setSp_homepage_td_ticketing(By sp_homepage_td_ticketing) {
		SpHomePage.sp_homepage_td_ticketing = sp_homepage_td_ticketing;
	}



	public static void setSp_homepage_td_ticketing_search(
			By sp_homepage_td_ticketing_search) {
		SpHomePage.sp_homepage_td_ticketing_search = sp_homepage_td_ticketing_search;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
