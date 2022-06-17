package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/r.php?r=101");
		driver.manage().deleteAllCookies();
		// Thread.sleep(1000);

		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select(day);
		s.selectByVisibleText("7");
		// Thread.sleep(1000);

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1 = new Select(month);
		s1.selectByVisibleText("Sep");
		// Thread.sleep(1000);

		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1996");
		// driver.quit();

		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		Thread.sleep(1000);
		driver.quit();
	}
}
