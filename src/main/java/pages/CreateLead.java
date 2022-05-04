package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import hooks.BaseClass;

public class CreateLead extends BaseClass {
	public CreateLead(ChromeDriver driver) {
		this.driver=driver;
	}

	public CreateLead companyName(String compayname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compayname);
     return this;
	}
	public CreateLead firstName (String firstname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
	  return this;
	}
	public CreateLead lastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		return this;
	}
	public ViewLead createButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLead();
	}
}