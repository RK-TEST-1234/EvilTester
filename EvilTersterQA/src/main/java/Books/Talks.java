package Books;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Talks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RK\\Desktop\\driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.eviltester.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//li[@class=\"rootdropdownmenuitem\"])[6]")).click();
		driver.findElement(By.xpath("//a[@class=\"btn btn-lg btn-success\"]")).click();
		driver.findElement(By.xpath("(//li[@class=\"lectureitem\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/ul/li/ul/li")).click();
		//driver.findElement(By.linkText("https://www.testerhq.com/member2/index.php?course=evil_tester_talks&page=lecture&lecture=001_introductionforeurostarmobiledeepdive2015&preview=true")).click();

	}

}
