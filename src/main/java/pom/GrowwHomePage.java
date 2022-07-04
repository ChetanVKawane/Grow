package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GrowwHomePage {
	@FindBy(xpath="//a[@href=\"/stocks/user/investments\"]")private WebElement Investment;
	@FindBy(xpath="//input[@class=\"txtinput88input fs14 \"]")private WebElement Search;
	
	public GrowwHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void investment() {
		Investment.click();
	}
	public void search(String share) {
		Search.getSize();
	}

}
