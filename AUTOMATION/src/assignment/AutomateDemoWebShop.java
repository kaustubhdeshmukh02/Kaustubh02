package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateDemoWebShop {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://blinkit.com/");
		driver.findElement(By.xpath("//button[text()='Detect my location']")).click();
		//driver.findElement(By.xpath("(//div[text()='Pune, Maharashtra, India'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='SearchBar__PlaceholderContainer-sc-16lps2d-0 dPbxWD']")).click();
		//search thr cocacola
		driver.findElement(By.xpath("//input[@placeholder='Search for atta dal and more']")).sendKeys("Cocacola",Keys.ENTER);
	//click on thee product
		driver.findElement(By.xpath("(//div[text()='ADD'])[3]")).click();
 //       driver.findElement(By.xpath("(//div[@role='button'])[24]")).click();
      	WebElement add = driver.findElement(By.xpath("(//button[@class='tw-flex'])[2]"));
		for (int i = 1; i < 4; i++) {
			add.click();
		}
	}

}
