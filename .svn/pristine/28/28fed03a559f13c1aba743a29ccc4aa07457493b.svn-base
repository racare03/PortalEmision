package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ServicioAutenticacionPage {
	
	WebDriver driver;
	By fechaInicio = By.xpath("(//input[@id='datetimesecond'])[1]");
	By fechaFin = By.xpath("(//input[@id='datetimesecond'])[2]");
	By tarjeta = By.id("TARJ_IND_CONSULTA");
	//By consultar = By.xpath("//button[contains(text(),'Consultar')]");
	By consultar = By.xpath("/html/body/div[2]/div/div/div[2]/div/form/div/button");
	By tipoBusqueda = By.id("select_value_label_0");
	By csbForm = By.id("select_option_4");
	By csb = By.id("C00LCSB_GLOBAL_CONSULTA");
	By opForm = By.id("select_option_5");
	By operacion = By.id("CZOCOPER_3DSS_CONSULTA");
	
	public ServicioAutenticacionPage(WebDriver driver) {
		this.driver = driver;
	}

	
	public void setFechaInicio(String fecha1) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(fechaInicio));
		driver.findElement(fechaInicio).sendKeys(fecha1);	
	}
	
	public void setFechaFin(String fecha2) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(fechaFin));
		driver.findElement(fechaFin).sendKeys(fecha2);
	}
	
	public void setTarjeta(String pan) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(tarjeta));
		driver.findElement(tarjeta).sendKeys(pan);
	}
	
	public void clicarConsultar() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(consultar));
		driver.findElement(consultar).click();
		
	}

	
	public void elegirBusqueda() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tipoBusqueda));
		driver.findElement(tipoBusqueda).click();
	}

		
	public void selectCSB() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement element = driver.findElement(csbForm);
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		ex.executeScript("arguments[0].scrollIntoView(true);",element);
		wait.until(ExpectedConditions.elementToBeClickable(csbForm));
		driver.findElement(csbForm).click();		
	}
	
	public void setCSB(String csbRelleno) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(csb));
		driver.findElement(csb).sendKeys(csbRelleno);
	}
	
	public void selectOperacion() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement element = driver.findElement(opForm);
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		ex.executeScript("arguments[0].scrollIntoView(true);",element);
		wait.until(ExpectedConditions.elementToBeClickable(opForm));
		driver.findElement(opForm).click();
		
	}
	
	public void setOperacion(String operacionRellena) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(operacion));
		driver.findElement(operacion).sendKeys(operacionRellena);
		
	}
	
	

}


