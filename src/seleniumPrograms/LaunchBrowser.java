package seleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// "D:\Selenium\chromedriver.exe"

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // upcasting
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		// Thread.sleep(1000);
		driver.navigate().back();
		// Thread.sleep(1000);
		driver.navigate().forward();
		// Thread.sleep(1000);
		driver.navigate().refresh();
		String url = driver.getCurrentUrl();
		System.out.println(url);

		String title = driver.getTitle();
		System.out.println(title);

		// System.out.println(driver.getPageSource();
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.quit();

	}

}
