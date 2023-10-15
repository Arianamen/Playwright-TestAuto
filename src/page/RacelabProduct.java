package page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class RacelabProduct {
    private final Page page;
    

    private Locator optionSize;
    private Locator chooseProduct;
    private Locator addToCart;
 
    private String cartText;

    public RacelabProduct(Page page) {
        this.page = page;

        this.optionSize = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("1\" - 3\""));
        this.chooseProduct = page.getByTitle("RC 2.5IN DODGE SUSPENSION LIFT KIT (06-08 RAM 1500 4WD)");
        this.addToCart = page.locator("//button[contains(@class,'btn btn-lg')]");
     
    }

    public void openStartPage() {
        String siteUrl = "https://www.racelab.se/liftkitt.html";
        page.navigate(siteUrl);
    }

    public void productAddtoCart() {
  
        optionSize.click();
        chooseProduct.click();
        addToCart.click();
    }

    public void verifyCartIsNotEmpty() {
     
        Locator cartLocator = page.locator("//*[@id=\"top\"]/header/div[1]/div[3]/div[2]/div/div[1]/div/div[2]");
        cartText = cartLocator.first().innerText();
    }

    public String getCartText() {
        return cartText;
    }
}

