import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragndrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
	    driver = new ChromeDriver();
	    driver.get("https://jqueryui.com/droppable/");
	    driver.manage().window().maximize();
	    WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	    driver.switchTo().frame(frame);
	    WebElement drop = driver.findElement(By.id("draggable"));
	    WebElement drag = driver.findElement(By.id("droppable"));
	    
	    Actions action = new Actions(driver);
	    action.dragAndDrop(drop, drag).perform();
	    
	    

	}

}
