package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateDemoApp {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();

		driver.findElement(By.id("phone")).sendKeys("9730253609");
		
		driver.findElement(By.id("select2")).click();
		
		driver.findElement(By.id("option11")).click();
		
		driver.findElement(By.id("select3")).click();
		
		driver.findElement(By.id("countryOpt6")).click();
		
		driver.findElement(By.id("select5")).click();
		
		driver.findElement(By.id("StateOpt22")).click();
		
		driver.findElement(By.id("select6")).click();
	  
		driver.findElement(By.id("CityOpt25")).click();
		
		
	}

}
