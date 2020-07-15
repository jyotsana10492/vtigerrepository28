package objectrepository;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	@FindBy(xpath="//a[.='Opportunities']") private WebElement opportunybtn ;
	@FindBy(xpath="//a[text()='Organizations']") private WebElement organisationbtn ;
	@FindBy(xpath="//a[.='Contacts']") private WebElement createcontact;
	
	@FindBy(xpath="//a[text()='More']") private WebElement morelink;
	@FindBy(xpath="//a[text()='Vendors']") private WebElement vendorlink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']") private WebElement signOut;
	
	
	
	
	public WebElement getSignOut() {
		return signOut;
	}
	public WebElement getVendorlink() {
		return vendorlink;
	}
	public WebElement getMorelink() {
		return morelink;
	}
	public WebElement getCreatecontact() {
		return createcontact;
	}
	public WebElement getOpportunybtn() {
		return opportunybtn;
	}
	public WebElement getOrganisationbtn() {
		return organisationbtn;
	}
	

	public void clickonOpportunitybtn()
	{
		opportunybtn.click();
	}
	
	public void clickOnOrganisationbtn(){
	
		organisationbtn.click();
	}
	
	public void createContact()
	{
		createcontact.click();
	}
	
	public void clickonMore()
	{
		morelink.click();
	}
	
	public void clickonVendor()
	{
		
		vendorlink.click();
	}
	
	public homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
			
			
	
	
}

