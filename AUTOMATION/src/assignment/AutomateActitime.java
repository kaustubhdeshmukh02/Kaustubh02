package assignment;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateActitime {
	public static void main(String[] args) {
		Random r = new Random();
		Random no=r;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-vq42o64r/user/submit_tt.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//a[@class='content users']")).click();
		driver.findElement(By.xpath("//input[@type='button'and@value='Create New User']")).click();
		driver.findElement(By.name("username")).sendKeys("Manager");
		driver.findElement(By.name("passwordText")).sendKeys("Anku@12");
		driver.findElement(By.name("passwordTextRetype")).sendKeys("Anku@12");
		driver.findElement(By.name("firstName")).sendKeys("Anku");
		driver.findElement(By.name("lastName")).sendKeys("Deshmukh");
		WebElement time=driver.findElement(By.name("workdayDurationStr"));
		time.click();
		time.clear();
		time.sendKeys("10:00");
		driver.findElement(By.name("overtimeTracking")).click();
		driver.findElement(By.id("overtimeTrackingLevel_ReadOnly")).click();
		//driver.findElement(By.xpath("//input[@type='submit' and @value='   Create User   ']")).click();

	}
}