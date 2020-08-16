package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class TravelTicket extends Base {

	
	@FindBy(xpath="(//span[@class='tgl-btn'])[2]")
	WebElement chooseModeOfTravel;
	
	@FindBy(xpath="//span[text()='Chicago, IL']")
	WebElement chooseToCity;
	
	@FindBy(xpath="//div[@id='datePickerContainer']/div[1]/div[1]/table[1]/tbody[1]/tr[6]/td[2]/a[1]")
	WebElement selectDate;
	
	@FindBy(xpath="//button[contains(@class,'btn large')]")
	WebElement flightResult;	
	
	@FindBy(xpath="//div[contains(@class,'btnfare btn')]")
	WebElement firstFlightResult;
	
	@FindBy(xpath="//div[@class='src__Box-sc-1sbtrzs-0 kgkCCL']/following-sibling::div[1]")
	WebElement dateInNextPage;
	
	

	//Initializing the Page Objects:
	public TravelTicket(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public WebElement chooseTravelMode(){
		chooseModeOfTravel.click();
		return chooseTravelMode();
	}
	
	public WebElement chooseToCity(){
		chooseToCity.click();
		return chooseToCity();
	}
	public WebElement selectDate(){
		selectDate.click();
		return selectDate();
	}
			
			public WebElement searchResult(){
				flightResult.click();
				
				String newWin = driver.getWindowHandle();
				driver.switchTo().window(newWin);
				driver.switchTo().alert().dismiss();;
				return searchResult();
			
		}
		
			public WebElement firstFlightResult(){
				firstFlightResult.click();
				return firstFlightResult();
			}
			public String DateInNextPage(){
				return dateInNextPage.getText();
				
			
			}	
}
