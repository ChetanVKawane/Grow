package pom;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pojo.Browser;
import utilities.ExcelData;
import utilities.ScreenShot;

public class LoginPage {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=Browser.OpenBrowser("https://groww.in/");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		//Browser.ScreenShot(driver, "HomePage");
		String user=ExcelData.GetExcelData(driver, "Credentials", 3, 1);
		String pass=ExcelData.GetExcelData(driver, "Credentials", 4, 1);
		String Pindigit1=ExcelData.GetExcelData(driver, "Credentials", 5, 1);
		String Pindigit2=ExcelData.GetExcelData(driver, "Credentials", 6, 1);
		String Pindigit3=ExcelData.GetExcelData(driver, "Credentials", 7, 1);
		String Pindigit4=ExcelData.GetExcelData(driver, "Credentials", 8, 1);
		WebElement Login=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/span/span"));
		Login.click();
		
		WebElement Email=driver.findElement(By.xpath("//input[@id=\"login_email1\"]"));
		Email.sendKeys(user);
		WebElement Continue=driver.findElement(By.xpath("//*[@id=\"lils382InitialLoginScreen\"]/div[4]/div[2]/div/div/div"));
		Continue.click();
		
		WebElement Password=driver.findElement(By.xpath("//input[@id=\"login_password1\"]"));
		Password.sendKeys(pass);
		WebElement Submit=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div[4]/div/div/div/span"));
		Submit.click();
		
		WebElement PINdigit1=driver.findElement(By.xpath("//*[@id=\"otpinput88parent\"]/div[1]/input"));
		PINdigit1.sendKeys(Pindigit1);
		
		WebElement PINdigit2=driver.findElement(By.xpath("//*[@id=\"otpinput88parent\"]/div[2]/input"));
		PINdigit2.sendKeys(Pindigit2);
		
		WebElement PINdigit3=driver.findElement(By.xpath("//*[@id=\"otpinput88parent\"]/div[3]/input"));
		PINdigit3.sendKeys(Pindigit3);
		
		WebElement PINdigit4=driver.findElement(By.xpath("//*[@id=\"otpinput88parent\"]/div[4]/input"));
		PINdigit4.sendKeys(Pindigit4);
		
		//WebElement ForgotPass=driver.findElement(By.xpath("//div[@title=\"Click here to reset your password\"]"));
		ScreenShot.Screenshot(driver, "HomePage");
		driver.quit();	}
	

}
