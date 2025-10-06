import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmenttwo {

	public static void main(String[] args) {
	
		   WebDriver driver;
		    driver = new ChromeDriver();
		    driver.get("https://demo.guru99.com/test/web-table-element.php");
		    driver.manage().window().maximize();
		    List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
	        System.out.println("📋 Company Names:");
	        for (WebElement row : rows) 
	        {
	            WebElement companyCell = row.findElement(By.xpath("td[1]"));
	            String companyName = companyCell.getText();
	            System.out.println("• " + companyName);
	        }

	        driver.quit();
	        
	}

}
