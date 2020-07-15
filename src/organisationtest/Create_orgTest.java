package organisationtest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import objectrepository.Organisationpage;

public class Create_orgTest extends com.autod.crms.genericlib.BaseClass {
	
	@Test(enabled=false) //CopyingAddressToShiipingAddress
	public void copyingAddressInfoToShippingAddress() throws Throwable
	{
				wblib.waitForElement(driver);
		
		/*verification for login page*/
				String actual_Title=driver.getTitle();
				String expect_Title="vtiger CRM 5 - Commercial Open Source CRM";
				wblib.verify(actual_Title, expect_Title, "loginpage");
	
		/*Verification for Home page*/
				String acthomepage_Title=driver.getTitle();
				String exphomepage_Title="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
				wblib.verify(acthomepage_Title, exphomepage_Title, "homepage");
				
				Organisationpage op=new Organisationpage(driver);
				
				/*Click on Organization link*/
				op.clickonOrganization();
				
				/*Verification of Organization page*/
		String actOrgpage=driver.getTitle();
		String expOrgpage="Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM";
		wblib.verify(actOrgpage, expOrgpage, "Organization page");
		
		/*Click on "+" image button and get create Organization page along with enter some data in Address Section */
		op.createOrganisation();
		
		int rc=flib.countRow("./data/inputdata.xlsx", "sheet1");
		System.out.println(rc);
		
		String str[] = new String[6];
		int i;
		for(i =0; i<6; i++) {
			str[i] = flib.getExcelData("./data/inputdata.xlsx", "sheet1", 2, i);
		}
		
		op.getStreet().sendKeys(str[0]);
		op.getPoboxno().sendKeys(str[1]);
		op.getCity().sendKeys(str[2]);
		op.getState().sendKeys(str[3]);
		op.getCitycode().sendKeys(str[4]);
		op.getCountry().sendKeys(str[5]);
		
		

			//driver.findElement(By.xpath("//textarea[@name='bill_street']")).sendKeys(str[0]);
			
			//driver.findElement(By.xpath("//input[@name='bill_pobox']")).sendKeys(str[1]);
			
			//driver.findElement(By.xpath("//input[@name='bill_city']")).sendKeys(str[2]);
			
			//driver.findElement(By.xpath("//input[@name='bill_state']")).sendKeys(str[3]);
			
			//driver.findElement(By.xpath("//input[@name='bill_code']")).sendKeys(str[4]);
			
			//driver.findElement(By.xpath("//input[@name='bill_country']")).sendKeys(str[5]);
			
			/*Click on CopyAddress Radio button*/
		
		op.clickOnCopyAddressRadioBtn();	
		
	}
	
  
}

