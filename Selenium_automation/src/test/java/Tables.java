import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
	    driver = new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/web-table-element.php");
	    driver.manage().window().maximize();
	    WebElement data = driver.findElement(By.xpath("//table[@class='dataTable']"));
	    //System.out.println(col.size());
	    List<WebElement> rowtab = data.findElements(By.tagName("tr"));
	    int rowcount = rowtab.size();
	    
	    for (int row=0; row<rowcount; row++)
	    {
	    	List<WebElement> coltab = rowtab.get(row).findElements(By.tagName("td"));
	    			int colcount = coltab.size();
	    			{
	    				for(int column = 0;column<colcount;column++)
	    				{
	    					String text = coltab.get(column).getText();
	    					System.out.println(" "+ text);
	    				}
	    				System.out.println();
	    			}
	    }

	}

}
