package Books;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contact {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RK\\Desktop\\driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.eviltester.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@href=\"/page/contact/\"])[1]")).click();
		driver.findElement(By.xpath("//input[@aria-labelledby=\"111label\"]")).click();
		
//		driver.findElement(By.xpath("//input[@id=\"111input\"]")).click();
//		driver.findElement(By.xpath("//div[@id=\"111container\"]")).click();
//		driver.findElement(By.xpath("//div[@id=\"111container\"]")).sendKeys("shree");
//		driver.close();
//		driver.findElement(By.xpath("//input[@id=\"113input\"]")).sendKeys("gajanan@gmail.com");
//		driver.findElement(By.xpath("//textarea[@id=\"115area\"]")).sendKeys("shreegajanan");

	}

}
