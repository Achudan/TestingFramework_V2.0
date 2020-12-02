package masterWrapper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MasterClass extends WebDriverManager{
	
	public String getTextByXpath(String xpath) {
		String text = driver.findElement(By.xpath(xpath)).getText();
		return text;
	}
	public void waitUntilElementVisible(String xpath) {
		try {
			WebDriverWait wait = new WebDriverWait(driver,20);
			WebElement web1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		}
		catch(Exception e) {
			
		}
	}

}
