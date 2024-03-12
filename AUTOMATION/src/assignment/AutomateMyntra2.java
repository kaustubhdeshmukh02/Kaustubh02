package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateMyntra2 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://www.myntra.com/");
		driver.findElement(By.className("desktop-searchBar")).sendKeys("shirts",Keys.ENTER);
		
		//click on men radio button
	//	driver.findElement(By.xpath("//input[@value='men,men women' and @type='radio']")).click();
		//click on kurtas set
       driver.findElement(By.xpath("//input[@value='Indian Terrain']")).click();
	
	}

}
