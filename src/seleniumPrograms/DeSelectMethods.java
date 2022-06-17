package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/select-menu");

		WebElement car = driver.findElement(By.xpath("//select[@id='cars']"));
		Select s = new Select(car);
		s.selectByVisibleText("Audi");
		Thread.sleep(3000);

		s.deselectByVisibleText("Audi");
		Thread.sleep(3000);

		driver.quit();
	}

}