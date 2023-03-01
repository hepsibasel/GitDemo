package stepDef;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import util.TestDriverDependencies;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	TestDriverDependencies testdriver;
	
	public Hooks(TestDriverDependencies testdriver) {
		this.testdriver=testdriver;
	}
	
 @After
 public void closeBrowser() throws IOException {
	 testdriver.base.initializeBrowser().quit();
 }
 
 @AfterStep
 public void addScreenshot(Scenario scenario) throws IOException {
	 WebDriver driver=testdriver.base.initializeBrowser();
	 if(scenario.isFailed()) {
		File sourcepath= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		byte[] fileContent=FileUtils.readFileToByteArray(sourcepath);
		scenario.attach(fileContent, "image/png", "image");
	 }
 }


}
