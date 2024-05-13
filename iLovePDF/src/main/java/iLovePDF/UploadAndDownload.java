package iLovePDF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.io.File;

public class UploadAndDownload {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://smallpdf.com/excel-to-pdf");
		driver.manage().window().maximize();
		
		// File uploadFile = new File("C:\\\\Users\\\\RK\\\\Desktop\\\\EvilTester Testcases.xlsx");
		 WebElement fileInput = driver.findElement(By.xpath("//span[@class=\"sc-8s01yt-4 dNifye\"]"));
		 fileInput.sendKeys("C:\\\\Users\\\\RK\\\\Desktop\\\\EvilTester Testcases.xlsx");

		 
		 //fileInput.sendKeys(uploadFile.getAbsolutePath());
		    
		    
//		    driver.findElement(By.id("file-submit")).click();
//		WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
//	    fileInput.sendKeys(uploadFile.getAbsolutePath());
//	   // driver.findElement(By.id("file-submit")).click();
//		File pdf= new File("C:\\\\\\\\Users\\\\\\\\RK\\\\\\\\Desktop\\\\\\\\EvilTester Testcases.xlsx");
//		driver.findElement(By.xpath("//span[@class=\"sc-8s01yt-4 dNifye\"]")).sendKeys("");
		
		
//		driver.get("https://www.ilovepdf.com/pdf_to_jpg");
//		driver.manage().window().maximize();
//		File pdf= new File("C:\\Users\\RK\\Downloads\\dummy-pdf_2.pdf");
//		WebElement fileInput = driver.findElement(By.xpath("//a[@id=\"pickfiles\"]"));
//		fileInput.sendKeys(uploadFile.)
//		fileInput.sendKeys(uploadFile.getAbsolutePath());
//		driver.findElement(By.id("file-submit")).click();
		

//		driver.manage().window().maximize();
//		WebElement fileInput = driver.findElement(By.xpath("//a[@id=\"pickfiles\"]"));
//		fileInput.click();
	
//		File uploadFile = new File("C:\\Users\\RK\\Downloads\\dummy-pdf_2.pdf");
//		WebElement fileInput = driver.findElement(By.xpath("//a[@id=\"pickfiles\"]"));
//		fileInput.click();
//		 fileInput.sendKeys(uploadFile.getAbsolutePath());
		// driver.findElement(By.id("file-submit")).click();
		
		//driver.findElement(By.xpath("//span[@class=\"sc-8s01yt-4 dNifye\"]")).click();
	//	driver.findElement(By.xpath("//span[@class=\"sc-8s01yt-4 dNifye\"]")).sendKeys("C:\\Users\\RK\\Desktop\\EvilTester Testcases.xlsx");
									 
	
		
		//file.click();
//		file.sendKeys(source);
//		 Actions act = new Actions(driver);
//			String source = ("C:\\Users\\RK\\Desktop\\EvilTester Testcases.xlsx");
			

		 //StepIII
		 //To use dragAndDrop method
		 //act.dragAndDrop(source, destination).perform();;
		 
		 //Other approach 
//		act.moveToElement(source).clickAndHold().moveToElement(destination).release(
//		).build().perform();
		
//		 
//		    WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
//		    fileInput.sendKeys(uploadFile.getAbsolutePath());
//		    driver.findElement(By.id("file-submit")).click();
//
//		    WebElement fileName = driver.findElement(By.id("uploaded-files"));
//		    Assertions.assertEquals("selenium-snapshot.png", fileName.getText());
//	
		
	}

}
