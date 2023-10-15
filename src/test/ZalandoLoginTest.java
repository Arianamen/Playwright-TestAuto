package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import page.ZalandoLogin;
import test.base.TestBase;

public class ZalandoLoginTest extends TestBase  {

    @Test 
    public void loginTest() {

        ZalandoLogin zalandoLoginTest = new ZalandoLogin(page);

        zalandoLoginTest.opetStartPage();
        zalandoLoginTest.pageLogin("test@gmail.com", "password");
        
        
        	
        	  assertEquals(zalandoLoginTest.getSpanText(), "Inmatningen är för kort.");
    }

}
