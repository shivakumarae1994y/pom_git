package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import hooks.BaseClass;

public class MyHome extends BaseClass {
	public MyHome(ChromeDriver driver) {
		this. driver=driver;	
	}
	
	public MyLeads  clickhome() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeads(driver);
	}

	
	
}
