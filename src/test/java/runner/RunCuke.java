package runner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		glue="steps",
		features="src/test/resources/features",
		
		plugin= {"json:target/RunCuke/cucumber.json",
				"pretty","html:target/RunCuke/html/cucumber.html", "com.cucumber.listener.ExtentCucumberFormatter"}
	//	tags= {"@Search-cars"}
		)

public class RunCuke extends AbstractTestNGCucumberTests
{

@BeforeClass
public static void setup()
{
	System.out.println("::::::::::;in setup method::::::::::::");
	SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
	Date date = new Date();
	String 	strDate = sdf.format(date);
	String fileName = System.getProperty("user.dir")+"/target/Extent_Reports/"+strDate+".html";
	File newFile = new File(fileName);
	ExtentCucumberFormatter.initiateExtentCucumberFormatter(newFile, false);
	ExtentCucumberFormatter.loadConfig(new File("/Users/sushilkumargupta/Documents/selenium_frameworks/cucumber2/src/test/resources/extent-config.xml"));
	ExtentCucumberFormatter.addSystemInfo("browser name", "chrome");
	ExtentCucumberFormatter.addSystemInfo("OS", "MAC OS");
	ExtentCucumberFormatter.addSystemInfo("Engineer", "Sushil kumar gupta");
	
	Map<String, String> systemInfo = new HashMap<String, String>();
	systemInfo.put("browser", "map_chrome");
	systemInfo.put("extent_report_version", "v1.0");
	ExtentCucumberFormatter.addSystemInfo(systemInfo);
	
	
	
}

}
