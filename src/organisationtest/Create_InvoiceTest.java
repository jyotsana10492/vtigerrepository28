package organisationtest;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.autod.crms.genericlib.BaseClass;
import com.autod.crms.genericlib.WebDriverCommonLib;

import objectrepository.InvoicePage;
import objectrepository.homepage;
public class Create_InvoiceTest extends BaseClass {
	
	
	@Test(enabled=true) //create contact With Plus icon
		public void createContact() throws Throwable
		{
			
			/*Verification for Home page*/
			String acthomepage_Title=driver.getTitle();
			String exphomepage_Title="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
			wblib.verify(acthomepage_Title, exphomepage_Title, "homepage");
			
			homepage hp=new homepage(driver);
			hp.clickonMore();
			
			InvoicePage ip=new InvoicePage(driver);
			ip.clickOnInvoice();
			
			/*Verification for Invoice page*/
					String actinvoicepage_Title=driver.getTitle();
					String expinvoicepage_Title="Administrator - Invoice - vtiger CRM 5 - Commercial Open Source CRM";
					wblib.verify(actinvoicepage_Title, expinvoicepage_Title, "Invoice page");
					
				/*click on invoice dropdown*/	
					ip.clickonInvoicedropdown();
					
		}

	}


	
