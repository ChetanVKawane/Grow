package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login {
	@FindBy(xpath="//span[text()=\"Login/Register\"]") private WebElement Login;
	@FindBy(xpath="//input[@id=\"login_email1\"]")private WebElement Email;
	@FindBy(xpath="//span[text()=\"Continue\"]")private WebElement Continue;
	@FindBy(xpath="//input[@id=\"login_password1\"]")private WebElement Password;
	@FindBy(xpath="//span[text()=\"Submit\"]")private WebElement Submit;
	@FindBy(xpath="//*[@id=\"otpinput88parent\"]/div[1]/input")private WebElement PINdigit1;
	@FindBy(xpath="//*[@id=\"otpinput88parent\"]/div[2]/input")private WebElement PINdigit2; 
	@FindBy(xpath="//*[@id=\"otpinput88parent\"]/div[3]/input")private WebElement PINdigit3;
	@FindBy(xpath="//*[@id=\"otpinput88parent\"]/div[4]/input")private WebElement PINdigit4;
	@FindBy(xpath="//div[text()=\"Logout\"]")private WebElement Logout;
	
	public Login(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	public void login() {
		Login.click();
	}
	
	public void EnterEmail(String email) {
		Email.sendKeys(email);
	}
	public void clickContinue() {
		Continue.click();
	}
	
	public void enterPassword(String pass) {
		Password.sendKeys(pass);
	}
	public void clickSubmit() {
		Submit.click();
	}
	
	public void pin(String d1,String d2, String d3, String d4) {
		PINdigit1.sendKeys(d1);
		PINdigit2.sendKeys(d2);
		PINdigit3.sendKeys(d3);
		PINdigit4.sendKeys(d4);
		
		
	}
	public void enterPindidit1(String digit1) {
		PINdigit1.sendKeys(digit1);
		}
	public void enterPindidit2(String digit2) {
		PINdigit2.sendKeys(digit2);
		}
	public void enterPindidit3(String digit3) {
		PINdigit3.sendKeys(digit3);
		}
	public void enterPindidit4(String digit4) {
		PINdigit4.sendKeys(digit4);
		}
	
}
