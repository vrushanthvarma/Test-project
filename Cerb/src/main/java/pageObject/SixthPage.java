package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SixthPage {
	
	public WebDriver driver;
		public SixthPage(WebDriver driver) {
			this.driver = driver;
			}
		By transit = By.xpath("//input[@id='root_7715792061592502272_Person.bankBranchNum']");
		By financeNo = By.xpath("//input[@id='root_7715792061592502272_Person.bankInstNum']");
		By accountNo=By.xpath("//input[@id='root_7715792061592502272_Person.bankAcctNum']");
		By cntbtn=By.xpath("//button[@id='apply-for-benefits-ieg-form-button-next']");
		By next = By.xpath("//button[@id='apply-for-benefits-ieg-form-button-next']");
By submit = By.xpath("//button[@id='apply-for-benefits-ieg-form-button-next']");
By appApproved=By.xpath("//h2[@class='wds-u-mv--small']");
		public WebElement transitNo() {
			return driver.findElement(transit);
}

		public WebElement FininancialNo() {
			return driver.findElement(financeNo);
}

		public WebElement accountNumber() {
			return driver.findElement(accountNo);
			
}
		public WebElement conttinueBtn() {
			return driver.findElement(cntbtn);
			
}
		public WebElement nextBtn() {
			return driver.findElement(next);
			
}
		public WebElement submitBtn() {
			return driver.findElement(submit);
			
}
		public WebElement applicationApproved() {
			return driver.findElement(appApproved);
			
}
}
