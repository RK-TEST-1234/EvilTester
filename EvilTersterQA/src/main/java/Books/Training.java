package Books;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Training {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RK\\Desktop\\driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.eviltester.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[contains(text(),Training)])[9]")).click();
		driver.findElement(By.xpath("(//img[@alt=\"Selenium WebDriver With Java Course Cover Image\"])[1]")).click();
		driver.findElement(By.xpath("(//a[@class=\"btn btn-lg btn-primary\"])[1]")).click();
		driver.findElement(By.xpath("//a[@class=\"btn btn-lg btn-success\"]")).click();
		Thread.sleep(2000);
		//the element getting more time to find
		//driver.findElement(By.xpath("(//div[@class=\"sc-egiyK cPhYjp\"])[1]")).click();
		//driver.findElement(By.xpath("//button[@class=\"sc-bqiRlB gmCYiZ\"]")).click();
	}

}
