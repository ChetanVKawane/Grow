package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pojo.Browser;
import pom.GrowwHomePage;
import pom.Login;
import pom.LoginPage;

public class HomepageTest {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void openBrowser() {
		driver=Browser.OpenBrowser("http://groww.in");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@Test
	public void homepage() {
		Login lg=new Login(driver);
		lg.login();
		lg.EnterEmail("chetanvkawane@gmail.com");
		lg.clickContinue();
		lg.enterPassword("Baba@9403622034");
		lg.clickSubmit();
		lg.pin("2", "0", "1", "1");
		GrowwHomePage gp=new GrowwHomePage(driver);
		gp.investment();
		gp.search("tat");
		
	}

}
