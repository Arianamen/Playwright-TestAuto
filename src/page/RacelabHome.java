package page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class RacelabHome {
	
	Locator navigateLink;
	final Page page;
	
public RacelabHome(Page page) {
	
	this.page  = page;
	this.navigateLink = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("RACELAB ELECTRIC"));
	
}
public void openPage() {
	
	  String siteUrl = "https://www.racelab.se/";
      page.navigate(siteUrl);
}


public void navigateLinkTest() {
	
	navigateLink.click();
	
}


public void assertLink() {
	
	assert(page.url().equals("https://www.racelab.se/racelab-electric.html"));
}

}
