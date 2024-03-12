package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookFlightOnPayTM {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://paytm.com/");
		
		driver.findElement(By.xpath("//img[@src='https://assetscdn1.paytm.com/images/catalog/view_item/733296/1626259884425.png']")).click();
		
		driver.findElement(By.id("from")).click();
		driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
		driver.findElement(By.className("_1X2Sn")).sendKeys("pune");
		
		driver.findElement(By.xpath("//div[text()='Pune, Maharashtra, India']")).click();
		
     	driver.findElement(By.id("to")).click();
		driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
		 Thread.sleep(2000);
	    driver.findElement(By.id("text-box")).sendKeys("Ayodhya");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[text()='Ayodhya, Uttar Pradesh, India']")).click();
	    
	    driver.findElement(By.id("departureDate")).click();
	    driver.findElement(By.id("flightSearch")).click();
	    
	    driver.findElement(By.xpath("(//div[@class='pQN8k'])[1]")).click();
	    
		
	 
		
	}//https://assetscdn1.paytm.com/images/catalog/view_item/733296/1626259884425.png

}//img[@src='https://assetscdn1.paytm.com/images/catalog/view_item/733296/1626259884425.png']
