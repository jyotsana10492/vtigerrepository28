package objectrepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organisationpage {

@FindBy(xpath="//a[.='Organizations']") private WebElement clkOrglink;
	
	public WebElement getClkOrglink() {
		return clkOrglink;
	}

	@FindBy(xpath="//img[@alt='Create Organization...']") private WebElement createOrgimg;
	
	@FindBy(xpath="//b[.='Copy Shipping address']/..//input[@type='radio']") private WebElement coyshiipingradiobtn;
	
	@FindBy(xpath="//b[.='Copy Shipping address']/..//input[@type='radio']") private WebElement clkradiobtn;
	
	@FindBy(xpath="//textarea[@name='bill_street']") private WebElement street ;
	
	@FindBy(xpath="//input[@name='bill_pobox']") private WebElement poboxno ;
	
	@FindBy(xpath="//input[@name='bill_city']") private WebElement city ;
	
	@FindBy(xpath="//input[@name='bill_state']") private WebElement state ;
	
	@FindBy(xpath="//input[@name='bill_code']") private WebElement citycode ;
	
	@FindBy(xpath="//input[@name='bill_country']") private WebElement country ;
	
	
	

	public WebElement getStreet() {
		return street;
	}

	public WebElement getPoboxno() {
		return poboxno;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCitycode() {
		return citycode;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getClkradiobtn() {
		return clkradiobtn;
	}

	public WebElement getCoyshiipingradiobtn() {
		return coyshiipingradiobtn;
	}

	public WebElement getCreateOrgimg() {
		return createOrgimg;
	}
	
	public void clickonOrganization()
	{
		clkOrglink.click();
	}
	
	public void createOrganisation()
	{
		createOrgimg.click();
	}
	
	public void clkoncoyshiipingradiobtn()
	{
		coyshiipingradiobtn.click();
	}
	
	public void clickOnCopyAddressRadioBtn()
	{
		clkradiobtn.click();
	}
	
	public Organisationpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	

}

