package seleniumPrograms;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome driver 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // upcasting
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//div[text()='Jobs']")).click();
		driver.findElement(By.xpath("//div[text()='Companies']")).click();
		driver.findElement(By.xpath("//div[text()='Services']")).click();
		
	   Thread.sleep(3000);
		Set<String> ids=driver.getWindowHandles(); //returns value in the form of string but order of insertion is random
		ArrayList a=new ArrayList(ids);         //order of ids will be maintained
		System.out.println(a.get(0));          //parent webpage id
		       //just to know the title
		System.out.println(driver.getTitle());
		   Thread.sleep(3000);

		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("selenium jobs");
		System.out.print("----------------------------------------------------");
		System.out.println(a.get(1));
		driver.switchTo().window((String) a.get(1));
		String title1=driver.getTitle();        //just to know the title
		System.out.println(title1);
		   Thread.sleep(3000);
		
		System.out.print("----------------------------------------------------");
		System.out.println(a.get(2));
		driver.switchTo().window((String) a.get(2));
		String title2=driver.getTitle();        //just to know the title
		System.out.println(title2);
		   Thread.sleep(3000);
		
		System.out.print("----------------------------------------------------");
		System.out.println(a.get(3));
		driver.switchTo().window((String) a.get(3));
		String title3=driver.getTitle();        //just to know the title
		System.out.println(title3);
		   Thread.sleep(3000);

		driver.quit();
	}

}
