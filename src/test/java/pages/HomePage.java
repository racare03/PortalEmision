package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;
	By controles = By.xpath("(//div[@class='card'])[3]");
	By servicio = By.xpath("(//div[@class='card'])[5]");
	By autenticacion = By.xpath("(//div[@class='card'])[4]");
	By perfil = By.xpath("(//div[@class='card'])[6]");
			
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void irControlesOperativos() {
		driver.switchTo().frame("frameContenido");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(controles));
		driver.findElement(controles).click();
	}
	
	public void irServiciosTarjeta() {
		driver.switchTo().frame("frameContenido");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(servicio));
		driver.findElement(servicio).click();
	}
	
	public void irServicioAutenticacion() {
		driver.switchTo().frame("frameContenido");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(autenticacion));
		driver.findElement(autenticacion).click();
	}
	
	public void irPerfilComisiones() {
		driver.switchTo().frame("frameContenido");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(perfil));
		driver.findElement(perfil).click();
	}
	
}
