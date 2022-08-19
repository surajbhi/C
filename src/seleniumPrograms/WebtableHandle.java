package seleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome driver 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // upcasting
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		String beforeXpath="//*[@id=\"customers\"]/tbody/tr[";
		String afterXpath="]/td[1]";
		for(int i=2;i<=7;i++)
		{
			String actualXpath =beforeXpath+i+afterXpath;
			WebElement element=driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
//			if(element.getText().equals("Island Trading"))
//			{
//				System.out.println("company name:"+ element.getText()+"is found");
//				break;
//			}
			//*[@id="customers"]/tbody/tr[1]/th[1]
			//*[@id="customers"]/tbody/tr[1]/th[3]
			
			
			
			
			
			driver.quit();
			
		}
	}

}
