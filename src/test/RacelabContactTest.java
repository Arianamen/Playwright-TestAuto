package test;


import org.junit.jupiter.api.Test;
import page.RacelabContact;
import test.base.TestBase;

public class RacelabContactTest extends TestBase {
    
	@Test
	public void racelabContactTest() {
	    RacelabContact racelabContactTest = new RacelabContact(page);

	    racelabContactTest.openContactPage();

	  
	    racelabContactTest.fillContactForm("Arian", "Test@example.com", "0730746677", "Test skoluppgift teest body");

	    racelabContactTest.assertSendButton();
	   
	    
	    
	}
}
