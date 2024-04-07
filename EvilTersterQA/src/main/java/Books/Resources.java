package Books;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resources {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RK\\Desktop\\driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.eviltester.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[contains(text(),Resources)])[14]")).click();
		driver.findElement(By.xpath("//a[@href=\"#agile-testing\"]")).click();
		driver.findElement(By.xpath("(//a[@class=\"btn btn-lg btn-primary\"])[1]")).click();
		//getting more time to find element
		//driver.findElement(By.xpath("class=\"btn btn-lg btn-success\"")).click();
		
	}

}
