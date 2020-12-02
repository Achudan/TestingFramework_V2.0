package reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {
	public static ExtentReports extent;
	public static ExtentTest test;
	public static String testCaseName = "";
	public static void startTest(String tcName, String desc)
	{
		if(!testCaseName.equals(tcName)) {
			testCaseName = tcName;
			extent = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+"\\Reports\\"+testCaseName+".html");
			extent.attachReporter(spark);
		}

		test = extent.createTest(desc);
	}
}
