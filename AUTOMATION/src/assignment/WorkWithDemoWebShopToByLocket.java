package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithDemoWebShopToByLocket {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		driver.findElement(By.id("Email")).sendKeys("akkaustubhdeshmukh@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("Aishwarya");
		
		driver.findElement(By.xpath("//input[@type='submit' and @class='button-1 login-button']")).click();
		
     	driver.findElement(By.xpath("//a[@href='/jewelry']")).click();	

     	driver.findElement(By.xpath("//div[@data-productid='14']")).click();
     	
     	
     	
         driver.findElement(By.id("add-to-cart-button-14")).click();
         Thread.sleep(2000);
         
         driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
         
         driver.findElement(By.xpath("//td[@class='remove-from-cart']/input")).click();
         
         driver.findElement(By.id("CountryId")).click();
         
         driver.findElement(By.xpath("//option[text()='India']")).click();
         
         driver.findElement(By.id("termsofservice")).click();
         
         driver.findElement(By.id("checkout")).click();
             
         
         driver.findElement(By.xpath("//input[@value='Continue' and @title='Continue']")).click();
        
         driver.findElement(By.id("PickUpInStore")).click();
         
         driver.findElement(By.xpath("//div[@id='shipping-buttons-container']/input")).click();
         
         driver.findElement(By.xpath("//input[@class='button-1 payment-method-next-step-button']")).click();
        
         driver.findElement(By.xpath("//input[@class='button-1 payment-info-next-step-button']")).click();
        
         driver.findElement(By.xpath("//input[@class='button-1 confirm-order-next-step-button']")).click();
        
         System.out.println("Your order has been successfully processed!");
        
         driver.findElement(By.xpath("//a[text()='Log out']")).click();
        
        
         
	}
	
}
