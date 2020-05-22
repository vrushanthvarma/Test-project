package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FourthPage {

		public WebDriver driver;
		public FourthPage(WebDriver driver) {
			this.driver = driver;
			
}
		By add= By.xpath("//input[@id='downshift-0-input']");
		By unit = By.xpath("//input[@id='root_-7416302686372364288_ResidentialAddress.suiteNum']");
		By street = By.xpath("//input[@id='root_-7416302686372364288_ResidentialAddress.addressLine1']");
		By city = By.xpath("//input[@id='root_-7416302686372364288_ResidentialAddress.city']");
		By province= By.xpath("//select[@id='root_-7416302686372364288_ResidentialAddress.province']");
		By poastal = By.xpath("//input[@id='root_-7416302686372364288_ResidentialAddress.postalCode']");
		By primaryPhno = By.xpath("//input[@id='root_-2732559073907048448_ContactInformation.primaryPhoneNumberRaw']");
		By secondaryPhno = By.xpath("//input[@id='root_-2732559073907048448_ContactInformation.secondaryPhoneNumberRaw']");
		By email = By.xpath("//input[@id='root_77687093572141056_ContactInformation.email']");
		By tty = By.xpath("//input[@id='root_77687093572141056_ContactInformation.teletypewriterNumberRaw']");
		By radio = By.xpath("//fieldset[@id='root_-6551611557917229056_ContactInformation.preferredWrittenLanguage']//label[contains(text(),'English')]");
		By radio1= By.xpath("//fieldset[@id='root_-6551611557917229056_ContactInformation.preferredSpokenLanguage']//label[contains(text(),'English')]");
		By continuebtn = By.xpath("//button[@id='apply-for-benefits-ieg-form-button-next']");
		
		

		public WebElement address() {
			return driver.findElement(add);
}

		public WebElement aptNo() {
			return driver.findElement(unit);
}

		public WebElement streetAddress() {
			return driver.findElement(street);
			
}

		public WebElement cityName() {
			return driver.findElement(city);
}

		public WebElement provinceName() {
			return driver.findElement(province);
}

		public WebElement poastalCode() {
			return driver.findElement(poastal);
}

		public WebElement cellPhone() {
			return driver.findElement(primaryPhno);
}

		public WebElement homePhone() {
			return driver.findElement(secondaryPhno);
}

		public WebElement emaild() {
			return driver.findElement(email);
}
		public WebElement telecommunication() {
			return driver.findElement(tty);
}
		public WebElement spokenLanguage() {
			return driver.findElement(radio);
}
		public WebElement preferredLanguage() {
			return driver.findElement(radio1);
}
		public WebElement continueButton() {
			return driver.findElement(continuebtn);
}	
		
}