package seleniumconcept;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionConcept {
	
	static WebDriver driver;

	/*
	 * 1. Validate whether the title is containing "" text or not 
	 * 2. Validate whether the title is not null and the length of title is greater than 15 and less than 100
	 * 3. Check for the links in the pages -->
	 * 4. Number of links displayed is exactly 10 or 15
	 * 
	 */

	
	@Test
	public static void assertionConceptDemo() {
		
		System.setProperty("webdriver.chrome.driver","E:\\Browser drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.tamilmatrimony.com/login/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    String Actualtitle = driver.getTitle();
	    String Expectedtitle = "Tamil Matrimony - The No. 1 Matrimony Site for Tamils";
	    Assert.assertEquals(Actualtitle, Expectedtitle);
	    
	    

}
	}


