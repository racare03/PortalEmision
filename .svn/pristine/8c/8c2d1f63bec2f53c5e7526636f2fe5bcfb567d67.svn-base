package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ControlesOperativosPage {
	
	WebDriver driver;
	By tarjeta = By.id("pan");
	By fechaCaducidad = By.xpath("(//input[@class='md-datepicker-input'])[1]");
	By consultar = By.xpath("//button[@class='md-button md-ink-ripple buttonstyle secondary']");
	By error = By.xpath("//div[@class='alert-text']");
	
	By botonCad = By.xpath("(//button[@class='md-datepicker-button md-icon-button md-button md-ink-ripple'])[1]");
	By caducidad = By.xpath("/html/body/div[5]/div[2]/md-calendar/div/md-calendar-year/div/md-virtual-repeat-container/div/div[2]/table/tbody[5]/tr[1]/td[2]/span");
	
	
	
	public ControlesOperativosPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setTarjeta(String pan) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(tarjeta));
		driver.findElement(tarjeta).sendKeys(pan);
		
	}
	
	public void setFechacaducidad() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(fechaCaducidad));
		
		driver.findElement(botonCad).click();
		
		//WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(caducidad));
		driver.findElement(caducidad).click();
		
//		WebElement calendario = driver.findElement(botonCad);
//		calendario.sendKeys(Keys.DOWN);
//		calendario.sendKeys(Keys.RETURN);
		
		
	}
	
	public void clicarConsultar() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(consultar));
		WebElement  element = driver.findElement(consultar);  
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click()", element);
	}
	
	public String getMensajeError() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBe(error, "ERROR - Error de tarjeta inexistente"));
		return driver.findElement(error).getText();
		
	}

}
