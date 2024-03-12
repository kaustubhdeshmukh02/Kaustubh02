package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkWithOwnBuildHtml {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("file:///C:/Users/Kaustubh/Desktop/tour.html");
			
			WebElement tour=driver.findElement(By.id("dropdown"));
          
			Select t = new Select(tour);
		    
		    for(int i=1;i<5;i++) {
		    	t.selectByIndex(i);
		    	Thread.sleep(1000);
		    }
			for(int i=1;i<5;i++) {
				t.deselectByIndex(i);
				Thread.sleep(1000);
		}

}}
