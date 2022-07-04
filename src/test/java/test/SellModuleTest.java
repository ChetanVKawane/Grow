package test;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.Login;
import pom.SellModule;
import utilities.ScreenShot;

public class SellModuleTest {
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@Test
	public void callBrowser() throws InterruptedException, IOException {
		driver=Browser.OpenBrowser("https://groww.in");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		Login lg=new Login(driver);
		lg.login();
		
		lg.EnterEmail("chetanvkawane@gmail.com");
		lg.clickContinue();
		
		lg.enterPassword("Baba@9403622034");
		lg.clickSubmit();
		
		lg.enterPindidit1("2");
		
		lg.enterPindidit2("0");
		
		lg.enterPindidit3("1");
		
		lg.enterPindidit4("1");
		
		
		SellModule sm=new SellModule(driver);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(5000));
		wait.wait(0).shareSearch("tata");
		
		sm.clickonSell();
		
		sm.advancedOPtions();
		sm.stopLossOrder();
		
		sm.stopLossInfo();
		
		ScreenShot.Screenshot(driver, "Info");
		sm.slinfoBack();
		ScreenShot.Screenshot(driver, "Stoploss");
		driver.close();
		//sm.selectType();
//		sm.selectMarket();
//		
//		sm.sharesQuantity("100");
//		
//		sm.priceMarket();
//		
//		sm.advancedOPtions();
//		
//		sm.finalSell();
		//driver.close();
	}

}
