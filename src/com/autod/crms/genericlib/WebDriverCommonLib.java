package com.autod.crms.genericlib;





import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.google.common.io.Files;


	
	/**
	 * 
	 * @author jyotsana
	 *
	 */

	public class WebDriverCommonLib {
		/**
		 * wait for element status based on visibility
		 * @param element
		 * @param driver
		 */
		
		public void waitForElementStatus(WebElement element,WebDriver driver)
		{
			WebDriverWait wait=new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		
		/**
		 * wait for title based on availability
		 * @param title
		 * @param driver
		 */
		public void waitForTitleContain(String title,WebDriver driver)
		{
			WebDriverWait wait=new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.titleContains(title));
		}
		/**
		 * wait for element load
		 * @param driver
		 */
		public void waitForElement(WebDriver driver)
		{
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}
		/**
		 * used to select content of the dropdown based on text
		 * @param element
		 * @param text
		 */
		public void select(WebElement element,String text)
		{
			Select sel=new Select(element);
			sel.selectByVisibleText(text);
		}
		/**
		 * used to select content of the dropdown based on index
		 * @param element
		 * @param index
		 */
		public void select(WebElement element,int index)
		{
			Select sel=new Select(element);
			sel.selectByIndex(index);
		}
		/**
		 * used to take mouse cursor on the element
		 * @param element
		 * @param driver
		 */
		public void moveToElement(WebElement element,WebDriver driver)
		{
			Actions ac=new Actions(driver);
			ac.moveToElement(element).perform();
			
		}
		
		/**
		 * use to rightclick by mouse
		 * @param element
		 * @param driver
		 */
		public void rightClick(WebElement element,WebDriver driver)
		{
			Actions ac=new Actions(driver);
			ac.contextClick(element).perform();
			
		}
		/**
		 * use to double click by mouse
		 * @param element
		 * @param driver
		 */
		public void doubleClick(WebElement element,WebDriver driver)
		{
			Actions ac=new Actions(driver);
			ac.doubleClick(element).perform();
			
		}
		/**
		 * used to drag and drop element
		 * @param src
		 * @param desti
		 * @param driver
		 */
		public void dragandDrops(WebElement src,WebElement desti, WebDriver driver)
		{
			Actions ac=new Actions(driver);
			ac.dragAndDrop(src, desti).perform();
			
		}
		
		/*public void takeScreenshots(WebElement src,WebElement desti, WebDriver driver)
		{
			Random r=new Random();
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
		
			File dest = new File("./Screenshots/"+screenshot+".png");
			Files.copy(src, desti);
		}*/
		/**
		 * used to switch to any window based in page title
		 * @param driver
		 * @param pageTitle
		 */
		public void switchToNewTab(WebDriver driver,String pageTitle)
		{
			Set<String> setlist=driver.getWindowHandles();
			Iterator<String> it=setlist.iterator();
			
			
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				String actPageTitle=driver.getTitle();
				
				if(actPageTitle.contains(pageTitle))
				{
 					break;
				}
			}
		}
		/**
		 * used to verify actual and expected result with assert
		 * @param act
		 * @param exp
		 * @param msg
		 */
		public void verify(String act,String exp,String msg)
		{
			Assert.assertEquals(act, exp);
			Reporter.log(msg+" test passed",true);
		}
		/**
		 * used to click on alert
		 * @param driver
		 */
		public void acceptAlert(WebDriver driver)
		{
			driver.switchTo().alert().accept();
		}
		/**
		 * used to click dismis on alert
		 * @param driver
		 */
		public void cancelAlert(WebDriver driver)
		{
			driver.switchTo().alert().dismiss();;
		}
		/**
		 * used to get title of webpage
		 * @param driver
		 * @return
		 */
		public String getTitlePage(WebDriver driver)
		{
			String title = driver.getTitle();
			return title;
		}
		
		public void select1(WebElement element,String text)
		{
			Select sel=new Select(element);
			sel.selectByVisibleText(text);
		}
		
		public void select(String value,WebElement element)
		{
			Select sel=new Select(element);
			sel.selectByValue(value);
		}
		
		public void select1(WebElement element,int index)
		{
			Select sel=new Select(element);
			sel.selectByIndex(index);
			
		}
		
		

	}
	
