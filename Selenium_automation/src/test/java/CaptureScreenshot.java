import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
	    driver = new ChromeDriver();
	    driver.get("https://demowebshop.tricentis.com/");
	    TakesScreenshot ts = (TakesScreenshot)driver;
	    File sourcefile = ts.getScreenshotAs(OutputType.FILE);
	    File targetfile = new File("C:\\Users\\renuka.kumbhar\\eclipse-workspace\\Selenium_automation\\Screenshot\\capture.png");
	    sourcefile.renameTo(targetfile);
	    Thread.sleep(5000);
	    driver.quit();

	}

}
