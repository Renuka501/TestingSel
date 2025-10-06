import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertsexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
	    driver = new ChromeDriver();
	    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	    driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
	    Alert myalert = driver.switchTo().alert();
	    myalert.accept();
	    
	    driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
	     Alert alert3 = driver.switchTo().alert();
	     alert3.dismiss();
	    
	    driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	    Alert alert2 = driver.switchTo().alert();
	    alert2.sendKeys("hello");
	    driver.quit();

	}

}
