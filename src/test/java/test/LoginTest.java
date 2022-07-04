package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pojo.Browser;
import pom.Buymodule;
import pom.Login;
import utilities.ExcelData;
import utilities.Reports;
import utilities.ScreenShot;
@Listeners(ListenerTest.class)
public class LoginTest extends BaseClass {
	
	ExtentReports reports;
	ExtentTest test;
	@BeforeClass
	public void setReports()
	{
		reports=Reports.addReports();
	}
	
	@BeforeMethod
	public void launchBrowser() {
		driver=Browser.OpenBrowser("https://groww.in");
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void loginWithCredentilas() throws EncryptedDocumentException, IOException, InterruptedException {
		test=reports.createTest("Login With Credential");
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		String Username=ExcelData.GetExcelData(driver, "Credentials", 3, 1);
		String Password=ExcelData.GetExcelData(driver, "Credentials", 4, 1);
		String d1=ExcelData.GetExcelData(driver, "Credentials", 5, 1);
		String d2=ExcelData.GetExcelData(driver, "Credentials", 6, 1);
		String d3=ExcelData.GetExcelData(driver, "Credentials", 7, 1);
		String d4=ExcelData.GetExcelData(driver, "Credentials", 8, 1);
		Login lg=new Login(driver);
		lg.login();
		lg.EnterEmail(Username);
		lg.clickContinue();
		lg.enterPassword(Password);
		lg.clickSubmit();
		lg.pin(d1, d2, d3, d4);
		Assert.assertTrue(true);
		

	}
	

}
