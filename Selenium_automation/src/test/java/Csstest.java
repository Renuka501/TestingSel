import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Csstest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		WebDriver driver;
	    driver = new ChromeDriver();
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Mobiles");
	    
	    //tag id = tag#id
	    //tag class = tag.class
	    //tag attribute = tag[attribute="value"]
	    //tag class attribute tag.classname[attribute="value"]
	}

}
