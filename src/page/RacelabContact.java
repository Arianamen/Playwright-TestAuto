package page;

import org.junit.jupiter.api.Assertions;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class RacelabContact {
	
	private final Page page;

	
	Locator userNameInput;
	Locator userInputEmail;
	Locator userInputMobil;
	Locator userInputBodyMessage;
	Locator sendButton;

	public RacelabContact(Page page) {
		this.page = page;
		this.userNameInput = page.getByLabel("Ditt namn");
		this.userInputEmail = page.getByPlaceholder("Exempelvis dittnamn@example.org");
		this.userInputMobil = page.getByPlaceholder("Exempelvis 0707124567");
		this.userInputBodyMessage = page.getByLabel("Meddelande");
		this.sendButton = (page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Skicka")));
	
	}


	public void openContactPage() {
		String siteUrl = "https://www.racelab.se/se/contact";
		page.navigate(siteUrl);
	}

	public void fillContactForm(String userName, String userEmail, String userMobil, String userMessage) {
		userNameInput.click();
		userNameInput.fill(userName);
		userInputEmail.fill(userEmail);
		userInputMobil.fill(userMobil);
		userInputBodyMessage.fill(userMessage);
	}

    public void assertSendButton() {
    	
    	Assertions.assertTrue(sendButton.isVisible());
    }

	
	}

