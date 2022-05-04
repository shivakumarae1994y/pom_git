package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import hooks.BaseClass;

public class Login extends BaseClass {
	
	public Login(ChromeDriver driver) {
		this.driver=driver;
		
	}

//type user name
	public Login userName(String userId) {
		driver.findElement(By.id("username")).sendKeys(userId);
		return this;
	}
	//type password
	public Login passWord(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}
	//click login
	public Home logIn() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new Home(driver);
	}

}
