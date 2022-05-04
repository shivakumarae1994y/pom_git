package testcase;

import org.testng.annotations.Test;

import hooks.BaseClass;
import pages.CreateLead;
import pages.Login;


public class ViewLeadtestCase extends BaseClass{

	@Test
	public void viewLead_02() {
		new Login(driver)
		.userName("demosalesmanager")
		.passWord("crmsfa")
		.logIn()
		.clickCRMSFA()
		.clickhome()
		.clickCreateLead()
		
		.companyName("testleaf")
		.firstName("princy")
		.lastName("Edward")
		.createButton();
	}

}
