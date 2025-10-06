import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
	    driver = new ChromeDriver();
	    driver.get("https://demowebshop.tricentis.com/");
	      System.out.println(driver.getTitle());
          System.out.println(driver.getCurrentUrl());
	      System.out.println(driver.getPageSource());
     	    driver.manage().window().maximize();
	    
	    Thread.sleep(5000);
	   // driver.quit();

	}

}
