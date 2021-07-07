package seleniumconcept;

import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.Test;


public class AssertJConcept {
	
	 @Test
		public void AssertJDemoexample() {
	    	
	    	
	    	/*1. Is not null
	    	2. has size between 2 and 15
	    	3. has size of 7
	    	4. contains the letter sa
	    	5. doesnotcontain sat
	    	6. doesnotcontain s
	    	7.Lessthan 7
	    	8.Greater than 5
	    	9.endswith h"
	    	*/
	    	 

			
			String temp ="Hello World";
			
			assertThat(temp)
			.isNotNull()
			.hasSizeBetween(2, 15)
			.hasSize(7)
			.contains("He")
			.doesNotContain("Hell")
			.doesNotStartWith("H")
			.hasSizeGreaterThan(5)
			.hasSizeLessThan(10)
			.endsWith("World");
			
			
			
			
		}

	}



