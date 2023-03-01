package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By username= By.name("username");
	By password= By.name("pwd");
	By loginBtn= By.id("loginButton");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enteringLoginDetails(String name,String passw) {
		driver.findElement(username).sendKeys(name);
		driver.findElement(password).sendKeys(passw);	
	}
	
	public void loginBtn() throws InterruptedException {
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
	}
	

}
