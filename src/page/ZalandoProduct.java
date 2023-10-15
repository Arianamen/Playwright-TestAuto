package page;



import org.junit.jupiter.api.Assertions;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class ZalandoProduct {
	
	final Page page;
	Locator cookieAccsept;
	Locator inputSearch;
	Locator chooseOption;
	Locator chooseProduct;
	Locator sizeOption;
	Locator chooseSize;
	Locator addProduct;
	Locator goToCart;
	Locator assertProduct;
	
	public ZalandoProduct (Page page) {
		
		this.page = page;
		this.inputSearch = page.getByPlaceholder("Sök");
		this.chooseOption = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("vinterjacka").setExact(true));
		this.chooseProduct =  page.locator(".I7OI1O > div:nth-child(2) > div").first();
		this.sizeOption = page.getByTestId("pdp-size-picker-trigger");	
		this.chooseSize = page.getByText("XL1");
		this.addProduct = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Handla"));
		this.goToCart = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Till varukorgen"));
		this.assertProduct = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Gå till kassan"));
		this.cookieAccsept  = page.locator("#uc-btn-accept-banner");
	}
	
	



	public void openStartPage() {
        String loginUrl = "https://www.zalando.se/";
        page.navigate(loginUrl);
    }

    public void searchAndAddProduct() {
    	cookieAccsept.click();
    	inputSearch.fill("vinterjacka");
    	chooseOption.click();
    	chooseProduct.click();
    	sizeOption.click();
    	chooseSize.click();
    	addProduct.click();
    	goToCart.click();
 
    }
    
    public void assertProductBuyButton() {
    	
    	Assertions.assertTrue(assertProduct.isVisible());
    }

}


