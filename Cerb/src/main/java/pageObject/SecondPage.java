package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SecondPage {
	
	WebDriver driver;
	public SecondPage(WebDriver driver) {
		this.driver = driver;
		
	}
		By header = By.xpath("//h1[@class='wds-c-page-header__title']");
		By radio = By.xpath("//label[contains(text(),'I am sick with COVID-19 or have been advised to qu')]");
		By date1 = By.xpath("//*[@id=\"root_-3020789450058760192_Person.employmentIncomeLostDate\"]");
		By month = By.xpath("//select[@class='flatpickr-monthDropdown-months']");
		By year = By.xpath("//input[@class='numInput cur-year']");
		By day = By.cssSelector(".flatpickr-day");
		By continuebtn = By.xpath("//button[@id='apply-for-benefits-ieg-form-button-next']");
		public WebElement headertitle() {
		return	driver.findElement(header);
		
		}
		public WebElement radioBtn() {
			return	driver.findElement(radio);
			
			}
			
		public WebElement dateSelection() {
			
           return driver.findElement(date1);
		
			}	
		public WebElement monthSelection() {
				return driver.findElement(month);
				
			}	
		public WebElement yearSelection() {
			return	driver.findElement(year);
		 
			
			}	
		public List<WebElement> daySelection() {
			return driver.findElements(day);
				 
			}
		public WebElement continuebutton() {
			return	driver.findElement(continuebtn);
			
			}
}
