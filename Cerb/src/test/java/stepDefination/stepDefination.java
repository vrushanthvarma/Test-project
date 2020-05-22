package stepDefination;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObject.FifthPage;
import pageObject.FourthPage;
import pageObject.LandingPage;
import pageObject.SecondPage;
import pageObject.SixthPage;
import pageObject.ThirdPage;
import resources.BrowserInitiation;
import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

@RunWith(Cucumber.class)
public class stepDefination extends BrowserInitiation {
WebDriver driver;
    @Given("^initialize the browser with chrome and navigate to \"([^\"]*)\" Site$")
    public void initialize_the_browser_with_chrome_and_navigate_to_something_site(String strArg1) throws Throwable {
       driver=base();
       driver.get(strArg1);
      
    }
    @Given("^click the start application button and navigate to next page$")
    public void click_the_start_application_button_and_navigate_to_next_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	LandingPage lp=new LandingPage(driver);
        lp.startApplication().click();
    }

   


    @When("^User selects one of the impacts and selects date and click on continue button$")
    public void user_selects_one_of_the_impacts_and_selects_date_and_click_on_continue_button() throws Throwable {

    	SecondPage sp= new SecondPage(driver);
       
    	
    	Thread.sleep(5000);
    	sp.radioBtn().click();
    	sp.dateSelection().click();
    			
    Select s=new Select(sp.monthSelection());
    		
    		s.selectByValue("2");
    	

    	
    		int count=sp.daySelection().size();
    		
    		for(int i=0;i<count;i++)
    		{
    		String text=sp.daySelection().get(i).getText();
    		
    		if(text.equalsIgnoreCase("23"))
    		{
    		sp.daySelection().get(i).click();
    		break;
    		}

    		}
    		
    		sp.continuebutton().click();
    		
    		}
    @And("^user enter (.+) and (.+) and (.+) and (.+) and click on continue$")
    public void user_enter_and_and_and_and_click_on_continue(String firstname, String lastname, String dob, String sin) throws Throwable {
    	 ThirdPage tp=new ThirdPage(driver);
    	 tp.firstName().sendKeys(firstname);
    	 tp.secondName().sendKeys(lastname);
    	 tp.dateOfBirth().sendKeys(dob);
    	 tp.sinNumber().sendKeys(sin);
    	 tp.continueBtn().click();
    	 
    }
    @And("^user enter (.+) and (.+) and (.+) and (.+) and (.+) and (.+) and (.+) and (.+) and click on continue for next page$")
    public void user_enter_and_and_and_and_and_and_and_and_click_on_continue_for_next_page(String unit, String street, String city, String province, String postal, String primaryphone, String seconphone, String email) throws Throwable {
       
    	
    	FourthPage fp=new FourthPage(driver);
       
       for(int i=0;i<4;i++) {
           fp.address().sendKeys("m");;
           Thread.sleep(2000);
           }
       fp.address().sendKeys(Keys.ARROW_DOWN);
       fp.address().sendKeys(Keys.ENTER);
       fp.aptNo().sendKeys(unit);
       fp.streetAddress().sendKeys(street);
       fp.cityName().sendKeys(city);
       fp.provinceName().sendKeys(province);
       fp.poastalCode().sendKeys(postal);
       fp.cellPhone().sendKeys(primaryphone);
       fp.homePhone().sendKeys(seconphone);
       fp.emaild().sendKeys(email);
       fp.spokenLanguage().click();
       fp.preferredLanguage().click();
       fp.continueButton().click();
       FifthPage fip =new FifthPage(driver);
       try {
       fip.fourCtnBtn().click();
    }
    catch(StaleElementReferenceException e){
    	  fip.fourCtnBtn().click();
    	
    	}
    }
    @And("^user selects one of the reason and click on continue to navigate$")
    public void user_selects_one_of_the_reason_and_click_on_continue_to_navigate() throws Throwable {
        
       
    	   FifthPage fip =new FifthPage(driver);
       fip.radioBtn().click();
       
         try {
           fip.continueButton().click();
        }
        catch(StaleElementReferenceException e){
        	  fip.continueButton().click();
        	
        	}
    }


    @And("^user enters (.+) and (.+) and (.+) and click on contbtn and click on nextbtn and finally submit button$")
    public void user_enters_and_and_and_click_on_contbtn_and_click_on_nextbtn_and_finally_submit_button(String branchno, String institutionno, String accountno) throws Throwable {
    	SixthPage sixp =new SixthPage(driver);
    	sixp.transitNo().sendKeys(branchno);
    	sixp.FininancialNo().sendKeys(institutionno);
    	sixp.accountNumber().sendKeys(accountno);
    	sixp.conttinueBtn().click();
    	 try {
             sixp.nextBtn().click();
          }
          catch(StaleElementReferenceException e){
          	  sixp.nextBtn().click();
          	
          	}
    	 try {
             sixp.submitBtn().click();
          }
          catch(StaleElementReferenceException e){
          	  sixp.submitBtn().click();
          	
          	}
    }
    
       
   
    @Then("^Verify that user is succesfully submitted the application$")
    public void verify_that_user_is_succesfully_submitted_the_application() throws Throwable {
    	SixthPage sixp =new SixthPage(driver);
    	Assert.assertEquals(sixp.applicationApproved().getText(),"Application approved");
    }
    
     

 }

    
