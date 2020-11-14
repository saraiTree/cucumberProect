package pages.action;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locator.CarsGuideHomePageLocator;
import utils.SeleniumDriver;

public class CarsGuideHomePageActions 
{
	CarsGuideHomePageLocator carsGuideHomePageLocator=null;
	public CarsGuideHomePageActions()
	{
		this.carsGuideHomePageLocator = new CarsGuideHomePageLocator();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocator);
	}
	
	public void moveToBuySellMenu()
	{
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocator.buy_sell).build().perform();		
	}
	
	public void clickOnSearchCarsMenu()
	{
		carsGuideHomePageLocator.searchedCarLink.click();
	}
	
	public void clickOnUsedCarsSearchmenu()
	{
		carsGuideHomePageLocator.usedCarLink.click();
	}
	
	public void moveToSellMyCarmenu()
	{
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocator.sellMyCarLink).build().perform();
	}
}
