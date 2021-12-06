package tests;
import org.testng.annotations.Test;
import pages.ControlesOperativosPage;
import pages.HomePage;
import pages.PerfilComisionesPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
public class TestPerfilComisiones {


		WebDriver driver;
		String PATH_DRIVER = "./drivers/chromedriver.exe";
		String TYPE_DRIVER = "webdriver.chrome.driver";

		HomePage home;
		PerfilComisionesPage perfilcomisiones;
		
		@BeforeMethod
		public void beforeMethod() {
			System.setProperty(TYPE_DRIVER, PATH_DRIVER);
			driver = new ChromeDriver();
			
			//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			//driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			driver.get("https://s6505gp:Portatil.2026@servicios-i.redsys.es:54443/portal-ea/");
			
			home = new HomePage(driver);
			
		}
		


		@Test
		public void testPerfilComisiones() {
			home.irPerfilComisiones();
			perfilcomisiones = new PerfilComisionesPage(driver);
			perfilcomisiones.ClicarRedesPropias();
			perfilcomisiones.ElegirBanco();
			perfilcomisiones.selectTipoBanco();

			//Falla la plataforma en esta parte, habría que realizar más pruebas.
		}

		@Test
		public void testAltaPerfil() {
			home.irPerfilComisiones();
			perfilcomisiones = new PerfilComisionesPage(driver);
			perfilcomisiones.ClicarAltaPerfil();
			perfilcomisiones.RellenarPerfil();
			perfilcomisiones.TipoPerfil();
			perfilcomisiones.SelectTipoPerfil();
			perfilcomisiones.ElegirBanco();
			perfilcomisiones.selectTipoBanco();
			perfilcomisiones.ElegirBanco();
			perfilcomisiones.SelectTipoEmisor();
			

			//Falla la plataforma en esta parte, habría que realizar más pruebas.
		}

		@AfterMethod 
		public void tearDown() 
		{ 
			driver.quit();

		}














}