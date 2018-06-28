/*package aafly.ssm.agentmenu.test;

import org.testng.annotations.Test;
import com.selenium.framework.BaseTest;
import aafly.ssm.agentmenu.pages.AgentAuthentication_Login;
import aafly.ssm.agentmenu.pages.AgentMenu;

public class AgentAuthentication_Login_Test extends BaseTest {

	// validate user should able to launch Flex Page and Agent Menu Screen
	//Click on American Airline Logo
	
   @Test(priority = 1)

	
	  public void agentAuthenticationFlex(){
	  
	  AgentAuthentication_Login agentflex = new AgentAuthentication_Login(driver);
	  agentflex.validateTouchtoType(); 
	  agentflex.validateAmericanAirlineLogo();
	  
	  } 
	  
   //Validate the functionality of StartOver Button
    	  
	 @Test(priority=2)
	    
	   public void agentMenuStartOverBtn() throws InterruptedException {
	    
		AgentAuthentication_Login agentstartover = new AgentAuthentication_Login(driver);
		agentstartover.validateMenuAccessLabel();  //validate MenuAccess Label
		agentstartover.validateStartoverBtn();    //validate the StartOver Button 	    	
		}
		
 // Validate the functionality of Back Button
	   
	   @Test(priority=3)
		
		public void agentMenuBackBtn() throws InterruptedException {
		
		AgentAuthentication_Login agentback = new AgentAuthentication_Login(driver);
		agentback.validateMenuAccessLabel();      //validate MenuAccess Label
		agentback.validateBackBtn(); 			// Validate Back Button
		}
		
//validate the functionality of Continue Button
		
//		@Test(priority=4)
   
		public void agentMenuContinueBtn() throws InterruptedException{
		AgentAuthentication_Login agentContinue = new AgentAuthentication_Login(driver);
		agentContinue.validateMenuAccessLabel();           //validate MenuAccess Label
		agentContinue.enterMenuCode();					  // Enter Text on Menu Code and click on Continue 
		}
	}
	
	 


*/


package aafly.ssm.agentmenu.test;

import org.testng.annotations.Test;
import com.selenium.framework.BaseTest;
import aafly.ssm.agentmenu.pages.AgentAuthentication_Login;
import aafly.ssm.agentmenu.pages.AgentMenu;
import aafly.ssm.agentmenu.pages.TestPrintOptions;

public class AgentAuthentication_Login_Test extends BaseTest {

          // validate user should able to launch Flex Page and Agent Menu Screen
          // Click on American Airline Logo

          @Test(priority = 1)

             public void agentMenuContinueBtn() throws InterruptedException {
                   AgentAuthentication_Login agentContinue = new AgentAuthentication_Login(driver);
                   agentContinue.validateMenuAccessLabel(); 
                   agentContinue.enterMenuCode();
                   Thread.sleep(3000);
                   
                   
                   AgentMenu menuoption = new AgentMenu(driver);
                   menuoption.validateMenuOption(); 
                   
                      TestPrintOptions print = new TestPrintOptions(driver);
                             print.validateTestPrintDoc();
                             print.testprintButtons();
                             print.validateboardingPassBtn();
                             print.validatewifiboardingPassBtn();
                             print.validatepriorityCardBtn();
                             print.validatewifiPriorityCardBtn();
                             print.validatebaggageReceiptBtn();
                             print.validatemiscSalesReceiptBtn();
                             print.validateticketReceiptBtn();
                             print.validateupgradeReceiptBtn();
                             print.validateinfoCardBtn();
                             print.validateoneDayPassBtn();
                             print.validateitineraryBtn();
                             print.validateitineraryBtn();
                             print.validaterefundReceiptBtn();
                             print.validatebonusMilesBtn();
                             print.validatebaggageCouponBtn();
                             print.validateprintBagtagBtn();
                   //   driver.close();
          //      closeApplication();
          }
}

