package util;
import org.openqa.selenium.By;

public class DynamicLocator {
	
	public static By getNewLocator(By locator,String value) {
		
		String locatorType=locator.toString().split(": ")[0].split("\\.")[1];
		String newLocatorString = String.format(locator.toString().split(": ")[1],value);
		System.out.println(newLocatorString);
		switch(locatorType)
		{
		case "xpath":
			locator = By.xpath(newLocatorString);
			break;
		case "cssSelector":
			locator = By.cssSelector(newLocatorString);
			break;
		case "id":
			locator = By.id(newLocatorString);
			break;
		case "className":
			locator = By.className(newLocatorString);
			break;
		case "name":
			locator = By.name(newLocatorString);
			break;
		case "linkText":
			locator = By.linkText(newLocatorString);
			break;
		case "partialLinkText":
			locator = By.partialLinkText(newLocatorString);
			break;
		case "tagName":
			locator = By.tagName(newLocatorString);
			break;
		}
		
		return locator;
	
		
	}
}
  