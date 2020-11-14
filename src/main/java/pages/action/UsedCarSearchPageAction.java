package pages.action;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locator.UsedCarSearchPageLocator;
import utils.SeleniumDriver;

public class UsedCarSearchPageAction {
	UsedCarSearchPageLocator usedCarSearchPageLocator=null;
	public UsedCarSearchPageAction()
	{
		usedCarSearchPageLocator = new UsedCarSearchPageLocator();
		PageFactory.initElements(SeleniumDriver.getDriver(), usedCarSearchPageLocator);
	}
	
	public void selectCarModel(String model)
	{
		new Select(usedCarSearchPageLocator.selectModelDropddown).selectByVisibleText(model);
	}

}
