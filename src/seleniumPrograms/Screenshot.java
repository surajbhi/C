package seleniumPrograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// "D:\Selenium\chromedriver.exe"
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);// takes ss
		File des = new File("C:\\Users\\suraj\\eclipse-workspace\\MySeleniumProject\\src\\seleniumPrograms\\FirstPage.png");
		FileHandler.copy(src, des);
		driver.quit();
	}

}
