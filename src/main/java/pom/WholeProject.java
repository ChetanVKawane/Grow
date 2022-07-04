package pom;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WholeProject {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
//		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(7))
//				.ignoring(NoSuchElementException.class).withMessage("Element Exeption ");
//		wait.until(new Function<WebDriver,WebElement>(){
//			public WebElement apply(WebDriver driver) {
//				return driver.findElement(By.id(""));
//			}
		//});
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://groww.in");
		driver.manage().window().maximize();
		WebElement clickOnLogin=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/span"));
		clickOnLogin.click();
		////(2000);
		WebElement Email=driver.findElement(By.xpath("//input[@id=\"login_email1\"]"));
		Email.sendKeys("chetanvkawane@gmail.com");
		WebElement Continue=driver.findElement(By.xpath("//*[@id=\"lils382InitialLoginScreen\"]/div[4]/div[2]/div/div/div"));
		Continue.click();
		
		WebElement Password=driver.findElement(By.xpath("//input[@id=\"login_password1\"]"));
		Password.sendKeys("Baba@9403622034");
		WebElement Submit=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div[4]/div/div/div"));
		Submit.click();
		
		
		WebElement Pind1=driver.findElement(By.xpath("//*[@id=\"otpinput88parent\"]/div[1]/input"));
		Pind1.sendKeys("2");
		
		WebElement Pind2=driver.findElement(By.xpath("//*[@id=\"otpinput88parent\"]/div[2]/input"));
		Pind2.sendKeys("0");
	
		WebElement Pind3=driver.findElement(By.xpath("//*[@id=\"otpinput88parent\"]/div[3]/input"));
		Pind3.sendKeys("1");
		
		WebElement Pind4=driver.findElement(By.xpath("//*[@id=\"otpinput88parent\"]/div[4]/input"));
		Pind4.sendKeys("1");
	
		WebElement Search=driver.findElement(By.xpath("//a[@href=\"/stocks/user/investments\"]"));
		Search.click();
		Search.sendKeys("tat");
//	
//		Search.sendKeys(Keys.ARROW_DOWN);
//	
//		Search.sendKeys(Keys.ENTER);
		
//		WebElement Buy=driver.findElement(By.xpath("//div[text()=\"BUY\"]"));
//		Buy.click();
//		WebElement BSE=driver.findElement(By.xpath("//span[text()=\"BSE\"]"));
//		BSE.click();
//		WebElement Intraday=driver.findElement(By.xpath("//span[text()=\"Delivery\"]"));
//		Intraday.click();
//		WebElement Quantity=driver.findElement(By.xpath("//input[@class=\"qtyinputbox\"]"));
//		Quantity.sendKeys("100");
//		WebElement FinalBuy=driver.findElement(By.xpath("//span[text()=\"BUY\"]"));
//		FinalBuy.click();
		
	}

}
