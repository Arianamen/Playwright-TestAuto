package page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ZalandoLogin {

    private final Page page;
    Locator loginPageButton;
    Locator userEmail;
    Locator userPassword;
    Locator sendButton;
    String spanText;
    
    



	public ZalandoLogin(Page page) {
    	
    	

        this.page = page;
        this.loginPageButton = page.getByTestId("user-account-icon");
        this.userEmail = page.getByPlaceholder("E-postadress");
        this.userPassword = page.getByPlaceholder("Lösenord");
        this.sendButton = page.getByTestId("login_button");
        this.spanText = "span:has-text('Inmatningen är för kort.')";
        
    }

    public void opetStartPage() {

        String url = "https://www.zalando.se/";
        page.navigate(url);

    }

    public void pageLogin(String inputEmail, String inputPassword) {

        loginPageButton.click();
        userEmail.fill(inputEmail);
        userPassword.fill(inputPassword);
        sendButton.click();

    }
    
    public String getSpanText() {
		return spanText;
	}

	public void setSpanText(String spanText) {
		this.spanText = spanText;
	}
    
    

}