package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ControlesOperativosResultPage {
	
	WebDriver driver;
	
	By ok = By.xpath("//div[@class=\"alert success\"]");
	By roaming = By.id("tab-item-10");
	By textoRoaming = By.xpath("/html/body/div[2]/div[1]/div/div[4]/div[2]/md-content/md-tabs/md-tabs-content-wrapper/md-tab-content[1]/div/div/div[1]/div[1]");
	By comercio = By.id("tab-item-11");
	By textoComercioElectronico = By.xpath("/html/body/div[2]/div[1]/div/div[4]/div[2]/md-content/md-tabs/md-tabs-content-wrapper/md-tab-content[2]/div/div/div[1]/div[1]");
	By contactless = By.id("tab-item-12");
	By textoContactless = By.xpath("/html/body/div[2]/div[1]/div/div[4]/div[2]/md-content/md-tabs/md-tabs-content-wrapper/md-tab-content[3]/div/div/div[1]/div[1]");
	By comercioSeguro = By.id("tab-item-13");
	By textoComercioSeguro = By.xpath("/html/body/div[2]/div[1]/div/div[4]/div[2]/md-content/md-tabs/md-tabs-content-wrapper/md-tab-content[4]/div/div/div[1]/div[1]");
	By onOff = By.id("tab-item-14");
	By textoOnOff = By.xpath("/html/body/div[2]/div[1]/div/div[4]/div[2]/md-content/md-tabs/md-tabs-content-wrapper/md-tab-content[5]/div/div/div/div[1]");
	By actualizar = By.xpath("/html/body/div[2]/div[1]/div/div[4]/div[1]/button");
	By selectRoaming = By.xpath("/html/body/div[6]/md-dialog/md-dialog-content/div/div/div[6]/div[1]/md-select/md-select-value");
	By opcionRoaming = By.id("select_option_17");
	By aceptar = By.xpath("//*[@id=\"dialogContent_70\"]/div/md-dialog-actions/button[2]");
	
	public ControlesOperativosResultPage(WebDriver driver) {
		this.driver = driver;	
	}
	
	public String getMensajeExito() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBe(ok, "OK"));
		return driver.findElement(ok).getText();		
		
	}
	
	public void clicarRoaming() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(roaming));
		driver.findElement(roaming).click();	
	}
	
	public String getTextoRoaming() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBe(textoRoaming, "Estado roaming:"));
		return driver.findElement(textoRoaming).getText();
		
	}
	
	public void clicarComercioElectronico() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(comercio));
		driver.findElement(comercio).click();
	}
	
	public String getTextoComercioElectronico() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBe(textoComercioElectronico, "Estado Comercio Electrónico:"));
		return driver.findElement(textoComercioElectronico).getText();
		
	}
	
	public void clicarContactless() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(contactless));
		driver.findElement(contactless).click();
		
	}
	
	public String getTextoContactless() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBe(textoContactless, "Indice ContactLess:"));
		return driver.findElement(textoContactless).getText();
		
	}
	
	public void clicarComercioSeguro() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(comercioSeguro));
		driver.findElement(comercioSeguro).click();
	}
	
	public String getTextoComercioSeguro() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBe(textoComercioSeguro, "Estado Comercio Electrónico Seguro:"));
		return driver.findElement(textoComercioSeguro).getText();
		
	}
	
	public void clicarOnOff() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(onOff));
		driver.findElement(onOff).click();
		
	}
	
	public String getTextoOnOff() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBe(textoOnOff, "Estado ON-OFF:"));
		return driver.findElement(textoOnOff).getText();
		
	}
	
	public void clicarActualizar() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(actualizar));
		driver.findElement(actualizar).click();
	}
	
	public void selectRoaming() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(selectRoaming));
		driver.findElement(selectRoaming).click();
		
//		WebElement element = driver.findElement(opcionRoaming);
//		JavascriptExecutor ex = (JavascriptExecutor)driver;
//		ex.executeScript("arguments[0].scrollIntoView(true);",element);
		wait.until(ExpectedConditions.elementToBeClickable(opcionRoaming));
		
		driver.findElement(opcionRoaming).click();
		
	}
	
	public void clicarAceptar() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(aceptar));
		driver.findElement(aceptar).click();
	}

}
