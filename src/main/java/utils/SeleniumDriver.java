package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver 
{
	private static WebDriver driver;
	private static WebDriverWait waitDriver;
	private static SeleniumDriver seleniumDriver;
	public final static int TIMEOUT=30;
	public final static int PAGE_LOAD_TIMEOUT=50;
	
	
	private SeleniumDriver()
	{
		System.out.println("SeleniumDriver ctr");
		driver = new ChromeDriver();
		waitDriver = new WebDriverWait(driver, TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	}
	public static void openPage(String url)
	{
		driver.get(url);
	}
	
	public static void setupDriver()
	{
		if(seleniumDriver == null)
		{
			seleniumDriver = new SeleniumDriver();
		}
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	public static void tearDown()
	{
		if(driver!=null)
		{
			driver.close();
			driver.quit();
		}
		seleniumDriver=null;
	}
}
