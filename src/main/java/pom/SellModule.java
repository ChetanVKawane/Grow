package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SellModule {
	@FindBy(xpath="//input[@placeholder=\"What are you looking for today?\"]")private WebElement SearchShare;
	@FindBy(xpath="//div[text()=\"SELL\"]")private WebElement ClickonSell;
	@FindBy(xpath="//span[text()=\"Delivery\"]")private WebElement Intraday;
	@FindBy(xpath="//span[text()=\"Intraday\"]")private WebElement Delivery;
	@FindBy(xpath="//span[text()=\"NSE\"]")private WebElement MarketBSE;
	@FindBy(xpath="//span[text()=\"BSE\"]")private WebElement MarketNSE;
	@FindBy(xpath="//input[@class=\"qtyinputbox\"]")private WebElement ShareQuantity;
	@FindBy(xpath="//span[text()=\"Limit\"]")private WebElement PriceMarket;
	@FindBy(xpath="//span[text()=\"Market\"]")private WebElement PriceLimit;
	@FindBy(xpath="//span[text()=\"Advanced Options\"]")private WebElement AdvancedOptions;
	@FindBy(xpath="//div[text()=\"Regular Order\"]")private WebElement RegularOrder;
	@FindBy(xpath="//div[text()=\"SL Order\"]")private WebElement SLOrder;
	@FindBy(xpath="//*[@id=\"advancedOptions\"]/div[2]/div[1]/div[3]/div[1]/svg/path[2]")private WebElement SLinfo;
	@FindBy(xpath="//*[@id=\"stopLossInfo\"]/div[1]/div/svg")private WebElement BackfromSLInfo;
	@FindBy(xpath="//*[@id=\"advancedOptions\"]/div[1]/div/svg/path[2]")private WebElement GetBack;
	@FindBy(xpath="//span[text()=\"CONTINUE\"]")private WebElement ClickonContinue;
	@FindBy(xpath="//div[text()=\"Add Limit Price\"]") private WebElement AddLimitPrice;
	@FindBy(xpath="//span[text()=\"SELL\"]")private WebElement FinalSell;
	@FindBy(xpath="//div[text()=\"Market Depth\"]")private WebElement MarketDepthOpen;
	@FindBy(xpath="//div[text()=\"Market Depth\"]")private WebElement MarketDepthClose;
	@FindBy(xpath="//div[@class=\"lpu38WatchlistIconWrapper\"]")private WebElement WatchList;
	@FindBy(xpath="//div[@class=\"ssb143ShareIconWrapper cur-po clrText absolute-center\"]") private WebElement ShareIcon;
	
	public SellModule(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void shareSearch(String share) {
		SearchShare.sendKeys(share);
	}
	
	public void clickonSell() {
		ClickonSell.click();
	}
	public void selectType() {
		Intraday.click();
	}
	public void selectMarket() {
		MarketBSE.click();
	}
	public void sharesQuantity(String quantity) {
		ShareQuantity.sendKeys(quantity);
	}
	public void priceMarket() {
		PriceMarket.click();
	}
	public void priceLimit() {
		PriceLimit.click();
	}
	public void advancedOPtions() {
		AdvancedOptions.click();
	}
	public void regularOrder() {
		RegularOrder.click();
	}
	public void stopLossOrder() {
		SLOrder.click();
	}
	public void stoplossInfo() {
		SLinfo.click();
	}
	public void clickOnContinue() {
		ClickonContinue.click();
	}
	public void addtoWatchList() {
		WatchList.click();
	}
	public void addLimitPrice() {
		AddLimitPrice.click();
	}
	public void finalSell() {
		FinalSell.click();
	}
	public void stopLossInfo() {
		SLinfo.click();
	}
	public void slinfoBack() {
		BackfromSLInfo.click();
	}
	
	
	
	
	
}
