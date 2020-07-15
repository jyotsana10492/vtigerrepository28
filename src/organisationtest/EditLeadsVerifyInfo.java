package organisationtest;

import java.lang.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.autod.crms.genericlib.BaseClass;

import objectrepository.Opportunity;
import objectrepository.homepage;

public class EditLeadsVerifyInfo extends BaseClass{
	
	
	
	@Test(enabled=false) //(Opportunity)Edit leads using edit and verify the lead information	

	public void EditLeadsAndVerifyInfo() throws Throwable
	{
						
		/*verification for login page*/
				String actual_Title=driver.getTitle();
				String expect_Title="vtiger CRM 5 - Commercial Open Source CRM";
				wblib.verify(actual_Title, expect_Title, "loginpage");
		
		/*Verification for Home page*/
				String acthomepage_Title=driver.getTitle();
				String exphomepage_Title="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
				wblib.verify(acthomepage_Title, exphomepage_Title, "homepage");
				
		
		homepage hp=new homepage(driver);
		
		/*Click on Opportunity Link*/
		hp.clickonOpportunitybtn();
		
		/*Verification for Opportunity page*/
		String actOpppage_Title=driver.getTitle();
		String expOppage_Title="Administrator - Opportunities - vtiger CRM 5 - Commercial Open Source CRM";
		wblib.verify(actOpppage_Title, expOppage_Title, "Oppurtunities page");
		
		
		
		Opportunity op=new Opportunity(driver);
		
		/*Select one Opportunity and Click on edit*/
		op.slelectchkboxandclkedit();
		
		/*Verification for Editing Opportunity page*/
		String actual_edit=driver.findElement(By.xpath("//span[@class='lvtHeaderText']")).getText();

		actual_edit = actual_edit.substring(actual_edit.lastIndexOf('-') + 2);
		String expexted_edit="Editing Opportunity Information";
		wblib.verify(actual_edit, expexted_edit, "Editing Opportunity");
		
		/*Modify data in that page and also  save it*/
		op.modifyoppname("Acess");
		
				
		/*Verification for Loginpage again displayed or not*/
		wblib.verify(actual_Title, expect_Title, "loginpage");
		
		
		
		
	}

}