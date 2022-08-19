package seleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome driver 2\\chromedriver.exe");
		WebDriver suraj = new ChromeDriver();
		suraj.manage().window().maximize();
		suraj.navigate().to("https://www.facebook.com/r.php?r=101");
		suraj.manage().deleteAllCookies();
		// Thread.sleep(1000);
		
		suraj.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("suraj");
		suraj.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("bhirde");
		suraj.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("8624089141");
		suraj.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("Suraj@123");

		WebElement day = suraj.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select(day);
		s.selectByVisibleText("7");
		 Thread.sleep(1000);

		WebElement month = suraj.findElement(By.xpath("//select[@id='month']"));
		Select s1 = new Select(month);
		s1.selectByVisibleText("Sep");
		// Thread.sleep(1000);

		WebElement year = suraj.findElement(By.xpath("//select[@id='year']"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1996");
		// driver.quit();

		suraj.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		Thread.sleep(1000);
		
		suraj.findElement(By.xpath("//button[@class=\"_6j mvm _6wk _6wl _58mi _3ma _6o _6v\"]")).click();
suraj.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//driver.quit();
	}
}
