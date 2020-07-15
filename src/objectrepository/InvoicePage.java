package objectrepository;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoicePage {

	@FindBy(xpath="//a[.='Invoice']") private WebElement invoicelink;
	@FindBy(xpath="//select[@id='bas_searchfield']") private WebElement invoicedropdwn;

	public WebElement getInvoicelink() {
		return invoicelink;
	}
	
	public void clickOnInvoice()
	{
		invoicelink.click();
	}
	
	public WebElement getInvoicedropdwn() {
		return invoicedropdwn;
	}
	
	public void clickonInvoicedropdown()
	{
		invoicedropdwn.click();
		
	}

	public InvoicePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}

