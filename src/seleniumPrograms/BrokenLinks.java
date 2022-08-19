package seleniumPrograms;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome driver 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // upcasting
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.redbus.in/");
		Thread.sleep(5);

		// capture links from a web page
		List<WebElement> links = driver.findElements(By.tagName("a"));

		// number of links
		System.out.println(links.size());

		for (int i = 0; i < links.size(); i++) {
			// by using href property we can get url
			WebElement element = links.get(i);
			String url = element.getAttribute("href");

			URL link = new URL(url); // special class
			// create a connection using url object link
			HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
			Thread.sleep(5);
			httpconn.connect();
			int rescode = httpconn.getResponseCode();// return response code ,if rescode >400 then broken link

			if (rescode >= 400) {
				System.out.println(url + "-" + "is broken link");

			} else {
				System.out.println(url + "-" + "is valid link");

			}
		}driver.quit();

	}

}
 