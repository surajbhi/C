package pomModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLoginPageClass {
	// Pom is made of 3 things
	// 1. Declaration
	// 2. Initialization
	// 3. Usage
	// 1. Declaration
	@FindBy(xpath = "//input[@id='username']")
	private WebElement un;

	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement pwd;

	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement LoginButton;

	// Initialization
	public ActiTimeLoginPageClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// 3.Usage
	public void enterActiTimeLoginPageUsername() {
		un.sendKeys("admin");
	}

	public void enterActiTimeLoginPagePassword() {
		pwd.sendKeys("manager");
	}

	public void clickActiTimeLoginButton() {
		LoginButton.click();
	}
}
