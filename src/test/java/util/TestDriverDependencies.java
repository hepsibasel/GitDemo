package util;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pages.PageObectManger;

public class TestDriverDependencies {

	public WebDriver driver;
	public PageObectManger po;
	public BaseSetup base;
	
	public TestDriverDependencies() throws IOException {
		base=new BaseSetup();
		po=new PageObectManger(base.initializeBrowser());
	}

	
}
