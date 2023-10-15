
package page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoopProductImg {


	final Page page;
	Locator inputsearch;
	Locator searchConfirm;
	Locator chooseProduct;
	Locator imgAltassert;
	Locator cookieAccept;
	
	public CoopProductImg (Page page) {
		
	this.page = page;
	this.cookieAccept = page.locator("#cmpbntyestxt");
    this.inputsearch = page.locator("(//input[@class='Search-input'])[2]");
    this.searchConfirm =  page.locator("#portal").getByPlaceholder("Sök recept, varor, butiker och artiklar");
    this.chooseProduct = page.getByLabel("Gurka", new Page.GetByLabelOptions().setExact(true));
    this.imgAltassert = page.locator("img[alt='Gurka']");
	
}
	
	public void openCoopPage () {
	
	String openUrl = "https://www.coop.se/";
	page.navigate(openUrl);
	
}
	
	public void selectProduct() {
	
	cookieAccept.click();
	inputsearch.click();
	inputsearch.fill("gurka");
	searchConfirm.press("Enter");
	chooseProduct.click();
	
}

	public void assertImgGurka () {
		
	       assertNotNull(imgAltassert);

           String altText = imgAltassert.getAttribute("alt");

           assertEquals("Gurka", altText);
		
		
	}

}

