package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseSetup {
	public WebDriver driver;
	String br;
	String urlPath;
	
 public WebDriver initializeBrowser() throws IOException {
	 FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\configuration.properties");
	 Properties prop=new Properties();
	 prop.load(fis);
	 br=prop.getProperty("browser");
	 urlPath=prop.getProperty("url");
	 
	 if(driver==null) {
	   if(br.equalsIgnoreCase("chrome")) {
	    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\src\\test\\java\\Drivers\\chromedriver_win32(1)\\chromedriver.exe");
	    driver = new ChromeDriver();
		} else if(br.equalsIgnoreCase("firefox")) {
		    System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\src\\test\\java\\Drivers\\chromedriver_win32\\chromedriver.exe");
		    driver = new FirefoxDriver();
		}else if(br.equalsIgnoreCase("edge")){
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\src\\test\\java\\Drivers\\chromedriver_win32\\chromedriver.exe");
		    driver = new EdgeDriver();
		}
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.get(urlPath);
	 }
		return driver;
 }
 
 

}
