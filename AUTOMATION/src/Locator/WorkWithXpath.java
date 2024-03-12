package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithXpath {
	public static void main(String[] args){
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
	    driver.get("https://www.netflix.com/");
		
        driver.findElement(By.xpath("//a[@id='signIn']")).click();
        driver.findElement(By.xpath("//input[@id='id_userLoginId']")).sendKeys("akkaustubhDeshmukh@gmail.com");
        driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("Ankita@12");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
	}
}