package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome driver 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.linkText("Best Sellers")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Today's D")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
