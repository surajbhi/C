package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomModel.ActiTimeLoginPageClass;

public class TestClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://localhost/login.do");
		
		ActiTimeLoginPageClass login = new ActiTimeLoginPageClass(driver);
		login.enterActiTimeLoginPageUsername();
		login.enterActiTimeLoginPagePassword();
		login.clickActiTimeLoginButton();
		driver.quit();
	}

}
