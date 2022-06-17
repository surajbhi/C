package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		// driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
		// driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(4000);
		// driver.navigate().back();
		driver.findElement(By.id("nav-link-accountList")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("surajbhirde96@gmail.com");
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);

		driver.quit();

	}

}
