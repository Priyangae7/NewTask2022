package org.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgFirst  {
	@Test(dataProvider="res")
	private void a(String name, String pass) {
		
		WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement element = driver.findElement(By.id("email"));
	element.sendKeys(name);
	WebElement txtpass = driver.findElement(By.id("pass"));
	txtpass.sendKeys(pass);
	
		
		
	}
	@DataProvider(name="res")
	private Object[][] datas(){
		Object[][] obj=new Object[3][2];
		obj[0][0]="vasu";
		obj[0][1]="java";
		obj[1][0]="hari";
		obj[1][1]="selenium";
		obj[2][0]="priya";
		obj[2][1]="python";
		return obj;
		
	}
	}
