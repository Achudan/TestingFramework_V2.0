package testCases;

import org.testng.annotations.Test;

import masterWrapper.WebDriverManager;
import pages.StartPage;
import reporter.ExtentReporter;

public class TC1 extends WebDriverManager{
  @Test
  public void sampleMethod() {
	  ExtentReporter.startTest("SampleReport","1st test");
	  WebDriverManager startApp = new WebDriverManager();
	  startApp.startApplication("chrome", "https://phptravels.com/demo");
	  
	  StartPage beginTestCase = new StartPage();
	  beginTestCase
	  .getEmailandVerify("Homepage", "Front-End")
	  .getPasswordandVerify("Homepage", "Front-End")
	  .getEmailandVerify("Administrator", "Back-End")
	  .getPasswordandVerify("Administrator", "Back-End")
	  ;
  }
  @Test
  public void sampleMethod2() {
	  ExtentReporter.startTest("SampleReport2","2nd test");
	  WebDriverManager startApp = new WebDriverManager();
	  startApp.startApplication("chrome", "https://phptravels.com/demo");
	  
	  StartPage beginTestCase = new StartPage();
	  beginTestCase
	  .getEmailandVerify("Homepage", "Front-End")
	  .getPasswordandVerify("Homepage", "Front-End")
	  .getEmailandVerify("Administrator", "Back-End")
	  .getPasswordandVerify("Administrator", "Back-End")
	  ;
  }
  @Test
  public void sampleMethod3() {
	  ExtentReporter.startTest("SampleReport2","3rd test");
	  WebDriverManager startApp = new WebDriverManager();
	  startApp.startApplication("chrome", "https://phptravels.com/demo");
	  
	  StartPage beginTestCase = new StartPage();
	  beginTestCase
	  .getEmailandVerify("Homepage", "Front-End")
	  .getPasswordandVerify("Homepage", "Front-End")
	  .getEmailandVerify("Administrator", "Back-End")
	  .getPasswordandVerify("Administrator", "Back-End")
	  ;
  }
}
