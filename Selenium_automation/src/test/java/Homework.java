import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
	    driver = new ChromeDriver();
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.findElement(By.linkText("Register")).click();
	    driver.findElement(By.id("gender-female")).click();
	    driver.findElement(By.id("FirstName")).sendKeys("Renuka");
	    driver.findElement(By.id("LastName")).sendKeys("Kumbhar");
	    driver.findElement(By.id("Email")).sendKeys("renuka.kumhare@gmail.com");
	    driver.findElement(By.id("Password")).sendKeys("Reepre@10");
	    driver.findElement(By.id("ConfirmPassword")).sendKeys("Reepre@10");
	    driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[4]/input")).click();
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,100)","");
	    
	    TakesScreenshot ts = (TakesScreenshot)driver;
	    File sourcefile = ts.getScreenshotAs(OutputType.FILE);
	    File targetfile = new File("C:\\Users\\renuka.kumbhar\\eclipse-workspace\\Selenium_automation\\Screenshot\\Register.png");
	    sourcefile.renameTo(targetfile);

	}

}
