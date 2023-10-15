package page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class PlaygroundProgressBar {
	final Page page;
	Locator startButton;
	Locator stopButton;
	Locator progressBar;

	public PlaygroundProgressBar(Page page) {
		this.page = page;
		this.startButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Start"));
		this.stopButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Stop"));
		this.progressBar = page.locator("#progressBar");
	}

	public void openPage() {
		String urlPage = "http://uitestingplayground.com/progressbar";
		page.navigate(urlPage);
	}

	public void performProgressBarTest(int stopValue) {

		startButton.click();

		String selector = "div#progressBar[aria-valuenow='" + stopValue + "']";
		page.waitForSelector(selector);

		stopButton.click();
	}
	
	   public boolean isProgressBarValueCorrect(int expectedValue) {
	        String actualAttributeValue = progressBar.getAttribute("aria-valuenow");
	        int actualValue = Integer.parseInt(actualAttributeValue);
	        return actualValue == expectedValue;
	    }
}
