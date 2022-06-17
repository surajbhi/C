package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramesHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(3000);
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");

		driver.findElement(By.xpath("//input[@id='a']")).click();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();

		driver.findElement(By.xpath("(//input)[1]")).sendKeys("hello my batch");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");

		WebElement rtr = driver.findElement(By.xpath("//select[@id='animals']"));

		Select s = new Select(rtr);
		s.selectByVisibleText("Big Baby Cat");
		Thread.sleep(3000);
		driver.quit();
	}

}
