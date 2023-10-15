package test;

import org.junit.jupiter.api.Test;



import page.PlaygroundScrollbar;
import test.base.TestBase;

public class PlaygroundScrollbarTest extends TestBase{
	
	
	@Test
	
	public void playgroundScrollbarTest() {
		
		PlaygroundScrollbar playgroundScrollbarTest = new PlaygroundScrollbar(page);
		
		playgroundScrollbarTest.openPage();
		playgroundScrollbarTest.scrollTest();
		playgroundScrollbarTest.assertButtonIsVisible();
	}

}


