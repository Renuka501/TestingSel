import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
	    driver = new ChromeDriver();
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Mobiles");
	    driver.findElement(By.xpath("//input[@value='search']")).click();
	    
	}

}
