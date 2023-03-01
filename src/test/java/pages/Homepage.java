package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import util.CommonFunctionalities;
import util.DynamicLocator;

public class Homepage {
	WebDriver driver;
	By meLink = By.xpath("//span[text()='%s']");
	By logOut = By.linkText("Logout");
	By dropDownValues = By.xpath("//span[@class='userName']");
	By userNameList=By.xpath("//span[@class='userName']");
	By dropDownName= By.xpath("//span[@class='dashedLink' and text()='%s']");
	By backToMe = By.linkText("Back to me");
	
	public Homepage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void verifyHomepage() {
		boolean b=driver.findElement(DynamicLocator.getNewLocator(meLink,"Me")).isDisplayed();
		 Assert.assertEquals(b,true, "The Me link is not displayed");
		 String str=driver.findElement(By.linkText("Logout")).getText();
		 boolean l=driver.findElement(By.linkText("Logout")).isDisplayed();
		 Assert.assertTrue(l==true, "The logout link is not displayed");
	}
	
	public void clickonMeLink() {
		driver.findElement(DynamicLocator.getNewLocator(meLink,"Me")).click();
	}
	
	public void selectValueFromDropdown(String value) {
		List<WebElement> ele=driver.findElements(userNameList);
		CommonFunctionalities.dropdownValues(ele, value);
	}
	
	public void verifyDetailsPage(String expDropdownVal) throws InterruptedException {
		Thread.sleep(5000);
	    String actdropdownVal=driver.findElement(DynamicLocator.getNewLocator(dropDownName, expDropdownVal)).getText();
	    Assert.assertEquals(actdropdownVal, expDropdownVal, expDropdownVal+"is not displayed");
	   boolean b=driver.findElement(backToMe).isDisplayed();
	   Assert.assertEquals(b, true,"BacktoMe link is not displayed");
	}
	
	
}
