package seleniumPrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Thread.sleep(5000);
		Alert alt = driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println(alt.getText());
		alt.sendKeys("my batch");
		alt.accept();
		Thread.sleep(5000);

		driver.quit();

	}

}
