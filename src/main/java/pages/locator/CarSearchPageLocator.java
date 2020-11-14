package pages.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarSearchPageLocator 
{
	@FindBy(how=How.CSS, using="#makes")
	public WebElement carMakeDropdown;
	
	@FindBy(how=How.CSS, using="#models")
	public WebElement selectModelDropddown;
	
	@FindBy(how=How.CSS, using="#locations")
	public WebElement selectLocationDropddown;
	
	@FindBy(how=How.CSS, using="#priceTo")
	public WebElement selectPriceDropddown;
	
	@FindBy(how=How.CSS, using="#search-submit")
	public WebElement findMyNextCarBtn;
}
