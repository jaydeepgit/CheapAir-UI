package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.TravelTicket;
import base.Base;
import util.Util;

public class TravelTicketTest extends Base {
	TravelTicket travelTicket;
	Util util;
	
	public TravelTicketTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		util = new Util();
		travelTicket = new TravelTicket();
	}
	


@Test
public void verifyDateInNextPageTest(){
	travelTicket.chooseTravelMode();
	System.out.println("Travel mode oneways selected");
	
	travelTicket.chooseToCity();
	System.out.println("City Chicago selected");
	
	travelTicket.selectDate();
	System.out.println("Date Mon - Aug 31st, 2020 selected");
	
	travelTicket.searchResult();
	System.out.println("Flight Search result is appeared");
	
	travelTicket.firstFlightResult();
	System.out.println("Flight details page appeared after clicking on first flight in the page");
	
	String DateValue= travelTicket.DateInNextPage();
	Assert.assertEquals(DateValue, "Mon - Aug 31st, 2020");
	System.out.println("expected and Actual Date value is matching");
	
	
	
}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
}
