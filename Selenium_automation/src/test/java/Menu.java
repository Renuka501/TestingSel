import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
	    driver = new ChromeDriver();
	    driver.get("https://jqueryui.com/selectmenu/");
	    driver.manage().window().maximize();
	    WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	    driver.switchTo().frame(frame);
	    WebElement dropcountry = driver.findElement(By.name("speed"));
	    Select dro = new Select(dropcountry);
	    dro.selectByVisibleText("1");
	    dro.selectByIndex(4);
	 //   dro.deselectByValue(null);


	}

}
