package seleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/create");
//Ajax = Asynchronous javascript and xml

//it is the best example of run time polymorphism
//experts says it is not  good practice to use both the waits together
//but if you want to use both the waits, then first use explicit wait and then use implicitwait

		WebElement ele = driver.findElement(By.xpath("(//input[@id='email'])[1]"));
//WebDriverWait w=new WebDriverWait(driver,20);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));// explicit wait

		w.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys("james gosling");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// implicit wait
		driver.quit();
	}

}
