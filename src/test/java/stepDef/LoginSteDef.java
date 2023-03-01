package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;
import util.TestDriverDependencies;

public class LoginSteDef {
	public TestDriverDependencies testdriver;
//	WebDriver driver;
	
	public LoginSteDef(TestDriverDependencies testdriver) {
		this.testdriver=testdriver;
	}
	
	@Given("User should be on landing page")
	public void navigateToApplication() {
//	    System.setProperty("webdriver.chrome.driver", "E:\\SeleniumCourse\\actiTime\\src\\test\\java\\Drivers\\chromedriver_win32\\chromedriver.exe");
//	    testdriver.driver = new ChromeDriver();
//	    testdriver.driver.get("https://demo.actitime.com/login.do");
	}
	
	@When("^User enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enterUsernamePassword(String username, String password) throws Throwable {
		LoginPage lo=testdriver.po.getLoginPage();
		lo.enteringLoginDetails(username, password);
    }	
	
	@When("User clicks on Login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		testdriver.po.getLoginPage().loginBtn();
	}
	
}
