package steps;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import utils.SeleniumDriver;

public class AfterAction 
{
@After
public static void tearDown(Scenario scenario)
{
	System.out.println("After");
	WebDriver driver = SeleniumDriver.getDriver();
	if(scenario.isFailed())
	{
		byte[]screenshotBytes = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshotBytes, "image/png");
	}
	SeleniumDriver.tearDown();
}
}
