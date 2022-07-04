package test;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import utilities.ScreenShot;

public class ListenerTest extends BaseClass implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		System.out.println("Started"+ result.getName());		
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("My test is Successfull"+result.getName());
	}
	 public void onTestFailure(ITestResult result) {
		 try {
			 ScreenShot.Screenshot(driver, result.getName());
		 }
		 catch(IOException e) {
			 e.printStackTrace();
		 }
	 }
	 
	 public void onTestSkipped(ITestResult result) {
		 System.out.println("My Test Skipped"+ result.getName());
	 }

}
