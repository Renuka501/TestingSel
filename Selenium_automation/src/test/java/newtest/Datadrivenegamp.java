package newtest;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datadrivenegamp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver;
	     driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     String excelPath = "C:\\Users\\renuka.kumbhar\\eclipse-workspace\\Selenium_automation\\Files\\newtest.xlsx";
	     ExcelUtil excelutil = new ExcelUtil(excelPath,"Sheet1");
	     driver.get("https://demowebshop.tricentis.com/login");
	    
	     for(int i =1;i<=excelutil.getRowCount();i++)
	     {
	    	 String email = excelutil.getcellData(i, 0);
	    	 String password = excelutil.getcellData(i, 1);
	    	 WebElement emailfield = driver.findElement(By.xpath("//input[@id='Email']"));
	    	 emailfield.clear();
	    	 emailfield.sendKeys(email);
WebElement passwordfield = driver.findElement(By.xpath("//input[@id='Password']"));;
	    	 passwordfield.clear();
	    	 passwordfield.sendKeys(password);
	    	 
	    	 WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));	
	    	 loginButton.click();
	    	 
	    	 if(driver.getCurrentUrl().contains("login"))
	    	 {
	    		 System.out.println("Login failed for" + email);
	    	 }
	    	 else
	    	 {
	    		 System.out.println("Login Succesfull for " + email);
	    		 
	    		 driver.findElement(By.linkText("Log out")).click();
	    		 driver.get("https://demowebshop.tricentis.com/login");
	    	 }
	     }
	     
	    
        driver.quit();
	     excelutil.close();
	}
}
