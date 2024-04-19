package Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Pom {
	@FindBy(name = "email")
private WebElement email;

	public WebElement getEmail() {
		return email;
	}
    @FindBy(name="pswd")
	private WebElement pass;

	public WebElement getPass() {
		return pass;
	}
	@FindBy(id="loginSubmit")
	private WebElement Login;

	public WebElement getLogin() {
		return Login;
	}
	@FindBy(id="profile")
	private WebElement dropdown;

	public WebElement getDropdown() {
		return dropdown;
	}
	@FindBy(id="logout")
	private WebElement Signout;

	public WebElement getSignout() {
		return Signout;
	}
}
