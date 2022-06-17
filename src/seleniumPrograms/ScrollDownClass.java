package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(3000);

		WebElement p = driver.findElement(By.xpath("(//li [@id='item-7'])[2]"));
		Point l = p.getLocation();
		System.out.println(l);

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		// js.executeScript("scroll(0,850)");//(+ve scroll down first way)

		js.executeScript("scroll(51,1053)");
		Thread.sleep(3000);
		js.executeScript("scroll(0,-850)");// (-ve scroll up
		Thread.sleep(3000);
		driver.quit();

	}

}
