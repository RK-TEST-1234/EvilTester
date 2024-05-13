package iLovePDF;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
public class uploadDownload {
	
	    public static void main(String[] args) {

	    	System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver-win64\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();

	        driver.get("https://www.ilovepdf.com/pdf_to_jpg");

	        WebElement test = driver.findElement(By.id("upload-button"));
	        test.sendKeys(System.getProperty("user.dir"+"C:\\Users\\RK\\eclipse-workspace\\iLovePDF\\src\\main\\java\\iLovePDF\\EvilTester Testcases.xlsx"));

	        try {
	            Thread.sleep(10000); 
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
}
//	        WebElement downloadButton = driver.findElement(By.id("download-button"));
//	        downloadButton.click();
//
//	        // Wait for some time to allow file download process to complete
//	        try {
//	            Thread.sleep(5000); // Adjust sleep time as needed
//	        } catch (InterruptedException e) {
//	            e.printStackTrace();
//	        }
//
//	        // Check if the file has been downloaded successfully
//	        File downloadedFile = new File("C:\\\\\\\\Users\\\\\\\\RK\\\\\\\\Desktop\\\\\\\\EvilTester Testcases.xlsx");
//	        if (downloadedFile.exists()) {
//	            System.out.println("File downloaded successfully.");
//	        } else {
//	            System.out.println("Failed to download the file.");
//	        }
//
//	        // Close the browser
//	        driver.quit();
//	    }
//	}

