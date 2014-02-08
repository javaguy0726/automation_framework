package org.jbehave.webdriver.sp.pages.ticketing;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import org.jbehave.web.selenium.WebDriverProvider;
import org.jbehave.webdriver.sp.pages.SpAbstractPage;
import org.jbehave.webdriver.sp.pages.login.SpLoginPage;
import org.junit.Test;
import org.openqa.selenium.By;

public class SpTicketingSearchPage extends SpAbstractPage {

	private final WebDriverProvider driverProvider;
	
	public SpTicketingSearchPage(WebDriverProvider driverProvider) {
		super(driverProvider);
		this.driverProvider=driverProvider;
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
	public static By sp_ticketing_searchpage_td_incidentdate;
	public static By sp_ticketing_searchpage_td_closedate;
	public static By sp_ticketing_searchpage_td_shiptoaddress;
	public static By sp_ticketing_searchpage_td_contact;
	public static By sp_ticketing_searchpage_td_requester;
	public static By sp_ticketing_searchpage_td_createby;
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
	
	//Add the tds first and then Add labels
	public List<String> getPageLabels(){
		ArrayList<String> labels = new ArrayList<>();
		for(By label: getCurrentPageLocatorsByTag("td")){
			labels.add(td(label).getText().toString());
		}
//		for(By label: getCurrentPageLocatorsByTag("label")){
//			labels.add(label(label).getText().toString());
//		}
		return labels;	
	}
	
	
	
	
	
	
	/*other private methods*/
	// Get the expected By object for each type
	private List<By> getCurrentPageLocatorsByTag(String tag) {
		ArrayList<By> list = new ArrayList<By>();
		for (Field field : getExpectedFields(tag)) {
			try {
				list.add((By)field.get(this));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	
	
	// Get the field names list
	private List<Field> getExpectedFields(String tag){
		Class<?> cls = gotClass(this.getClass().getName());
		tag = "_"+tag+"_";
		Field[] fields = cls.getDeclaredFields();
		ArrayList<Field> fieldList = new ArrayList<Field>();
		for (Field field : fields) {
			if(field.getName().contains(tag)){
				fieldList.add(field);
			}
		}
		return fieldList;
	}
	
	// Get just the name of the class except for full package path
	private String typeName(Class<?> cls) {
		String brackets = "";
		while (cls.isArray()) {         // if it is multidemensional array, print each bracket
			brackets += "[]";
			cls = cls.getComponentType();
		}
		String full_name = cls.getName();     //this get the package name + class name
		int pos = full_name.lastIndexOf('.');
		if (pos != -1)
			full_name = full_name.substring(pos + 1);
		return full_name + brackets;
	}
	
	//Get the target class
	private Class<?> gotClass(String className) {
		Class<?> cls = null;
		try {
			cls = Class.forName(className);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cls;
	}
	
	private static String modifier(int m) {
		if (m == 0)
			return "";
		else
			return Modifier.toString(m) + " ";
	}






	public static void setSp_ticketing_searchpage_link_search(
			By sp_ticketing_searchpage_link_search) {
		SpTicketingSearchPage.sp_ticketing_searchpage_link_search = sp_ticketing_searchpage_link_search;
	}






	public static void setSp_ticketing_searchpage_link_clear(
			By sp_ticketing_searchpage_link_clear) {
		SpTicketingSearchPage.sp_ticketing_searchpage_link_clear = sp_ticketing_searchpage_link_clear;
	}






	public static void setSp_ticketing_searchpage_span_msg(
			By sp_ticketing_searchpage_span_msg) {
		SpTicketingSearchPage.sp_ticketing_searchpage_span_msg = sp_ticketing_searchpage_span_msg;
	}






	public static void setSp_ticketing_searchpage_td_incidentno(
			By sp_ticketing_searchpage_td_incidentno) {
		SpTicketingSearchPage.sp_ticketing_searchpage_td_incidentno = sp_ticketing_searchpage_td_incidentno;
	}






	public static void setSp_ticketing_searchpage_td_description(
			By sp_ticketing_searchpage_td_description) {
		SpTicketingSearchPage.sp_ticketing_searchpage_td_description = sp_ticketing_searchpage_td_description;
	}






	public static void setSp_ticketing_searchpage_td_priority(
			By sp_ticketing_searchpage_td_priority) {
		SpTicketingSearchPage.sp_ticketing_searchpage_td_priority = sp_ticketing_searchpage_td_priority;
	}






	public static void setSp_ticketing_searchpage_td_customer_ticketno(
			By sp_ticketing_searchpage_td_customer_ticketno) {
		SpTicketingSearchPage.sp_ticketing_searchpage_td_customer_ticketno = sp_ticketing_searchpage_td_customer_ticketno;
	}






	public static void setSp_ticketing_searchpage_td_status(
			By sp_ticketing_searchpage_td_status) {
		SpTicketingSearchPage.sp_ticketing_searchpage_td_status = sp_ticketing_searchpage_td_status;
	}






	public static void setSp_ticketing_searchpage_td_noofdays(
			By sp_ticketing_searchpage_td_noofdays) {
		SpTicketingSearchPage.sp_ticketing_searchpage_td_noofdays = sp_ticketing_searchpage_td_noofdays;
	}






	public static void setSp_ticketing_searchpage_td_customer(
			By sp_ticketing_searchpage_td_customer) {
		SpTicketingSearchPage.sp_ticketing_searchpage_td_customer = sp_ticketing_searchpage_td_customer;
	}






	public static void setSp_ticketing_searchpage_td_incidentdate(
			By sp_ticketing_searchpage_td_incidentdate) {
		SpTicketingSearchPage.sp_ticketing_searchpage_td_incidentdate = sp_ticketing_searchpage_td_incidentdate;
	}






	public static void setSp_ticketing_searchpage_td_closedate(
			By sp_ticketing_searchpage_td_closedate) {
		SpTicketingSearchPage.sp_ticketing_searchpage_td_closedate = sp_ticketing_searchpage_td_closedate;
	}






	public static void setSp_ticketing_searchpage_td_shiptoaddress(
			By sp_ticketing_searchpage_td_shiptoaddress) {
		SpTicketingSearchPage.sp_ticketing_searchpage_td_shiptoaddress = sp_ticketing_searchpage_td_shiptoaddress;
	}






	public static void setSp_ticketing_searchpage_td_contact(
			By sp_ticketing_searchpage_td_contact) {
		SpTicketingSearchPage.sp_ticketing_searchpage_td_contact = sp_ticketing_searchpage_td_contact;
	}






	public static void setSp_ticketing_searchpage_td_requester(
			By sp_ticketing_searchpage_td_requester) {
		SpTicketingSearchPage.sp_ticketing_searchpage_td_requester = sp_ticketing_searchpage_td_requester;
	}






	public static void setSp_ticketing_searchpage_td_createby(
			By sp_ticketing_searchpage_td_createby) {
		SpTicketingSearchPage.sp_ticketing_searchpage_td_createby = sp_ticketing_searchpage_td_createby;
	}






	public static void setSp_ticketing_searchpage_td_unitid(
			By sp_ticketing_searchpage_td_unitid) {
		SpTicketingSearchPage.sp_ticketing_searchpage_td_unitid = sp_ticketing_searchpage_td_unitid;
	}






	public static void setSp_ticketing_searchpage_td_feowner(
			By sp_ticketing_searchpage_td_feowner) {
		SpTicketingSearchPage.sp_ticketing_searchpage_td_feowner = sp_ticketing_searchpage_td_feowner;
	}






	public static void setSp_ticketing_searchpage_td_contract(
			By sp_ticketing_searchpage_td_contract) {
		SpTicketingSearchPage.sp_ticketing_searchpage_td_contract = sp_ticketing_searchpage_td_contract;
	}






	public static void setSp_ticketing_searchpage_td_sro(
			By sp_ticketing_searchpage_td_sro) {
		SpTicketingSearchPage.sp_ticketing_searchpage_td_sro = sp_ticketing_searchpage_td_sro;
	}






	public static void setSp_ticketing_searchpage_td_srostatus(
			By sp_ticketing_searchpage_td_srostatus) {
		SpTicketingSearchPage.sp_ticketing_searchpage_td_srostatus = sp_ticketing_searchpage_td_srostatus;
	}






	public static void setSp_ticketing_searchpage_label_status_open(
			By sp_ticketing_searchpage_label_status_open) {
		SpTicketingSearchPage.sp_ticketing_searchpage_label_status_open = sp_ticketing_searchpage_label_status_open;
	}






	public static void setSp_ticketing_searchpage_label_status_assigned(
			By sp_ticketing_searchpage_label_status_assigned) {
		SpTicketingSearchPage.sp_ticketing_searchpage_label_status_assigned = sp_ticketing_searchpage_label_status_assigned;
	}






	public static void setSp_ticketing_searchpage_label_status_inprogress(
			By sp_ticketing_searchpage_label_status_inprogress) {
		SpTicketingSearchPage.sp_ticketing_searchpage_label_status_inprogress = sp_ticketing_searchpage_label_status_inprogress;
	}






	public static void setSp_ticketing_searchpage_label_status_schedule(
			By sp_ticketing_searchpage_label_status_schedule) {
		SpTicketingSearchPage.sp_ticketing_searchpage_label_status_schedule = sp_ticketing_searchpage_label_status_schedule;
	}






	public static void setSp_ticketing_searchpage_label_status_escalated(
			By sp_ticketing_searchpage_label_status_escalated) {
		SpTicketingSearchPage.sp_ticketing_searchpage_label_status_escalated = sp_ticketing_searchpage_label_status_escalated;
	}






	public static void setSp_ticketing_searchpage_label_status_csg(
			By sp_ticketing_searchpage_label_status_csg) {
		SpTicketingSearchPage.sp_ticketing_searchpage_label_status_csg = sp_ticketing_searchpage_label_status_csg;
	}






	public static void setSp_ticketing_searchpage_label_status_hold(
			By sp_ticketing_searchpage_label_status_hold) {
		SpTicketingSearchPage.sp_ticketing_searchpage_label_status_hold = sp_ticketing_searchpage_label_status_hold;
	}






	public static void setSp_ticketing_searchpage_label_status_resolved(
			By sp_ticketing_searchpage_label_status_resolved) {
		SpTicketingSearchPage.sp_ticketing_searchpage_label_status_resolved = sp_ticketing_searchpage_label_status_resolved;
	}






	public static void setSp_ticketing_searchpage_label_status_closed(
			By sp_ticketing_searchpage_label_status_closed) {
		SpTicketingSearchPage.sp_ticketing_searchpage_label_status_closed = sp_ticketing_searchpage_label_status_closed;
	}






	public static void setSp_ticketing_searchpage_label_noofdays_na(
			By sp_ticketing_searchpage_label_noofdays_na) {
		SpTicketingSearchPage.sp_ticketing_searchpage_label_noofdays_na = sp_ticketing_searchpage_label_noofdays_na;
	}






	public static void setSp_ticketing_searchpage_label_noofdays_today(
			By sp_ticketing_searchpage_label_noofdays_today) {
		SpTicketingSearchPage.sp_ticketing_searchpage_label_noofdays_today = sp_ticketing_searchpage_label_noofdays_today;
	}






	public static void setSp_ticketing_searchpage_label_noofdays_1(
			By sp_ticketing_searchpage_label_noofdays_1) {
		SpTicketingSearchPage.sp_ticketing_searchpage_label_noofdays_1 = sp_ticketing_searchpage_label_noofdays_1;
	}






	public static void setSp_ticketing_searchpage_label_noofdays_30(
			By sp_ticketing_searchpage_label_noofdays_30) {
		SpTicketingSearchPage.sp_ticketing_searchpage_label_noofdays_30 = sp_ticketing_searchpage_label_noofdays_30;
	}






	public static void setSp_ticketing_searchpage_label_noofdays_60(
			By sp_ticketing_searchpage_label_noofdays_60) {
		SpTicketingSearchPage.sp_ticketing_searchpage_label_noofdays_60 = sp_ticketing_searchpage_label_noofdays_60;
	}






	public static void setSp_ticketing_searchpage_label_noofdays_90(
			By sp_ticketing_searchpage_label_noofdays_90) {
		SpTicketingSearchPage.sp_ticketing_searchpage_label_noofdays_90 = sp_ticketing_searchpage_label_noofdays_90;
	}






	public static void setSp_ticketing_searchpage_select_priority(
			By sp_ticketing_searchpage_select_priority) {
		SpTicketingSearchPage.sp_ticketing_searchpage_select_priority = sp_ticketing_searchpage_select_priority;
	}






	public static void setSp_ticketing_searchpage_select_srostatus(
			By sp_ticketing_searchpage_select_srostatus) {
		SpTicketingSearchPage.sp_ticketing_searchpage_select_srostatus = sp_ticketing_searchpage_select_srostatus;
	}

	
	
}
