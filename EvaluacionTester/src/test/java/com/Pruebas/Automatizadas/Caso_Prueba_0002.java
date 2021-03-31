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


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;




public class Caso_Prueba_0002 {
	
	private WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/job/analista-de-pruebas-lima/");
	}

	@Test
	public void testPrueba002() {
		
		driver.findElement(By.className("application_button")).click();
		
	    WebElement nombre = driver.findElement(By.name("nombre-completo"));
	    nombre.clear();
	    nombre.sendKeys("Usuario de Prueba");
	    nombre.submit();
		
		WebElement correo = driver.findElement(By.name("correo-electronico"));
		correo.clear();
		correo.sendKeys("usuario.prueba1@gmail.com");
		correo.submit();
		
		WebElement celular = driver.findElement(By.name("celular-o-telefono-de-contacto"));
		celular.clear();
		celular.sendKeys("999888777");
		celular.submit();
		
		
		WebElement location = driver.findElement(By.name("correo-electronico"));
		location.clear();
		location.sendKeys("usuario.prueba1@gmail.com");
		location.submit();
		
		
		WebElement estudios = driver.findElement(By.name("que-estudios-formales-tienes-o-en-que-semestre-te-encuentras-actualmente"));
		estudios.clear();
		estudios.sendKeys("Estudios tecnicos en Computación e Informatica y Universitarios Ingenieria de Sistemas");
		estudios.submit();
		
		WebElement tiempo = driver.findElement(By.name("que-tiempo-de-experiencia-certificada-tienes-en-pruebas-o-en-desarrollo-de-softwaresi-aplica"));
		tiempo.clear();
		tiempo.sendKeys("No existe un certificado que lo habale pero si he erealizado pruebas de software en mis entornos laborales.");
		tiempo.submit();
		
		WebElement conoces = driver.findElement(By.name("conoces-de-automatizacion-de-pruebas-te-gustaria-aprendersi-aplica"));
		conoces.clear();
		conoces.sendKeys("Ha nivel Basico");
		conoces.submit();
		
		WebElement aspiracion = driver.findElement(By.name("cual-es-tu-aspiracion-salarial"));
		aspiracion.clear();
		aspiracion.sendKeys("Salario de 3000 soles smensuales");
		aspiracion.submit();
		
		WebElement disponibilidad = driver.findElement(By.name("si-eres-seleccionado-que-disponibilidad-de-tiempo-para-ingresar-tendrias"));
		disponibilidad.clear();
		disponibilidad.sendKeys("Disponibilidad Inmediata");
		disponibilidad.submit();
		
		WebElement mensaje = driver.findElement(By.name("mensaje-adicional"));
		mensaje.clear();
		mensaje.sendKeys("Me encantaria trabajar en su empresa y aprender de los retos que me dde este excelente puesto.");
		mensaje.submit();
		
		//driver.findElement(By.id("cv")).click();
		WebElement fileInput = driver.findElement(By.id("cv")); 
		fileInput.sendKeys("C:/Users/Katherine/Pictures/IMAGENES CELEULAR/IMG_20190718_114757883.jpg");
		fileInput.submit();
		
		
	 //   driver.findElement(By.className("wp_job_manager_send_application_button")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() {
		//driver.quit();
	}

}
