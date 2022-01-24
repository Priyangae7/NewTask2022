package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {
	@Test
	private void a3() {
		System.out.println(Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement element = driver.findElement(By.id("email"));
	element.sendKeys("Vasu");
	WebElement pass = driver.findElement(By.id("pass"));
	pass.sendKeys("priya");
	
		
	}
	

}
