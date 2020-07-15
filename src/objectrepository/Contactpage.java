package objectrepository;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactpage {
	
@FindBy(xpath="//a[.='Contacts']") private WebElement createlink;
	
	public WebElement getCreatecontact() {
		return createcontact;
	}

	@FindBy(xpath="//img[@alt='Create Contact...']") private WebElement createcontact;
	@FindBy(name="lastname") private WebElement lastnametxtbox;
	@FindBy(name="firstname") private WebElement firstnametxtbox;
	@FindBy(xpath="//input[@value='  Save  ']") private WebElement savebtn;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']") private WebElement adminimg; 
	@FindBy(xpath="//a[.='Sign Out']") private WebElement signOutlink; 

	

	

	public WebElement getAdminimg() {
		return adminimg;
	}

	public WebElement getSignOutlink() {
		return signOutlink;
	}

	public WebElement getFirstnametxtbox() {
		return firstnametxtbox;
	}

	public WebElement getLastnametxtbox() {
		return lastnametxtbox;
	}

	public WebElement getCreateOrgimg() {
		return createcontact;
	}
	
	public void createContact()
	{
		createcontact.click();
	}
	
	public void clickOnCreateLink()
	{
		createlink.click();
	}
	
	public void enterName(String lastname,String firstname)
	{
		lastnametxtbox.sendKeys(lastname);
		firstnametxtbox.sendKeys(firstname);
		savebtn.click();
	}
	
	public void hoverOnAdminimage()
	{
		adminimg.click();
		
	}
	
	public void clkonSignOutlink()
	{
		signOutlink.click();
	}
	
	public Contactpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	

}
	
