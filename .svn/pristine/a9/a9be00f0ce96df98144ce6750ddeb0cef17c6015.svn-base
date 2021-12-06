package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ServicioAutenticacionPage;

public class TestSevicioAutenticacion {
	
	WebDriver driver;
	String PATH_DRIVER = "./drivers/chromedriver.exe";
	String TYPE_DRIVER = "webdriver.chrome.driver";
	
	HomePage home;
	ServicioAutenticacionPage autenticacion;
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty(TYPE_DRIVER, PATH_DRIVER);
		driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		//driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://s6169rc:Almoca30@servicios-i.redsys.es:54443/portal-ea/");
		
		home = new HomePage(driver);
		
	}
	
	@Test
	public void busquedaTarjeta() {
		home.irServicioAutenticacion();
		autenticacion = new ServicioAutenticacionPage(driver);
		autenticacion.setFechaInicio("2021-05-14 09:00");
		autenticacion.setFechaFin("2021-05-14 09:10");
		autenticacion.setTarjeta("4041252122867823");
		autenticacion.clicarConsultar();
	}
			
	
	@Test
	public void busquedaCSB() {
		home.irServicioAutenticacion();
		autenticacion = new ServicioAutenticacionPage(driver);
		autenticacion.setFechaInicio("2021-05-14 09:00");
		autenticacion.setFechaFin("2021-05-14 09:10");
		autenticacion.elegirBusqueda();
		autenticacion.selectCSB();
		autenticacion.setCSB("225");
		autenticacion.clicarConsultar();
	}
	
	@Test
	public void busquedaOperacion() {
		home.irServicioAutenticacion();
		autenticacion = new ServicioAutenticacionPage(driver);
		autenticacion.setFechaInicio("2021-05-14 09:00");
		autenticacion.setFechaFin("2021-05-14 09:10");
		autenticacion.elegirBusqueda();
		autenticacion.selectOperacion();
		autenticacion.setOperacion("b00388b3-6e39-465f-abdd-fff84be46030");
		autenticacion.clicarConsultar();
		
	}
	
	
	
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
