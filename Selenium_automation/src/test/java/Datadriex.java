import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadriex {


	

	    
	    @Test(dataProvider="automationdata")
	      public void logintopage(String username , String password) throws InterruptedException
	      {
		  WebDriver driver;
		     driver = new ChromeDriver();;
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		     driver.get("https://demowebshop.tricentis.com/login");
		     driver.manage().window().maximize();
		     driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(username);
		     driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
           driver.findElement(By.xpath("//input[@value='Log in']")).click();	  
           Thread.sleep(3000);
           driver.quit();
		    // driver.quit();

	}

	      @DataProvider(name="automationdata")
	      public Object[][] passData()
	      {
	    	  Object [][] data = new Object[4][2];
	    	  
	    	  data[0][0] = "admin1";
	    	  data[0][1] = "admin2";
	    	  
	    	  data[1][0] = "admin3";
	    	  data[1][1] = "admin2";
	    	  
	    	  data[2][0] = "admin4";
	    	  data[2][1] = "admin2";
	    	  
	    	  data[3][0] = "admin5";
	    	  data[3][1] = "admin2";
	    	  
	    	  return data;
	      }

}
	    
	    
	    
	    
	    
	    
	    
	
