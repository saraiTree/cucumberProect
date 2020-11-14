package pages.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomePageLocator 
{
@FindBy(how = How.LINK_TEXT, using="buy + sell")
public WebElement buy_sell; 

@FindBy(how=How.LINK_TEXT, using="Search Cars")
public WebElement searchedCarLink;

@FindBy(how=How.LINK_TEXT, using="Used")
public WebElement usedCarLink;

@FindBy(how=How.LINK_TEXT, using="New")
public WebElement newCarLink;

@FindBy(how=How.LINK_TEXT, using="reviews")
public WebElement reviewsLink;

@FindBy(how=How.LINK_TEXT, using="Sell my car")
public WebElement sellMyCarLink;

}
