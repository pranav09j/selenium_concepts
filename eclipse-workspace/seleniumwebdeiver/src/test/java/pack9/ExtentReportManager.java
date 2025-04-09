package pack9;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ExtentReportManager implements ITestListener{
	
	public ExtentSparkReporter sparkReporter;  // UI of the report
	public ExtentReports extent; // populate common info on the report
	public ExtentTest test; // creating test case entries in the report and update the status of the test methods

	public void onStart(ITestContext context) {
		
		sparkReporter = new ExtentSparkReporter("./Reports/myReport.html");
		
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("Functional Testing");
		sparkReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Computer name", "localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester Name", "Pranav Jadhav");
		extent.setSystemInfo("os", "windows10");
		extent.setSystemInfo("Browser Name", "Chrome");
		
				
		
		
	}


	
	public void onTestSuccess(ITestResult result) {
		
		test = extent.createTest(result.getName());
		test.log(Status.PASS, "Test is passed"+ result.getName());
	}

	
	public void onTestFailure(ITestResult result) {
		
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test is Failed"+ result.getName());
//		test.log((Status.FAIL, "Test case failed cause is:"+ result.getThrowable());
		
	}
	
	
	public void onTestSkipped(ITestResult result) {

		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "Test is Skipped"+ result.getName());
	}
	

	public void onFinish(ITestContext context) {
		
		extent.flush();
	}

	
}
