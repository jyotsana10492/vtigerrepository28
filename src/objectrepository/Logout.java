package objectrepository;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	
	@FindBy(xpath="//a[.='Sign Out']") private WebElement signOutlink; 

	public WebElement getLogoutbtn() {
		return signOutlink;
	}
	
	public void logoutApp()
	{
		signOutlink.click();
	}
	
	public Logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}


