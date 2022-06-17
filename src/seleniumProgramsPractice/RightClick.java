package seleniumProgramsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // upcasting
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.get("https://jqueryui.com/droppable/");
		WebElement RC = driver.findElement(By.xpath("//a[@title='Support the JS Foundation']"));
		Actions act = new Actions(driver);
		act.contextClick(RC).perform();
		driver.quit();

	}

}
