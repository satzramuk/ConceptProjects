package seleniumconcept;

import org.openqa.selenium.WebDriver;

public class ThreadLocalDemo {
	
private static ThreadLocal<WebDriver> dr = new ThreadLocal<>();
	
	
	public static WebDriver getDriver() {
		
		return dr.get();
	}
	
	
	public static void setDriver(WebDriver refer) {
		dr.set(refer);
	}
	
	
	public static void unload() {
		dr.remove();
	}


}
