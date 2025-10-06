import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
	    driver = new ChromeDriver();
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.findElement(By.linkText("Log in")).click();
	    driver.findElement(By.id("Email")).sendKeys("renuka.kumbha123r@gmail.com");
	    driver.findElement(By.id("Password")).sendKeys("Reepree@10");
	    driver.findElement(By.id("RememberMe")).click();
	    driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	    

	}

}
