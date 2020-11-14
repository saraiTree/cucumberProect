package pages.action;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locator.CarSearchPageLocator;
import utils.SeleniumDriver;

public class CarsSearchPageActions 
{
	CarSearchPageLocator carSearchPageLocator=null;
	
	public CarsSearchPageActions()
	{
		this.carSearchPageLocator = new CarSearchPageLocator();
		PageFactory.initElements(SeleniumDriver.getDriver(), carSearchPageLocator);
	}
	
	public void selectCarMake(String carBrand)
	{
		Select select = new Select(carSearchPageLocator.carMakeDropdown);
		select.selectByVisibleText(carBrand);
	}
	
	public void selectCarModel(String carModel)
	{
		Select select = new Select(carSearchPageLocator.selectModelDropddown);
		select.selectByVisibleText(carModel);
	}
	
	public void selectLocation(String location)
	{
		Select select = new Select(carSearchPageLocator.selectLocationDropddown);
		select.selectByVisibleText(location);
	}
	
	public void selectCarPrice(String carPrice)
	{
		Select select = new Select(carSearchPageLocator.selectPriceDropddown);
		select.selectByVisibleText(carPrice);
	}
	
	public void clickOnFindMyNextCarBtn()
	{
		carSearchPageLocator.findMyNextCarBtn.click();
	}
}
