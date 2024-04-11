package Saucedemo.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuyProduct {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RK\\Desktop\\driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"checkout\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"first-name\"]")).sendKeys("shree");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"last-name\"]")).sendKeys("gajanan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"postal-code\"]")).sendKeys("431506");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"finish\"]")).click();
		Thread.sleep(2000);
		driver.quit();


	}

}
