package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkInNetflix {
	
	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();

    driver.manage().window().maximize();
       
   	driver.get("https://www.instagram.com/");
	
	WebElement stf=driver.findElement(By.name("username"));
	
	stf.sendKeys("kaustubh.0802");
	
    WebElement pwd=driver.findElement(By.name("password"));
	
	pwd.sendKeys("ankita@12");
	
    driver.findElement(By.className("_acap")).click();
	
	}

}
