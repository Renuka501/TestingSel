import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationFirst {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
	    driver = new ChromeDriver();
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    driver.quit();
		
		driver = new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    driver.quit();

	}

}
