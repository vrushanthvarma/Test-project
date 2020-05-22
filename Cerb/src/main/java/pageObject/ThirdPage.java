package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ThirdPage {
	public WebDriver driver;
	public ThirdPage(WebDriver driver) {
		this.driver = driver;
		
	}

	
	By fName=By.xpath("//input[@id='root_4617315517961601024_Person.firstName']");
	By lName=By.xpath("//input[@id='root_4617315517961601024_Person.lastName']");
	By dob=By.xpath("//input[@id='root_4617315517961601024_Person.dateOfBirth']");
	By sin=By.xpath("//input[@id='root_4617315517961601024_Person.sinRaw']");
	By con=By.xpath("//button[@id='apply-for-benefits-ieg-form-button-next']");
			
	
	public WebElement firstName() {
		return driver.findElement(fName);
	}
	public WebElement secondName() {
		return driver.findElement(lName);
	}
	public WebElement dateOfBirth() {
		return driver.findElement(dob);
	}
	public WebElement sinNumber() {
		return driver.findElement(sin);
	}
	public WebElement continueBtn() {
		return driver.findElement(con);
	}
}
