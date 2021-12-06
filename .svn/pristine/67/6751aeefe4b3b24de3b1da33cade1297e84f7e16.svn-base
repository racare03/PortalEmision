package tests;
import org.testng.annotations.Test;
import pages.ControlesOperativosPage;
import pages.HomePage;
import pages.ServiciosTarjetaPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
public class TestServiciosTarjeta {

	
		
		WebDriver driver;
		String PATH_DRIVER = "./drivers/chromedriver.exe";
		String TYPE_DRIVER = "webdriver.chrome.driver";
		
		HomePage home;
		ServiciosTarjetaPage serviciosTarjeta;
		
		@BeforeMethod
		public void beforeMethod() {
			System.setProperty(TYPE_DRIVER, PATH_DRIVER);
			driver = new ChromeDriver();
			
			//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			//driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			driver.get("https://s6505gp:Portatil.2027@servicios-i.redsys.es:54443/portal-ea/");
			
			home = new HomePage(driver);
			
		}
		
		
		@Test
		public void testServiciosTarjeta() {
			home.irServiciosTarjeta();
			serviciosTarjeta = new ServiciosTarjetaPage(driver);
			serviciosTarjeta.ClicarConsultarDatos();
			serviciosTarjeta.setTarjeta("4511260300199530");
			serviciosTarjeta.ClicarConsultar();
			Assert.assertEquals("Id Titular",serviciosTarjeta.getComprobacion());
			serviciosTarjeta.ClicarEMV();
			Assert.assertEquals("EMV",serviciosTarjeta.getComprobacionEMV());
			serviciosTarjeta.ClicarEstadodeTarjeta();
			Assert.assertEquals("Estado",serviciosTarjeta.getComprobacionDatosTarjeta());
			serviciosTarjeta.ClicarPerfiles();
			Assert.assertEquals("Perfil de Comisiones",serviciosTarjeta.getComprobacionPerfiles());
			serviciosTarjeta.ClicarTiposUso();
			Assert.assertEquals("Normal",serviciosTarjeta.getComprobacionTiposUso());
			serviciosTarjeta.ClicarNuevo();
			
		}
		
		@Test
		public void testServiciosTarjetaNuevo() {
			home.irServiciosTarjeta();
			serviciosTarjeta = new ServiciosTarjetaPage(driver);
			serviciosTarjeta.ClicarConsultarDatos();
			serviciosTarjeta.setTarjeta("4511260300199530");
			serviciosTarjeta.ClicarConsultarFamilia();
			Assert.assertEquals("OK - Registros obtenidos: 3",serviciosTarjeta.getComprobacionNuevo());
			serviciosTarjeta.ClicarNuevo();

		}
		
		

		@Test
		public void testServiciosTarjetaDNI() {
			home.irServiciosTarjeta();
			serviciosTarjeta = new ServiciosTarjetaPage(driver);
			serviciosTarjeta.ClicarConsultarTarjetasDNI();
			serviciosTarjeta.setDNI("51921205Q");
			serviciosTarjeta.ClicarConsultarDNI();
			Assert.assertEquals("OK - Registros obtenidos: 41",serviciosTarjeta.getComprobacionDNI());
			serviciosTarjeta.ClicarConsultarNuevoDNI();
			

		}

		@Test
		public void testServiciosTarjetaNIF() {
			home.irServiciosTarjeta();
			serviciosTarjeta = new ServiciosTarjetaPage(driver);
			serviciosTarjeta.ClicarConsultarTarjetasDNI();
			serviciosTarjeta.ClicarDNI();
			serviciosTarjeta.SelectNIF();
			serviciosTarjeta.setNIF("33433446W");
			serviciosTarjeta.ClicarConsultarDNI();
			Assert.assertEquals("OK - Registros obtenidos: 29",serviciosTarjeta.getComprobacionNIF());
			serviciosTarjeta.ClicarConsultarNuevoDNI();
        

		}
		
		@Test
		public void testServiciosTarjetaOtro() {
			home.irServiciosTarjeta();
			serviciosTarjeta = new ServiciosTarjetaPage(driver);
			serviciosTarjeta.ClicarConsultarTarjetasDNI();
			serviciosTarjeta.ClicarOtro();
			serviciosTarjeta.SelectOtro();
			serviciosTarjeta.setOtro("68860594C");
			serviciosTarjeta.ClicarConsultarDNI();
			Assert.assertEquals("OK - Registros obtenidos: 43",serviciosTarjeta.getComprobacionOtro());
			serviciosTarjeta.ClicarConsultarNuevoDNI();		
			
		}
		
		@Test
		public void testServiciosTarjetaPasaporte() {
			home.irServiciosTarjeta();
			serviciosTarjeta = new ServiciosTarjetaPage(driver);
			serviciosTarjeta.ClicarConsultarTarjetasDNI();
			serviciosTarjeta.ClicarPasaporte();
			serviciosTarjeta.SelectPasaporte();
			serviciosTarjeta.setOtro("701099252");
			serviciosTarjeta.ClicarConsultarDNI();
			Assert.assertEquals("OK - Registros obtenidos: 4",serviciosTarjeta.getComprobacionPasaporte());
			serviciosTarjeta.ClicarConsultarNuevoDNI();
			
		}
			
		@Test
		public void testServiciosTarjetaResidente() {
			home.irServiciosTarjeta();
			serviciosTarjeta = new ServiciosTarjetaPage(driver);
			serviciosTarjeta.ClicarConsultarTarjetasDNI();
			serviciosTarjeta.ClicarResidente();
			serviciosTarjeta.SelectResidente();
			serviciosTarjeta.setResidente("X1311512Y");
			serviciosTarjeta.ClicarConsultarDNI();
			Assert.assertEquals("OK - Registros obtenidos: 2",serviciosTarjeta.getComprobacionResidente());
			serviciosTarjeta.ClicarConsultarNuevoDNI();
			
		}
		
		@Test
		public void testServiciosDNIPortugues() {
			home.irServiciosTarjeta();
			serviciosTarjeta = new ServiciosTarjetaPage(driver);
			serviciosTarjeta.ClicarConsultarTarjetasDNI();
			serviciosTarjeta.ClicarPortugues();
			serviciosTarjeta.SelectPortugues();
			serviciosTarjeta.setPortugues("005257348");
			serviciosTarjeta.ClicarConsultarDNI();
			Assert.assertEquals("OK - Registros obtenidos: 1",serviciosTarjeta.getComprobacionPortugues());
			serviciosTarjeta.ClicarConsultarNuevoDNI();
			
		}
			
		
		@Test
		public void testActivarDesactivar() {
			home.irServiciosTarjeta();
			serviciosTarjeta = new ServiciosTarjetaPage(driver);
			serviciosTarjeta.ClicarConsultarActivar();
			serviciosTarjeta.setTarjeta("4511260300199530");
			serviciosTarjeta.ClicarConsultarActivarDesactivar();
			serviciosTarjeta.ClicarActivar();
		    Assert.assertEquals("Se ha actualizado el estado de la tarjeta",serviciosTarjeta.getComprobacionTarjeta());
  		    serviciosTarjeta.ClicarConsultarNuevoDatos();
		}
		

		
		@Test
		public void testActivarDatos() {
			home.irServiciosTarjeta();
			serviciosTarjeta = new ServiciosTarjetaPage(driver);
			serviciosTarjeta.ClicarConsultarActivar();
			serviciosTarjeta.setTarjeta("4511260300199530");
			serviciosTarjeta.ClicarConsultarDatosTar();
			Assert.assertEquals("Id Titular",serviciosTarjeta.getComprobacion());
			serviciosTarjeta.ClicarEMV();
			Assert.assertEquals("EMV",serviciosTarjeta.getComprobacionEMV());
			serviciosTarjeta.ClicarEstadodeTarjeta();
			Assert.assertEquals("Estado",serviciosTarjeta.getComprobacionDatosTarjeta());
			serviciosTarjeta.ClicarPerfiles();
			Assert.assertEquals("Perfil de Comisiones",serviciosTarjeta.getComprobacionPerfiles());
			serviciosTarjeta.ClicarTiposUso();
			Assert.assertEquals("Normal",serviciosTarjeta.getComprobacionTiposUso());
			serviciosTarjeta.ClicarConsultarNuevoDatos();
  		    serviciosTarjeta.ClicarConsultarFamilia();
  		    serviciosTarjeta.ClicarConsultarNuevoDatos();
  		    serviciosTarjeta.ClicarConsultarFamilia();
  		    Assert.assertEquals("OK - Registros obtenidos: 3",serviciosTarjeta.getComprobacionAct());
  		    serviciosTarjeta.ClicarConsultarNuevoDatos();
			
		}

		
		@Test
		public void testServiciosPIN() {
			home.irServiciosTarjeta();
			serviciosTarjeta = new ServiciosTarjetaPage(driver);
			serviciosTarjeta.ClicarConsultarPIN();
			serviciosTarjeta.setTarjeta("4511260300199530");
			serviciosTarjeta.ClicarConsultar();
			Assert.assertEquals("OK - undefined",serviciosTarjeta.getComprobacionPIN());
			serviciosTarjeta.ClicarNuevo();
			
	}

		@Test
		public void testServiciosPINLiberar() {
			home.irServiciosTarjeta();
			serviciosTarjeta = new ServiciosTarjetaPage(driver);
			serviciosTarjeta.ClicarConsultarPIN();
			serviciosTarjeta.setTarjeta("4511260300199530");
			serviciosTarjeta.ClicarConsultar();			
			serviciosTarjeta.ClicarLiberar();
			Assert.assertEquals("OK",serviciosTarjeta.getComprobacionLi());
			serviciosTarjeta.ClicarNuevo();
			
	}
		
		@Test
		public void testServiciosPINMarcar() {
			home.irServiciosTarjeta();
			serviciosTarjeta = new ServiciosTarjetaPage(driver);
			serviciosTarjeta.ClicarConsultarPIN();
			serviciosTarjeta.setTarjeta("4511260300199530");
			serviciosTarjeta.ClicarConsultar();
			serviciosTarjeta.ClicarMarcar();
		    Assert.assertEquals("OK",serviciosTarjeta.getComprobacionLi());
			serviciosTarjeta.ClicarNuevo();
			
		}
		
				
		@Test
		public void testServiciosDebito() {
			home.irServiciosTarjeta();
			serviciosTarjeta = new ServiciosTarjetaPage(driver);
			serviciosTarjeta.ClicarConsultarDebito();
			serviciosTarjeta.setTarjeta("5351200549004018 ");
			serviciosTarjeta.ClicarConsultar();
			serviciosTarjeta.Modificar();
			serviciosTarjeta.setFechaInicio("2021/10/10");
			serviciosTarjeta.setFechaFin("2031/10/2031");
			serviciosTarjeta.ClicarAceptar();
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		@Test
		public void testServiciosCredito() {
			home.irServiciosTarjeta();
			serviciosTarjeta = new ServiciosTarjetaPage(driver);
			serviciosTarjeta.ClicarConsultarCredito();
			serviciosTarjeta.setTarjeta("5535141128409013");
			serviciosTarjeta.ClicarConsultar();
			serviciosTarjeta.Modificar();	
		}

//
//		@Test
//		public void testServiciosDebito() {
//			home.irServiciosTarjeta();
//			serviciosTarjeta = new ServiciosTarjetaPage(driver);
//			serviciosTarjeta.ClicarConsultarDebito();
//			serviciosTarjeta.setTarjeta("5535141128409013 ");
//			serviciosTarjeta.ClicarConsultar();
//			serviciosTarjeta.Modificar();
//
//		}
		
		@Test
		public void testServiciosAutorizacion() {
			home.irServiciosTarjeta();
			serviciosTarjeta = new ServiciosTarjetaPage(driver);
			serviciosTarjeta.ClicarConsultarAutorizacion();
			serviciosTarjeta.setTarjeta("5351200549004018");
			serviciosTarjeta.ClicarConsultarAutorizacio();

		}
//		@Test
//		public void testServicioColectivo() {
//			home.irServiciosTarjeta();
//			serviciosTarjeta = new ServiciosTarjetaPage(driver);
//			serviciosTarjeta.ClicarColectivoAlta();
//			serviciosTarjeta.setTarjeta("5351200549004018");
//			serviciosTarjeta.ClicarConsultarAutorizacio();
//
//		}

	
		
		@AfterMethod
		public void afterMethod() {
			driver.quit();
		}
}
