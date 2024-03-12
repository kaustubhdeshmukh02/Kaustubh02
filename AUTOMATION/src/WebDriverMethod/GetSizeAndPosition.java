package WebDriverMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeAndPosition {
	public static void main(String[] args) {
		
	  WebDriver driver = new ChromeDriver();
	  
	  Dimension Size = driver.manage().window().getSize();
	   
	  System.out.println(Size);
	  
	  Point Position = driver.manage().window().getPosition();
	  
	  System.out.println(Position);
	  
	  driver.get("https://www.google.com");
	  
	}

}
