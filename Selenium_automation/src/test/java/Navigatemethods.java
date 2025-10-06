import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatemethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
	    driver = new ChromeDriver();
	    driver.get("https://demowebshop.tricentis.com/"); //first page 
	    driver.findElement(By.linkText("Log in")).click();
	  //  driver.findElement(By.partialLinkText("Lo")).click(); //second page 
	    Thread.sleep(5000);
	    driver.navigate().back(); // always go back to first page 
	    Thread.sleep(5000);
	    driver.navigate().forward(); // should go to second page 
	    Thread.sleep(5000);
	    driver.navigate().refresh();
	    Thread.sleep(5000);
	    driver.quit();
	    
	    
	    
	    

	}

}
