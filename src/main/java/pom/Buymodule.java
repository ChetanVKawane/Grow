package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Buymodule {
	@FindBy(xpath="//input[@id=\"globalSearch23\"]")private WebElement SearchShare;
	
	public Buymodule(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	public void searchShare(String share) {
		SearchShare.click();
		SearchShare.sendKeys(share);
		SearchShare.sendKeys(Keys.ARROW_DOWN);
		SearchShare.sendKeys(Keys.ENTER);
	}


}
