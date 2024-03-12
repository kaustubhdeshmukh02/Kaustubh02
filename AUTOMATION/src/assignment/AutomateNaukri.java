package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateNaukri {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//open naukri
		driver.get("https://www.naukri.com/");
		
		//click on regeister button
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		//enter name in name
		driver.findElement(By.id("name")).sendKeys("Kaustya");
		
		//enter email
		driver.findElement(By.id("email")).sendKeys("samajnahiaraha@gmale.com");
		
		//enter pwd
		driver.findElement(By.id("password")).sendKeys("kuchpatanahi");
		
		//enter mobile no
		driver.findElement(By.id("mobile")).sendKeys("0000000000001");
		
		//click on fresher
		driver.findElement(By.xpath("(//div[@tabindex='0'])[2]")).click();
		//enter current location
		driver.findElement(By.xpath("//span[text()='Pune']")).click();

		//click on check box
		driver.findElement(By.xpath("//i[@class='ico resman-icon resman-icon-check-box']")).click();
		
		//click on register
		driver.findElement(By.xpath("//button[text()='Register now']")).click();
		
		Thread.sleep(3000);
		//click on login
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		//enter email
		driver.findElement(By.id("usernameField")).sendKeys("jathalal@male.com");
		//Enter pwd
		driver.findElement(By.id("passwordField")).sendKeys("tapu_ke_papa");
		//click on login button
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		
	
		
	}

}
