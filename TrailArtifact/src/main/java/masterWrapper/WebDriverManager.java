package masterWrapper;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import reporter.ExtentReporter;

public class WebDriverManager extends ExtentReporter {
static WebDriver driver;
	
	public void startApplication(String browserName, String URL) {
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver-86.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(URL);
		}
	}
	
	@AfterMethod
	public void tearDown() {
//		extent.endTest(test);
		extent.flush();
		driver.close();
		driver.quit();
	}
	@AfterClass
	public void killAll() {
		try {
//			report.endTest(test);
//			extent.flush();
			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
