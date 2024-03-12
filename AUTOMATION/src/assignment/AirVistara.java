package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AirVistara {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//get the url of vistara
		driver.get("https://www.airvistara.com/");
		//click on from location
		WebElement from=driver.findElement(By.name("flightSearchFrom"));
		from.click();
		from.sendKeys("Pune",Keys.ENTER);
		
		
		//click on destination location
		WebElement to=driver.findElement(By.name("flightSearchTo"));
		to.click();
		to.sendKeys("Delhi");
		
		driver.findElement(By.id("acceptAllBtn")).click();
		
		//select Date
		driver.findElement(By.xpath("//input[@placeholder='Departure']")).click();
		
		Thread.sleep(2000);
		
		//select the date
		driver.findElement(By.xpath("//a[text()='28']")).click();
		
		//select the return date
		driver.findElement(By.xpath("//a[text()='31']")).click();
	
		
		driver.findElement(By.xpath("//button[text()='Search Flights']")).click();
		
	}
	
}
