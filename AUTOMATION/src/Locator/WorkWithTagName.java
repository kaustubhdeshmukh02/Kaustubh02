package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithTagName {
	 
    public static void main(String[] args) {
		
    	WebDriver driver=new ChromeDriver();
    	
    	driver.manage().window().maximize();
    	
    	driver.get("https://www.facebook.com/login/");
    	
    	WebElement stf=driver.findElement(By.name("email"));
    	
    	stf.sendKeys("akkaustubhdeshmukh@gmail.com");
    	
        WebElement pwd=driver.findElement(By.name("pass"));
    	
    	pwd.sendKeys("anku@12");
    	
    	WebElement loginbutton=driver.findElement(By.name("login"));
    	
    	loginbutton.click();
    	
    	
	}     
    
}
