package page;


import static org.junit.jupiter.api.Assertions.assertTrue;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class PlaygroundScrollbar {

    Page page;

    Locator showButton;

    public PlaygroundScrollbar(Page page) {
        this.page = page;
        this.showButton = page.locator("#hidingButton");
    }

    public void openPage() {
        String urlPage = "http://uitestingplayground.com/scrollbars";
        page.navigate(urlPage);
    }
    public void scrollTest(){

        this.showButton.scrollIntoViewIfNeeded();
        this.showButton.click();
    }
    
    public void assertButtonIsVisible() {
        boolean isButtonVisible = page.locator("button.btn.btn-primary").isVisible();
        assertTrue(isButtonVisible, "Knappen är synlig.");
    }

}