package com.Pruebas.Automatizadas;

//import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.JavascriptExecutor;

public class Caso_Prueba_0001 {
	
	private WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/empleos-testing/");
	}

	@Test
	public void testPrueba0001() {
		
	    WebElement keywords = driver.findElement(By.name("search_keywords"));
	    keywords.clear();
	    keywords.sendKeys("Analista de Pruebas");
	    keywords.submit();
		
		WebElement location = driver.findElement(By.name("search_location"));
		location.clear();
		location.sendKeys("Lima");
		location.submit();
		
	    driver.findElement(By.className("search_submit")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   /// assertEquals("Analista de Pruebas Lima",driver.getTitle());
	}
	
	@After
	public void tearDown() {
		//driver.quit();
	}

}
