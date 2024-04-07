package Books;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuyBook {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RK\\Desktop\\driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.eviltester.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[contains(text(),Books)])[4]")).click();
		driver.findElement(By.xpath("/html/body/div/section/div/article/section/div/ul/li/a")).click();
		driver.findElement(By.xpath("/html/body/div/section/div/article/section/div/div/p/a/img")).click();
		driver.findElement(By.xpath("//a[@class=\"btn btn-lg btn-primary\"]")).click();
		driver.findElement(By.xpath("(//a[@class=\"btn btn-lg btn-success\"])[1]")).click();
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/article/div/div/div[2]/button/span")).click();
		driver.findElement(By.xpath("(//button[@class=\"btn--solid\"])[2]")).click();
		//getting more time to find element.
		//driver.findElement(By.xpath("html/body/div[1]/div/div/div/article/section/div[2]/aside[2]/div/div[2]/div[2]/div[2]/button")).click();
				
	}

}
