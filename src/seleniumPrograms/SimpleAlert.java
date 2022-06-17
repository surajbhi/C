package seleniumPrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // upcasting
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(4000);
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		//alt.dismiss();
		Thread.sleep(4000);
		driver.quit();

	}

}
