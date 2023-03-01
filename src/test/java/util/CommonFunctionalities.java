package util;

import java.util.List;

import org.openqa.selenium.WebElement;

public class CommonFunctionalities {
	
	public static void dropdownValues(List<WebElement> ele,String dropdownVal) {
		for(int i=0;i<ele.size();i++) {
			String actVal=ele.get(i).getText();
			if(actVal.equalsIgnoreCase(dropdownVal)) {
				ele.get(i).click();
				break;
			}
	}

	}
}
