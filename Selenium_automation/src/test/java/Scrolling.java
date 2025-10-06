import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) {
		
		
		WebDriver driver;
	    driver = new ChromeDriver();
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    
	   // 3 ways to scroll down 
	    
	    //By pixel 
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,500)","");
	    
	    //till bottom of page 
	   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	    
	    
	    // till the element 
	    WebElement ele = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[3]/div/div[2]/div[3]/div[2]/input"));
	    js.executeScript("arguments[0].scrollIntoView();", ele);

	}

}
