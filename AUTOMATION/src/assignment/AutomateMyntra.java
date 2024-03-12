package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateMyntra {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.myntra.com/men-tshirts");
	
		//search
        driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("tshirts",Keys.ENTER);
    	
//		driver.findElement(By.xpath("(//img[@draggable='false'])[18]")).click();
		List<WebElement> tshirt = driver.findElements(By.xpath("//div[@class='product-productMetaInfo']"));
		//for loop
		for(int i=0; i < tshirt.size();i++) {
			System.out.println(tshirt.get(i).getText());
			System.out.println("-----------------------------");
		
		}
		driver.quit();
//		for(WebElement name:tshirt) {
//			System.out.println(name.getText());
//			System.out.println("==========================");
//		}
		
	}
}
