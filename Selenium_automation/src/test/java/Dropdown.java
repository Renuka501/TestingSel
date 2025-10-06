import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
	    driver = new ChromeDriver();
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    WebElement dropcountry = driver.findElement(By.name("birthday_day"));
	    Select drocountry = new Select(dropcountry);
	    drocountry.selectByVisibleText("2");
	    drocountry.selectByIndex(0);
	    drocountry.deselectByValue(null);

	}

}
