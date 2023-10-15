package page;

import org.junit.jupiter.api.Assertions;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class RacelabProductImg {
	
	Locator hoverMode;
	Locator hoverDodge;
	Locator chooseProductCategory;
	Locator chooseProduct;
	Locator assertImg;
	final Page page;
	
	public RacelabProductImg (Page page) {
		
		
		this.page = page;
		
		this.hoverMode = page.locator("'BILMODELL'");
		this.hoverDodge = page.locator("(//a[@class='needsclick'])[1]");
		this.chooseProductCategory = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("RAM 1500"));
		this.chooseProduct = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("HARD FLUSH TRI FOLD BED COVER | 6.5 FT BED | RAM 1500 (09-18)/2500 (10-22)")).first();

		this.assertImg = page.getByRole(AriaRole.IMG, new Page.GetByRoleOptions().setName("HARD FLUSH TRI FOLD BED COVER | 6.5 FT BED | RAM 1500 (09-18)/2500 (10-22)"));
	}
	
	
	public void openPage() {
		
        String siteUrl = "https://www.racelab.se/";
        page.navigate(siteUrl);
		
	}
	
	public void categoryAndProductSelect() {
		
		hoverMode.hover();
		hoverDodge.hover();
		chooseProductCategory.click();
		chooseProduct.click();
	}
	
	
	
	public void assertProductImg() {
		
		Assertions.assertTrue(assertImg.isVisible());
		
	}
	
	
	

}





