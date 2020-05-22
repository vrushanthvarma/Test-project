package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserInitiation {
	public Properties prop;
	public WebDriver driver;
	
	public WebDriver base() throws IOException {
		
	 prop = new Properties();

	FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
	prop.load(fs);
	
	String browserSelected=prop.getProperty("browser");
	
	//String browserSelected=System.getProperty("browser");
	
	if(browserSelected.contains("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe");
ChromeOptions options = new ChromeOptions();
if(browserSelected.contains("headless"))
options.addArguments("headless");
		 driver = new ChromeDriver(options); 
		
	}
	
	else if(browserSelected.equals("firefox")){
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\geckodriver.exe");
		 driver = new FirefoxDriver();
		
	}
	
		
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	return driver;
	
	}
	
	public String Screenshot(String TestcaseName, WebDriver d) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) d;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String DestinationFile = System.getProperty("user.dir")+"\\reports\\"+TestcaseName+".png";
		FileUtils.copyFile(source, new File(DestinationFile));
		return DestinationFile;
	}
}
