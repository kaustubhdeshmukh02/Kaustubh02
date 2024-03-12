package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationFacebook {
	public static void main(String[] args){
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");

		driver.findElement(By.name("firstname")).sendKeys("Kauank");
		driver.findElement(By.name("lastname")).sendKeys("Deshmukh");
		driver.findElement(By.name("reg_email__")).sendKeys("akkaustubhdesmukh@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("akkaustubhdesmukh@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Ankita@12");
		
		driver.findElement(By.id("day")).sendKeys("6");
        driver.findElement(By.id("month")).sendKeys("jul");
        driver.findElement(By.id("year")).sendKeys("2017");

		driver.findElement(By.cssSelector("input[value='2']")).click();
		driver.findElement(By.name("websubmit")).click();
	}
}
