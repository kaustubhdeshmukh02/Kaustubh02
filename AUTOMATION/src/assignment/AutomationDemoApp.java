package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationDemoApp {
	 public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement registerbutton=driver.findElement(By.className("ico-register"));
		registerbutton.click();
		WebElement gender=driver.findElement(By.name("Gender"));
		gender.click();
		WebElement firstname=driver.findElement(By.id("FirstName"));
		firstname.sendKeys("Aishul");
		WebElement lastname=driver.findElement(By.id("LastName"));
		lastname.sendKeys("Bhapkar");
		WebElement stf=driver.findElement(By.id("Email"));
		stf.sendKeys("akkaustubhdeshmukh@gmail.com");
		WebElement pwd=driver.findElement(By.id("Password"));
		pwd.sendKeys("Aishwarya");
		WebElement cpwd=driver.findElement(By.id("ConfirmPassword"));
		cpwd.sendKeys("Aishwarya");
		WebElement registerbutton1=driver.findElement(By.name("register-button"));
		registerbutton1.click();	
	}

}
