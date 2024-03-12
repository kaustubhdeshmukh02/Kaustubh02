package com.selenium.Jar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WorkingWithGetMethod {
	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.Flipcart.com/");
		String actual_title = driver.getTitle();
	String expected_title="Online shopping site for mobiles";
	if (actual_title.equals(expected_title)) {
		System.out.println("Test Case is Pass");
	} 
	else {
		System.out.println("Test Case is Fail");
	}
	}

}
