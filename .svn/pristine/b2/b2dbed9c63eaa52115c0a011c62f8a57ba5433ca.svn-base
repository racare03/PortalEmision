package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
public class PerfilComisionesPage {

	
	
	WebDriver driver;
	By RedesPropias = By.xpath("/html/body/div[2]/div/div/a[1]/div");
	By AltaPerfil = By.xpath("/html/body/div[2]/div/div/a[2]/div");
	By Banco = By.xpath("/html/body/div[2]/div/div/div[2]/div/md-select");
	By tarjeta = By.id("pan");
	By BancoSanPaolo = By.id("select_option_12");
	By RellenaPerfil = By.id("nombrePerfil");
	By TipoPerfil = By.id("select_8");
	By SelectNormal = By.id("select_option_5");
	By Emisor = By.xpath("/html/body/div[2]/div/form/div/div[3]/div[3]/md-select");
	//By SelectTipoEmisor = By.id("select_option_13");
	
	//Constructor de la clase Perfil Comisiones
	
		public PerfilComisionesPage(WebDriver driver) {
			this.driver = driver;
		}
		
		//Cliquear en redes propias
		public void ClicarRedesPropias() {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(RedesPropias));
			driver.findElement(RedesPropias).click();
		}
		
		//Cliquear en el banco 
		public void ElegirBanco() {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(Banco));
			driver.findElement(Banco).click();	
		}
		
		
		
		//Seleccionar el banco
		public void selectTipoBanco(){
		
			WebDriverWait wait = new WebDriverWait(driver,10);
			WebElement element = driver.findElement(BancoSanPaolo);
			JavascriptExecutor ex = (JavascriptExecutor)driver;
			ex.executeScript("arguments[0].scrollIntoView(true);",element);
			wait.until(ExpectedConditions.elementToBeClickable(BancoSanPaolo));
			driver.findElement(BancoSanPaolo).click();

		}
		
		
		
		//Cliquear en Alta Perfil
		public void ClicarAltaPerfil() {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(AltaPerfil));
			driver.findElement(AltaPerfil).click();
		}


		
		//Rellenar el Perfil
		public void RellenarPerfil()
		{
			WebDriverWait wait = new WebDriverWait(driver,30);
	        wait.until(ExpectedConditions.elementToBeClickable(RellenaPerfil));	
	        WebElement searchBox= driver.findElement(By.id("nombrePerfil"));
	        searchBox.sendKeys("miPerfil123");
		}
		
		
		//Seleccionar tipo de perfil 
		public void TipoPerfil() {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(TipoPerfil));
			driver.findElement(TipoPerfil).click();	
		}
		
		//Seleccionar el estado del perfil
		public void SelectTipoPerfil(){
			
		
			WebDriverWait wait = new WebDriverWait(driver,10);
			WebElement element = driver.findElement(SelectNormal);
			JavascriptExecutor ex = (JavascriptExecutor)driver;
			ex.executeScript("arguments[0].scrollIntoView(true);",element);
			wait.until(ExpectedConditions.elementToBeClickable(SelectNormal));
			driver.findElement(SelectNormal).click();

		}
			
		//Cliquear en el Emisor
		public void ElegirEmisor() {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(Emisor));
			driver.findElement(Emisor).click();	
		}

		//Seleccionar el estado del perfil
		public void SelectTipoEmisor(){


			WebDriverWait wait = new WebDriverWait(driver,10);
			WebElement element = driver.findElement(BancoSanPaolo);
			JavascriptExecutor ex = (JavascriptExecutor)driver;
			ex.executeScript("arguments[0].scrollIntoView(true);",element);
			wait.until(ExpectedConditions.elementToBeClickable(BancoSanPaolo));
			driver.findElement(BancoSanPaolo).click();

		}
		
		
		
		
		
		
//		public void clicarConsultar() {
//			WebDriverWait wait = new WebDriverWait(driver, 10);
//			wait.until(ExpectedConditions.presenceOfElementLocated(consultar));
//			WebElement  element = driver.findElement(consultar);  
//			JavascriptExecutor ex = (JavascriptExecutor)driver;
//			ex.executeScript("arguments[0].click()", element);
//		}
//		public void EligirBanco() {
//			WebDriverWait wait = new WebDriverWait(driver,30);
//			wait.until(ExpectedConditions.elementToBeClickable(Banco));
//			WebElement banco = driver.findElement(By.id("Banco"));
//			JavascriptExecutor jsExecuter = (JavascriptExecutor)driver;
//			jsExecuter.executeScript(window.scrollTo(0,document.body.scrollHeight));
//		}
//		
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 
//	       //get the height of the webpage and scroll to the end
//	       js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//	
//		
		
//		//Función Fecha operacion desde 
//		public void selectFechaOperacionDesde()
//		{
//			WebDriverWait wait = new WebDriverWait(driver,30);
//	        wait.until(ExpectedConditions.elementToBeClickable(FechaOperacionDesde));	
//			WebElement FechaDesde = driver.findElement(By.id("fechaOpeDesde"));
//			((JavascriptExecutor)driver).executeScript ("document.getElementById('fechaOpeDesde').removeAttribute('readonly',0);"); 
//			FechaDesde.clear();
//			FechaDesde.sendKeys("2020/08/24");
//		}
		
}


