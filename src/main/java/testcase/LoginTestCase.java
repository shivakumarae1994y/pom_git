package testcase;

import org.testng.annotations.Test;

import hooks.BaseClass;
import pages.Home;
import pages.Login;
import pages.MyHome;

public class LoginTestCase extends BaseClass{
   @Test
	public void Login_01() throws InterruptedException {
	   
     new Login(driver).userName("demosalesmanager")
     .passWord("crmsfa")
     .logIn();
     Thread.sleep(2000);
     new Home(driver)
     .clickCRMSFA()
     .clickhome()
     .clickCreateLead()
     .companyName("testleaf")
     .firstName("princy");
     
    
	}

}
