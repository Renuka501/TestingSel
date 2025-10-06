import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homeworkassignemnt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
	    driver = new ChromeDriver();
	    driver.get("https://demoqa.com/books");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    driver.findElement(By.id("login")).click();	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,100)","");
	    Thread.sleep(5000);
	  //*[@id="newUser"]
	    driver.findElement(By.linkText("New User")).click();
	    driver.findElement(By.id("firstname")).sendKeys("Renuka");
	    driver.findElement(By.id("lastname")).sendKeys("Kumbhar");
	    driver.findElement(By.id("userName")).sendKeys("Renuka.Kumbhar");
	    

	}

}
