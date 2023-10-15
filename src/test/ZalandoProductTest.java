package test;

import org.junit.jupiter.api.Test;

import page.ZalandoProduct;
import test.base.TestBase;

public class ZalandoProductTest extends TestBase {
	
	
	@Test
public void zalandoProductTest() {
	
		ZalandoProduct zalandoProductTest = new ZalandoProduct(page);
		zalandoProductTest.openStartPage();
		zalandoProductTest.searchAndAddProduct();
		zalandoProductTest.assertProductBuyButton();
	

	
	
	
}
	
	


	

}
