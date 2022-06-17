package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		WebElement rightclick = driver.findElement(By.xpath("//a[@title='jQuery UI']"));
		Actions act = new Actions(driver);
		act.contextClick(rightclick).perform();
		Thread.sleep(5000);
		driver.quit();
	}
}
