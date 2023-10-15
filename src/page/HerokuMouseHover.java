package page;



import static org.junit.jupiter.api.Assertions.assertEquals;

import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class HerokuMouseHover {
	
	
	final Page page;
	Locator navigateToPage;
	Locator hoverFristImage;
	Locator hoverText;
	String elementToHoverSelector;
	String textElementSelector;
	
	public HerokuMouseHover(Page page, String elementToHoverSelector, String textElementSelector) {
		
		this.page = page;
		this.navigateToPage = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Hovers"));
		this.hoverFristImage = page.locator("(//div[@class='figure'])[1]");
		this.hoverText = page.getByText("user1");
		this.elementToHoverSelector = elementToHoverSelector;
        this.textElementSelector = textElementSelector;
		
		
		
		
		
		
	}
	
	public void openPage() {
		
		String pageUrlString = "https://the-internet.herokuapp.com/";
		page.navigate(pageUrlString);
		
	}
	
	public void clickLink() {
		
		navigateToPage.click();
	}
	
	public void hoverTest() {
		
		hoverFristImage.hover();
		
	}
    public String getTextFromElement() {
        ElementHandle element = page.locator("//h5[text()='name: user1']").elementHandle();
        return element.textContent();
    }
    
    public void assertHoverText() {
    	
    	   String displayedText = getTextFromElement();
           String expectedText = "name: user1"; 
           assertEquals(expectedText, displayedText);
    }

	
	
	
	
}
