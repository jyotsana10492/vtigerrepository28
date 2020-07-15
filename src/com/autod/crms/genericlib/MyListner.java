package com.autod.crms.genericlib;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class MyListner extends BaseClass implements ITestListener  {

	

	private static final File src = null;
	private OutputStream dest;

	@Override
	public void onTestStart(ITestResult result) {
		
		//ITestListener.super.onTestStart(result);
		Reporter.log(getName()+ "Test started",true);
	}

	private String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testname=result.getName();
		Reporter.log(testname+"Test Failed" ,true);
	
		TakesScreenshot ts = ( TakesScreenshot)driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File dest = new File("D:\\SCSA2_Fastrack\\screenshots\\ActiFailTest1.png");
		
		try {
		Files.copy(src, dest);	
		}
		catch(IOException e){
		e.printStackTrace();	
		}
			
			
		}
	

	@Override
	public void onTestFailure(ITestResult result) {
		// 
		ITestListener.super.onTestFailure(result);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		
		ITestListener.super.onStart(context);
		Reporter.log("Execution Staarting",true);
	}

	@Override
	public void onFinish(ITestContext context) {
		
		ITestListener.super.onFinish(context);
		Reporter.log("Execution Completed",true);
	}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
