package tests;

import org.testng.annotations.Test;

import pages.ControlesOperativosPage;
import pages.ControlesOperativosResultPage;
import pages.HomePage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestControlesOperativos {
	
	WebDriver driver;
	String PATH_DRIVER = "./drivers/chromedriver.exe";
	String TYPE_DRIVER = "webdriver.chrome.driver";
	
	HomePage home;
	ControlesOperativosPage controles;
	ControlesOperativosResultPage controlesResult;

		
	
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
	public void testControlesOperativos() {
		home.irControlesOperativos();
		controles = new ControlesOperativosPage(driver);
		controles.setTarjeta("4511260300199530");
		controles.setFechacaducidad();
		controles.clicarConsultar();
		controlesResult = new ControlesOperativosResultPage(driver);
		Assert.assertEquals("OK", controlesResult.getMensajeExito());		
		
	}
	
	@Test
	public void testRoaming() {
		home.irControlesOperativos();
		controles = new ControlesOperativosPage(driver);
		controles.setTarjeta("4511260300199530");
		controles.setFechacaducidad();
		controles.clicarConsultar();
		controlesResult = new ControlesOperativosResultPage(driver);
		controlesResult.clicarRoaming();
		Assert.assertEquals("Estado roaming:", controlesResult.getTextoRoaming());
		
	}
	
	@Test
	public void testComercioElectronico() {
		home.irControlesOperativos();
		controles = new ControlesOperativosPage(driver);
		controles.setTarjeta("4511260300199530");
		controles.setFechacaducidad();
		controles.clicarConsultar();
		controlesResult = new ControlesOperativosResultPage(driver);
		controlesResult.clicarComercioElectronico();
		Assert.assertEquals("Estado Comercio Electrónico:", controlesResult.getTextoComercioElectronico());
	
	}
	
	@Test
	public void testContactless() {
		home.irControlesOperativos();
		controles = new ControlesOperativosPage(driver);
		controles.setTarjeta("4511260300199530");
		controles.setFechacaducidad();
		controles.clicarConsultar();
		controlesResult = new ControlesOperativosResultPage(driver);
		controlesResult.clicarContactless();
		Assert.assertEquals("Indice ContactLess:", controlesResult.getTextoContactless());	
	}
	
	@Test
	public void testComercioSeguro() {
		home.irControlesOperativos();
		controles = new ControlesOperativosPage(driver);
		controles.setTarjeta("4511260300199530");
		controles.setFechacaducidad();
		controles.clicarConsultar();
		controlesResult = new ControlesOperativosResultPage(driver);
		controlesResult.clicarComercioSeguro();
		Assert.assertEquals("Estado Comercio Electrónico Seguro:", controlesResult.getTextoComercioSeguro());
	
	}
	
	@Test
	public void testOnOff() {
		home.irControlesOperativos();
		controles = new ControlesOperativosPage(driver);
		controles.setTarjeta("4511260300199530");
		controles.setFechacaducidad();
		controles.clicarConsultar();
		controlesResult = new ControlesOperativosResultPage(driver);
		controlesResult.clicarOnOff();
		Assert.assertEquals("Estado ON-OFF:", controlesResult.getTextoOnOff());	
	}
	
	@Test
	public void actualizar() {
		home.irControlesOperativos();
		controles = new ControlesOperativosPage(driver);
		controles.setTarjeta("4511260300199530");
		controles.setFechacaducidad();
		controles.clicarConsultar();
		controlesResult = new ControlesOperativosResultPage(driver);
		controlesResult.clicarActualizar();
		controlesResult.selectRoaming();
		controlesResult.clicarAceptar();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
