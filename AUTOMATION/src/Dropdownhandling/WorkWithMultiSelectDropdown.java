package Dropdownhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkWithMultiSelectDropdown {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		
		
	    WebElement multiselectdropdown=driver.findElement(By.xpath("//select[@id='select-multiple-native']"));
	    
	    Select s = new Select(multiselectdropdown);
	    
	    for(int i=0;i<5;i++) {
	    	s.selectByIndex(i);
	    	Thread.sleep(1000);
	    }
		for(int i=0;i<5;i++) {
			s.deselectByIndex(i);
			Thread.sleep(1000);
			
		}
		
	}

}
