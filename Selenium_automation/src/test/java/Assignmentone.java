import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignmentone {

	public static void main(String[] args) throws InterruptedException {
	
	        
	        WebDriver driver;
		    driver = new ChromeDriver();
		    driver.get("https://demo.guru99.com/test/radio.html");
		    System.out.println(driver.getTitle());

	        WebElement option1 = driver.findElement(By.id("vfb-7-1"));
	        option1.click();
	      
	        WebElement checkbox2 = driver.findElement(By.id("vfb-6-1"));
	        checkbox2.click();
	        WebElement checkbox3 = driver.findElement(By.id("vfb-6-2"));
	        checkbox3.click();
	        Thread.sleep(5000);
	        
	        driver.get("https://demo.guru99.com/test/newtours/register.php");
	        
	        JavascriptExecutor js = (JavascriptExecutor)driver;
		    js.executeScript("window.scrollBy(0,500)","");
		    
		    WebElement countryDropdown = driver.findElement(By.name("country"));
	        Select select = new Select(countryDropdown);
	        select.selectByVisibleText("KUWAIT");
	        
	        driver.quit();
	        
	       
	}

}
