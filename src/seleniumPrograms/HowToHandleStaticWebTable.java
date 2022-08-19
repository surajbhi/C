package seleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandleStaticWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome driver 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // upcasting
		driver.get("https://www.softwaretestingo.com/handle-static-web-table-in-selenium/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
int rows=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th")).size();
System.out.println(rows);
		driver.quit();
	}

}
