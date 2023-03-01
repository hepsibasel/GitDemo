package pages;

import org.openqa.selenium.WebDriver;

public class PageObectManger {
	public WebDriver driver;
	public LoginPage loginpage;
	public Homepage home;
		
	public PageObectManger(WebDriver driver) {
		this.driver=driver;
	}
		
	public LoginPage getLoginPage() {
		loginpage=new LoginPage(driver);
		return loginpage;
	}
	
	public Homepage getHomepage() {
		home= new Homepage(driver);
		return home;
	}
	
	

}
