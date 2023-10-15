package test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import test.base.TestBase;
import page.PlaygroundProgressBar;

public class PlaygroundProgressBarTest extends TestBase{
	
	
	@Test
	public void playgroundProgressBarTest() {
		
		
		PlaygroundProgressBar playgroundProgressBarTest = new PlaygroundProgressBar(page);
		
		playgroundProgressBarTest.openPage();
		playgroundProgressBarTest.performProgressBarTest(43);
		assertTrue(playgroundProgressBarTest.isProgressBarValueCorrect(43));
	}    	
	
	

}
