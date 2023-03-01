package stepDef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Homepage;
import pages.PageObectManger;
import util.TestDriverDependencies;

public class HomepageStepDef {
TestDriverDependencies testdriver;
Homepage home;

	public HomepageStepDef(TestDriverDependencies testdriver) {
		this.testdriver=testdriver;
	}
	
	@Then("actiTime Homepage should be displayed")
	public void acti_time_homepage_should_be_displayed() {
		testdriver.po.getHomepage().verifyHomepage();
	}
	
	@Given("User should be on Homepage")
	public void user_should_be_on_homepage() {
		testdriver.po.getHomepage().verifyHomepage();
	}
	
	@When("Click on Me dropdown")
	public void click_on_me_dropdown() throws InterruptedException {
		testdriver.po.getHomepage().clickonMeLink();
		Thread.sleep(3000);
	}
	
	@When("Select {string} value from dropdown")
	public void select_value_from_dropdown(String name) throws InterruptedException {
		testdriver.po.getHomepage().selectValueFromDropdown(name);
	}
	
	@Then("{string} details should be displayed")
	public void details_should_be_displayed(String expDropdownVal) throws InterruptedException {
		testdriver.po.getHomepage().verifyDetailsPage(expDropdownVal);
	}


}
