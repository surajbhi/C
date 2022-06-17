package seleniumPrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(5000);
		alt.accept();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Alert alt1 = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(5000);
		alt1.dismiss();
		Thread.sleep(5000);
		driver.quit();

	}

}
