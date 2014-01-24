package org.jbehave.webdriver.sp.pages.ticketing;

import org.jbehave.web.selenium.WebDriverProvider;
import org.jbehave.webdriver.sp.pages.SpAbstractPage;
import org.jbehave.webdriver.sp.pages.login.SpLoginPage;
import org.openqa.selenium.By;

public class SpTicketingSearchPage extends SpAbstractPage {

	public SpTicketingSearchPage(WebDriverProvider driverProvider) {
		super(driverProvider);
	}

	/*Locators for sp ticketing - search page*/
	/*Links*/
	public static By sp_ticketing_searchpage_link_search;
	public static By sp_ticketing_searchpage_link_clear;
	
	/*Spans*/
	public static By sp_ticketing_searchpage_span_msg;
	
	/*tds*/
	public static By sp_ticketing_searchpage_td_incidentno;
	public static By sp_ticketing_searchpage_td_description;
	public static By sp_ticketing_searchpage_td_priority;
	public static By sp_ticketing_searchpage_td_customer_ticketno;
	public static By sp_ticketing_searchpage_td_status;
	public static By sp_ticketing_searchpage_td_noofdays;
	public static By sp_ticketing_searchpage_td_customer;
	public static By sp_ticketing_searchpage_td_shiptoaddress;
	public static By sp_ticketing_searchpage_td_incidentdate;
	public static By sp_ticketing_searchpage_td_closedate;
	public static By sp_ticketing_searchpage_td_contact;
	public static By sp_ticketing_searchpage_td_requester;
	public static By sp_ticketing_searchpage_td_unitid;
	public static By sp_ticketing_searchpage_td_feowner;
	public static By sp_ticketing_searchpage_td_contract;
	public static By sp_ticketing_searchpage_td_sro;
	public static By sp_ticketing_searchpage_td_srostatus;
	
	/*Labels*/
	public static By sp_ticketing_searchpage_label_status_open;
	public static By sp_ticketing_searchpage_label_status_assigned;
	public static By sp_ticketing_searchpage_label_status_inprogress;
	public static By sp_ticketing_searchpage_label_status_schedule;
	public static By sp_ticketing_searchpage_label_status_escalated;
	public static By sp_ticketing_searchpage_label_status_csg;
	public static By sp_ticketing_searchpage_label_status_hold;
	public static By sp_ticketing_searchpage_label_status_resolved;
	public static By sp_ticketing_searchpage_label_status_closed;
	public static By sp_ticketing_searchpage_label_noofdays_na;
	public static By sp_ticketing_searchpage_label_noofdays_today;
	public static By sp_ticketing_searchpage_label_noofdays_1;
	public static By sp_ticketing_searchpage_label_noofdays_30;
	public static By sp_ticketing_searchpage_label_noofdays_60;
	public static By sp_ticketing_searchpage_label_noofdays_90;
	
	/*Selects*/
	public static By sp_ticketing_searchpage_select_priority;
	public static By sp_ticketing_searchpage_select_srostatus;
	
	
	/*Actions for ticketing - search page*/
	public SpTicketingSearchPage open(){
		get("http://test.mysplogon.com/SinglePoint/Login.aspx");
		
		return this;
	}
	
	
	
	
	
	
}
