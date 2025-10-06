import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loactorseg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
	    driver = new ChromeDriver();
	    driver.get("https://demowebshop.tricentis.com/"); //first page 
//	    driver.findElement(By.linkText("Log in")).click();
//	    driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");
//	    driver.findElement(By.id("Password")).sendKeys("123456");
//	    driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
//	    
//	    driver.findElement(By.linkText("Register")).click();
//	    driver.findElement(By.id("gender-female")).click();
//	    driver.findElement(By.id("FirstName")).sendKeys("Renuka");
//	    driver.findElement(By.id("LastName")).sendKeys("Kumbhar");
//	    driver.findElement(By.id("Email")).sendKeys("renuka.kumbha123re@gmail.com");
//	    driver.findElement(By.id("Password")).sendKeys("Reepree@10");
//	    driver.findElement(By.id("ConfirmPassword")).sendKeys("Reepree@10");
//	    driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[4]/input")).click();
//	    
	   
	    driver.findElement(By.linkText("Log in")).click();
	    driver.findElement(By.id("Email")).sendKeys("renuka.kumbha123re@gmail.com");
	    driver.findElement(By.id("Password")).sendKeys("Reepree@10");
	    driver.findElement(By.id("RememberMe")).click();
	    //driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	    driver.findElement(By.xpath("//input[@value='Log in']")).click();
	    
	    
	    

	}

}
