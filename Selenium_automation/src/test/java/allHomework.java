import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class allHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
	    driver = new ChromeDriver();
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("Log in")).click();
	    driver.findElement(By.id("Email")).sendKeys("renuka.kumbha123re@gmail.com");
	    driver.findElement(By.id("Password")).sendKeys("Reepree@10");
	    driver.findElement(By.id("RememberMe")).click();
	    driver.findElement(By.xpath("//input[@value='Log in']")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.linkText("Computers")).click();
	    driver.findElement(By.partialLinkText("Desk")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    //driver.findElement(By.id("a[class='ico-cart'] span[class='cart-label']")).click();
	    driver.findElement(By.xpath("//span[normalize-space()='Shopping cart']")).click();	    
	    


	    
	    
	    

	}

}
