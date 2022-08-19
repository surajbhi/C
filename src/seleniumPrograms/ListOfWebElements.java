package seleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfWebElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome driver 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable");
		List <WebElement> elements=driver.findElements(By.xpath("//*"));
		System.out.println(Integer.toString(elements.size()));
		for(WebElement el:elements)
		{
			System.out.println(el.getTagName()+"-"+el.getText());
		}
	}

}
