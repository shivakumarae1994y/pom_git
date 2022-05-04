package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import hooks.BaseClass;

public class Home extends BaseClass{
public Home(ChromeDriver driver) {
	this.driver=driver;
}
	public MyHome clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHome(driver);
	}

}
