package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.airvistara.com/in/en");
		  String actual_title=driver.getTitle();
		  String expected_title="Book Flights & Check In Online | Vistara";
	      if(actual_title.equals(expected_title)) 
	       {
			   
	    	  System.out.println("TestCase is Pass");
		   }
	      else 
	      {
		  
			  System.out.println("TestCase is fail");
		  }
			  
	}
	}

