import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter ("Renuka.html");
		spark.config().setTheme(Theme.STANDARD);
		extent.attachReporter(spark);
		
		ExtentTest test = extent.createTest("Login test");
		test.pass("Login Sucess");
		extent.flush();
	}

}
