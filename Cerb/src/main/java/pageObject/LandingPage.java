package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By homeButton=By.xpath("//a[contains(text(),'Home')]");
	By startApp=By.xpath("//button[@class='wds-c-button--primary wds-c-button wds-u-mt--base wds-u-mb--large']");
	public WebElement home(){
		return driver.findElement(homeButton);
	}
	public WebElement startApplication(){
		return driver.findElement(startApp);
	}
}
