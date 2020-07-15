package objectrepository;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vendorpage {

	
	
	
@FindBy(xpath="//img[@alt='Create Vendor...']") private WebElement createVendor;
	
	@FindBy(xpath="//input[@value='  Save  ']") private WebElement savebtn;
	@FindBy(xpath="//input[@name='vendorname']") private WebElement vendornametxt;
	
	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getCreateVendor() {
		return createVendor;
	}
	
  public void createVendor()
	{
	  createVendor.click();
	}
  
  public void vendornametxtbox(String vendorname)
  {
	  vendornametxt.sendKeys(vendorname);
  }
  
  public WebElement getVendornametxt() {
	return vendornametxt;
}

public void clkonSaveBtn()
  {
	  savebtn.click();
  }
  
  public Vendorpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
  
  
	

}


