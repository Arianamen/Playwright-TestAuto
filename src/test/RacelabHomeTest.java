package test;

import org.junit.jupiter.api.Test;

import page.RacelabHome;
import test.base.TestBase;

public class RacelabHomeTest extends TestBase{
	

	
	@Test
	public void racelabHomeTest() {
		
		RacelabHome racelabHometest = new RacelabHome(page);
		
		racelabHometest.openPage();
		racelabHometest.navigateLinkTest();
		racelabHometest.assertLink();
		
		
	}
	
	
	
}
