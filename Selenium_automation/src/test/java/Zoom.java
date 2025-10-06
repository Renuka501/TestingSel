import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
	    driver = new ChromeDriver();
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    
	 
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("document.body.style.zoom='0.5'");

	}

}
