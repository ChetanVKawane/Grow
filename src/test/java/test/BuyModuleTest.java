package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.Buymodule;
import pom.Login;

public class BuyModuleTest {
	
	@Test
	public void buyShare() {
		WebDriver driver=Browser.OpenBrowser("http://groww.in");
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Login lg=new Login(driver);
		Buymodule bm=new Buymodule(driver);
		lg.login();
		lg.EnterEmail("chetanvkawane@gmail.com");
		lg.clickContinue();
		lg.enterPassword("Baba@9403622034");
		lg.clickSubmit();
		lg.pin("2", "0", "1","1");
		bm.searchShare("tata");
	}
}
	
	


