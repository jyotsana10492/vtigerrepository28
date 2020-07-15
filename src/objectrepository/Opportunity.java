package objectrepository;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Opportunity {
	
	
	
	
	
	
	
	@FindBy(xpath="//input[@id='4']/../..//a[.='edit']") private WebElement frstcheckbox;
	@FindBy(xpath="//input[@name='potentialname']") private WebElement oopname;
	@FindBy(xpath="//input[@class='crmButton small save']") private WebElement savebtn;
	@FindBy(xpath="//a[.='Sign Out']") private WebElement signOutlink;
	
	public WebElement getSignOutlink() {
		return signOutlink;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getOopname() {
		return oopname;
	}

	public WebElement getFrstcheckbox() {
		return frstcheckbox;
	}
	
	public void slelectchkboxandclkedit()
	{
		frstcheckbox.click();
	}
	
	public void modifyoppname(String oppnames)
	{
		oopname.sendKeys(oppnames);
		savebtn.click();
	}
	
	public void signOutPage()
	{
		signOutlink.click();
	}
	
	
	
	public Opportunity(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}



