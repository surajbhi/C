package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContainsFunction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("(//span[text()='Sign in'])[2]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8624089141");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Suraj@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);

		driver.quit();

	}

}
