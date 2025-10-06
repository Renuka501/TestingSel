import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmenttwo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		  WebDriver driver;
		    driver = new ChromeDriver();
		    driver.get("https://demo.guru99.com/test/delete_customer.php");
		    driver.manage().window().maximize();
		    driver.findElement(By.name("cusid")).sendKeys("12345");
		    driver.findElement(By.name("submit")).click();
		    Alert alert1 = driver.switchTo().alert();
		    alert1.accept();
		    Thread.sleep(5000);
		    Alert alert2 = driver.switchTo().alert();
		    alert2.accept();
		    
		    driver.quit();
		  
	}

}
