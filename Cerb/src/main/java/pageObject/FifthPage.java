package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FifthPage {
	public WebDriver driver;
	public FifthPage(WebDriver driver) {
		this.driver = driver;
		
}

By ctnBtn=By.cssSelector(".wds-c-button--primary.wds-c-button--full.wds-c-button.wds-u-mt--base.wds-u-mb--large");
By radio3=By.xpath("//label[contains(text(),'Yes, I am eligible to receive the benefit for this')]");
By continueBT=By.xpath("//button[@id='apply-for-benefits-ieg-form-button-next']");

public WebElement fourCtnBtn() {
	return driver.findElement(ctnBtn);
}	
public WebElement radioBtn() {
	return driver.findElement(radio3);
}	
public WebElement continueButton() {
	return driver.findElement(continueBT);
}	


}
