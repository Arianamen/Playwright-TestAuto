package test;


import org.junit.jupiter.api.Test;

import page.HerokuMouseHover;
import test.base.TestBase;

public class HerokuMouseHoverTest extends TestBase{
	
	
	
	@Test
	public void herokuMouseHoverTest() {
		
		HerokuMouseHover herokuMouseHoverTest = new HerokuMouseHover(page, null, null);
		
		herokuMouseHoverTest.openPage();
		herokuMouseHoverTest.clickLink();
		herokuMouseHoverTest.hoverTest();
		herokuMouseHoverTest.assertHoverText();
		
		  
   
		
		

		
		
	}
			

}
