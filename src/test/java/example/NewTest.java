package example;		

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;

public class NewTest {		
	    private WebDriver driver;
	    
	    
	    
		@Test				
		public void testEasy() {	
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Free Selenium Tutorials")); 		
		}	
		//Changes5
		@Test				
		public void testEasy1() {	 
			String title = driver.getTitle();				 
			Assert.assertFalse(title.contains("Hi There!")); 		
		}
		
		@BeforeTest
		public void beforeTest() {	
		    driver = new FirefoxDriver(); 
		    driver.get("http://www.guru99.com/selenium-tutorial.html");
		}
		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	