package test;

import org.junit.jupiter.api.Test;

import page.RacelabProduct;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import test.base.TestBase;

public class RacelabProductTest extends TestBase {

	@Test
	public void racelabProductTest() {
		RacelabProduct racelabProductTest = new RacelabProduct(page);

		racelabProductTest.openStartPage();
		racelabProductTest.productAddtoCart();



		racelabProductTest.verifyCartIsNotEmpty();
		String cartText = racelabProductTest.getCartText();

		assertNotEquals("0", cartText, "Varukogen är tom");
		System.out.println(cartText);
	}
}
