package pages;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ServiciosTarjetaPage {

	
	WebDriver driver;
	By ConsultaDatos = By.xpath("/html/body/div[2]/div/div/a[1]/div");
	By tarjeta = By.id("pan");
	By btnConsultar = By.xpath("/html/body/div[2]/div/div/div[2]/div/form/div/div[4]/button[1]");
	By btnConsultarFamilia = By.xpath("/html/body/div[2]/div/div/div[2]/div/form/div/div[4]/button[2]");
	By btnNuevo = By.xpath("/html/body/div[2]/div/div/div[1]/div/button");
	By btnTarjetasDNI = By.xpath("/html/body/div[2]/div/div/a[2]/div");
	By DNI = By.id("dni");
	By ConsultarDNI = By.xpath("//*[@id=\"frmBusquedaDNI\"]/div/button");
	By ConsultarNuevoDNI = By.xpath("/html/body/div[2]/div/div/div[1]/div/button");
	By ClicarDni = By.id("select_option_3");
	By scroll = By.xpath("/html/body/div[2]/div/div/div[2]/div/form/div/div[2]/div[3]/md-select/md-select-value/span[1]/div");
	By ClicarNif = By.id("select_option_4");
	By ClicarOtro = By.id("select_option_5");
	By ClicarPasaporte = By.id("select_option_6");
	By ClicarResidente = By.id("select_option_7");
	By ClicarPortugues = By.id("select_option_8");
	By ActivarDesactivar = By.xpath("/html/body/div[2]/div/div/a[3]/div");
	By ConsultarActivar = By.xpath("/html/body/div[2]/div/div/div[2]/div/form/div/div[4]/button[1]");
	By ConsultarDatos = By.xpath("/html/body/div[2]/div/div/div[2]/div/form/div/div[4]/button[2]");
	By ConsultarNuevoDatos = By.xpath("/html/body/div[2]/div/div/div[1]/div/button");
	By Pin = By.xpath("/html/body/div[2]/div/div/a[4]/div");
	By Debito = By.xpath("/html/body/div[2]/div/div/a[5]/div");
	By Disponible = By.id("disponibleAmp");
	By btnModificar = By.xpath("/html/body/div[2]/div/div/div[1]/div/button[1]");
	By btnNuevaConsulta = By.xpath("/html/body/div[2]/div/div/div[1]/div/button[2]");
	By FechaAmp = By.id("fechaInicioAmpliacion");
	By Credito = By.xpath("/html/body/div[2]/div/div/a[6]/div");
	By Autorizacion = By.xpath("/html/body/div[2]/div/div/a[7]/div");
	By Consultar = By.xpath("/html/body/div[2]/div/div/form/div/div[2]/button[1]");
	By ConsultarDatosA = By.xpath("/html/body/div[2]/div/div/div[1]/div/button");
	By Movimientos = By.xpath("/html/body/div[2]/div/div/form/div/div[2]/button[2]");
	By ColectivoAlta = By.xpath("/html/body/div[2]/div/div/a[8]/div");
	By Comprobacion = By.xpath("/html/body/div[2]/div/div/div[3]/md-content/md-tabs/md-tabs-content-wrapper/md-tab-content[1]/div/div/div/div[2]/div[1]/div[1]");
	By ComprobacionNuevo = By.xpath("/html/body/div[4]/div/div[2]");
	By DatosEMV = By.id("tab-item-3");
	By EMVA = By.xpath("//*[@id=\"tab-content-3\"]/div/div/div/div[1]/div[1]/div[1]");
	By DatosTarjeta = By.id("tab-item-4");
	By DatosTarjetaA = By.xpath("//*[@id=\"tab-content-4\"]/div/div/div[2]/div[1]");
	By Perfiles = By.id("tab-item-5");	
	By PerfilesA = By.xpath("/html/body/div[2]/div/div/div[3]/md-content/md-tabs/md-tabs-content-wrapper/md-tab-content[4]/div/div/div/div[1]/div[1]/div[1]");
	By TiposUso = By.id("tab-item-6");
	By NormalA = By.xpath("/html/body/div[2]/div/div/div[3]/md-content/md-tabs/md-tabs-content-wrapper/md-tab-content[5]/div/div/div[1]/div[1]");	
	By ComproDNI = By.xpath("/html/body/div[4]/div/div[2]");
	By ComproTarjeta = By.xpath("/html/body/div[4]/div/div[2]");
	By BtnActivar = By.xpath("/html/body/div[2]/div/div/div[3]/button");
	By ComproAct = By.xpath("/html/body/div[4]/div/div[2]");
	By ComproPIN = By.xpath("/html/body/div[4]/div/div[2]");
	By BtnLiberar = By.xpath("/html/body/div[2]/div/div/div[3]/div[3]/button[1]");
	By BtnMarcar = By.xpath("/html/body/div[2]/div/div/div[3]/div[3]/button[2]");
	By ComproLi = By.xpath("/html/body/div[4]/div/div[2]");
	By ComproMa = By.xpath("/html/body/div[4]/div/div[2]");
	By FechaIni = By.id("fechaInicioAmpliacion");
	By FechaFin = By.id("fechaFinAmpliacion");
	By Aceptar= By.xpath("/html/body/div[8]/md-dialog/md-dialog-actions/button[2]");
	//By Aceptar1 = By.id
	//Constructor de la clase Servicios Tarjeta
	public ServiciosTarjetaPage(WebDriver driver) {
		this.driver = driver;
	}

	public void ClicarConsultarDatos() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ConsultaDatos));
		driver.findElement(ConsultaDatos).click();
	}
		
	public void setTarjeta(String pan) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(tarjeta));
		driver.findElement(tarjeta).sendKeys(pan);
		
	}
	
	public void ClicarConsultar() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(btnConsultar));
		driver.findElement(btnConsultar).click();
	}
	
	public void ClicarActivar() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(BtnActivar));
		driver.findElement(BtnActivar).click();
	}
	
	public void ClicarAceptar() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(Aceptar));
		driver.findElement(Aceptar).click();
	}
	public void ClicarLiberar() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(BtnLiberar));
		driver.findElement(BtnLiberar).click();
	}
	

	public void ClicarMarcar() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(BtnMarcar));
		driver.findElement(BtnMarcar).click();
	}
	public void ClicarConsultarFamilia() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(btnConsultarFamilia));
		driver.findElement(btnConsultarFamilia).click();
	}
	
	public void ClicarNuevo() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(btnNuevo));
		driver.findElement(btnNuevo).click();
	}
		
	public void ClicarConsultarTarjetasDNI() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(btnTarjetasDNI));
		driver.findElement(btnTarjetasDNI).click();
	}
	
	public void setDNI(String dni) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(DNI));
		driver.findElement(DNI).sendKeys(dni);
		
	}
	public String getComprobacionDNI()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBe(ComproDNI,"OK - Registros obtenidos: 41"));
		return driver.findElement(ComproDNI).getText();
		
	}
	public void setFechaInicio(String fecha) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(FechaIni));
		driver.findElement(FechaIni).clear();
		driver.findElement(FechaIni).sendKeys(fecha);	
	}
	

	public void setFechaFin(String fecha2) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(FechaFin));
		driver.findElement(FechaFin).clear();
		driver.findElement(FechaFin).sendKeys(fecha2);	
	}

	
	public String getComprobacionPIN()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBe(ComproPIN,"OK - undefined"));
		return driver.findElement(ComproPIN).getText();
		
	}
	public String getComprobacionLi()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBe(ComproMa,"OK"));
		return driver.findElement(ComproMa).getText();
		
	}
	public String getComprobacionMa()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBe(ComproLi,"OK"));
		return driver.findElement(ComproLi).getText();
		
	}
	public void ClicarConsultarDNI() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ConsultarDNI));
		driver.findElement(ConsultarDNI).click();
	}
	
	public void ClicarConsultarNuevoDNI() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(ConsultarNuevoDNI));
		driver.findElement(ConsultarNuevoDNI).click();
	}
	
	public void setNIF(String nif) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(DNI));
		driver.findElement(DNI).sendKeys(nif);
		
	}
	public void setOtro(String otro) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(DNI));
		driver.findElement(DNI).sendKeys(otro);
		
	}
	
	public void setPasaporte(String pasaporte) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(DNI));
		driver.findElement(DNI).sendKeys(pasaporte);
		
	}
	
	public void setResidente(String residente) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(DNI));
		driver.findElement(DNI).sendKeys(residente);
		
	}
	
	public void setPortugues(String portugues) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(DNI));
		driver.findElement(DNI).sendKeys(portugues);
		
	}
	public String getComprobacionPasaporte()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBe(ComproDNI,"OK - Registros obtenidos: 4"));
		return driver.findElement(ComproDNI).getText();
		
	}
	
	public String getComprobacionOtro()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBe(ComproDNI,"OK - Registros obtenidos: 43"));
		return driver.findElement(ComproDNI).getText();
		
	}
	
	public String getComprobacionResidente()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBe(ComproDNI,"OK - Registros obtenidos: 2"));
		return driver.findElement(ComproDNI).getText();
		
	}
	
	public String getComprobacionPortugues()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBe(ComproDNI,"OK - Registros obtenidos: 1"));
		return driver.findElement(ComproDNI).getText();
		
	}
	
	public String getComprobacionTarjeta()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBe(ComproTarjeta,"Se ha actualizado el estado de la tarjeta"));
		return driver.findElement(ComproTarjeta).getText();
		
	}
	
	public String getComprobacionAct()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBe(ComproAct,"OK - Registros obtenidos: 3"));
		return driver.findElement(ComproAct).getText();
		
	}
	
	public String getComprobacionNIF()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBe(ComproDNI,"OK - Registros obtenidos: 29"));
		return driver.findElement(ComproDNI).getText();
		
	}
	

	public void ClicarDNI() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(scroll));
		driver.findElement(scroll).click();
		
	}
	
	public void ClicarPortugues() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(scroll));
		driver.findElement(scroll).click();
		
	}
	
	public void ClicarOtro() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(scroll));
		driver.findElement(scroll).click();
		
	}
	public void ClicarResidente() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(scroll));
		driver.findElement(scroll).click();
		
	}
	
	
	public void ClicarPasaporte() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(scroll));
		driver.findElement(scroll).click();
		
	}
	
	//Seleccionar el estado del perfil
	public void SelectNIF(){


		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement element = driver.findElement(ClicarNif);
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		ex.executeScript("arguments[0].scrollIntoView(true);",element);
		wait.until(ExpectedConditions.elementToBeClickable(ClicarNif));
		driver.findElement(ClicarNif).click();

	}
				
	public void SelectOtro(){


		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement element = driver.findElement(ClicarOtro);
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		ex.executeScript("arguments[0].scrollIntoView(true);",element);
		wait.until(ExpectedConditions.elementToBeClickable(ClicarOtro));
		driver.findElement(ClicarOtro).click();

	}
	
	
	public void SelectPasaporte(){


		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement element = driver.findElement(ClicarPasaporte);
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		ex.executeScript("arguments[0].scrollIntoView(true);",element);
		wait.until(ExpectedConditions.elementToBeClickable(ClicarPasaporte));
		driver.findElement(ClicarPasaporte).click();

	}
	
	public void SelectPortugues(){


		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement element = driver.findElement(ClicarPortugues);
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		ex.executeScript("arguments[0].scrollIntoView(true);",element);
		wait.until(ExpectedConditions.elementToBeClickable(ClicarPortugues));
		driver.findElement(ClicarPortugues).click();

	}
	public void SelectResidente(){


		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement element = driver.findElement(ClicarResidente);
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		ex.executeScript("arguments[0].scrollIntoView(true);",element);
		wait.until(ExpectedConditions.elementToBeClickable(ClicarResidente));
		driver.findElement(ClicarResidente).click();

	}
	public void ClicarConsultarActivar() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ActivarDesactivar));
		driver.findElement(ActivarDesactivar).click();
	}
	
	
	public void ClicarConsultarActivarDesactivar() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ConsultarActivar));
		driver.findElement(ConsultarActivar).click();
	}
	
	public void ClicarConsultarDatosTar() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ConsultarDatos));
		driver.findElement(ConsultarDatos).click();
	}
	
	public void ClicarConsultarNuevoDatos() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ConsultarNuevoDatos));
		driver.findElement(ConsultarNuevoDatos).click();
	}
	
	public void ClicarConsultarPIN() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(Pin));
		driver.findElement(Pin).click();
	}
	
	public void ClicarConsultarDebito() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(Debito));
		driver.findElement(Debito).click();
	}
	
	public void Disponible() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(Disponible));
		driver.findElement(Disponible).click();
	}
	
	
	public void Modificar() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(btnModificar));
		driver.findElement(btnModificar).click();
		

	}
	public void NuevaConsulta() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(btnNuevaConsulta));
		driver.findElement(btnNuevaConsulta).click();
	}
	
	public void ClicarConsultarCredito() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(Credito));
		driver.findElement(Credito).click();
	}
	
	public void ClicarConsultarAutorizacion() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(Autorizacion));
		driver.findElement(Autorizacion).click();
	}
	
	public void ClicarConsultarA() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(Autorizacion));
		driver.findElement(Autorizacion).click();
	}
	
	public void ClicarConsultarAutorizacio() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(Consultar));
		driver.findElement(Consultar).click();
	}
	
	public void ClicarConsultarDatosAuri() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ConsultarDatosA));
		driver.findElement(ConsultarDatosA).click();
	}
	
	public void ClicarConsultarMovimientos() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(Movimientos));
		driver.findElement(Movimientos).click();
	}
	
	public void ClicarColectivoAlta() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ColectivoAlta));
		driver.findElement(ColectivoAlta).click();
	}
	public String getComprobacion()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBe(Comprobacion,"Id Titular"));
		return driver.findElement(Comprobacion).getText();
		
	}
	
	public String getComprobacionNuevo()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBe(ComprobacionNuevo,"OK - Registros obtenidos: 3"));
		return driver.findElement(ComprobacionNuevo).getText();
		
	}
	
	public void ClicarEMV() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(DatosEMV));
		driver.findElement(DatosEMV).click();
	}
	
	public String getComprobacionEMV()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBe(EMVA,"EMV"));
		return driver.findElement(EMVA).getText();
		
	}
	public void ClicarEstadodeTarjeta() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(DatosTarjeta));
		driver.findElement(DatosTarjeta).click();
	}
	
	public String getComprobacionDatosTarjeta()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBe(DatosTarjetaA,"Estado"));
		return driver.findElement(DatosTarjetaA).getText();
		
	}
	
	public void ClicarPerfiles() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(Perfiles));
		driver.findElement(Perfiles).click();
	}
	
	public String getComprobacionPerfiles()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBe(PerfilesA,"Perfil de Comisiones"));
		return driver.findElement(PerfilesA).getText();
		
	}
	
	public void ClicarTiposUso() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(TiposUso));
		driver.findElement(TiposUso).click();
	}
	
	public String getComprobacionTiposUso()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBe(NormalA,"Normal"));
		return driver.findElement(NormalA).getText();
		
	}
	
	
				
	
}
