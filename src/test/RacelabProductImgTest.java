package test;



import org.junit.jupiter.api.Test;

import page.RacelabProductImg;
import test.base.TestBase;

public class RacelabProductImgTest extends TestBase {
	
	
	
	@Test
	public void racelabProductImgTest() {
		
		RacelabProductImg racelabProductImgTest = new RacelabProductImg(page);
		
		racelabProductImgTest.openPage();
		racelabProductImgTest.categoryAndProductSelect();
		racelabProductImgTest.assertProductImg();
	}

}
