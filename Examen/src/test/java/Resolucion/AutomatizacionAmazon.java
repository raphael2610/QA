package Resolucion;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatizacionAmazon {

	public WebDriver driver;

	By BuscadorLocator = By.xpath("//input[@id='twotabsearchtextbox']");
	By BtnBuscarLocator = By.xpath("//input[@id='nav-search-submit-button']");

	By Deshacer = By.linkText("Deshacer");

	By BtnMarcaLocator = By.xpath("//*[@id=\"p_89/adidas\"]/span/a/span");

	By PrimerProductoLocator = By.xpath(
			"//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/a[1]/div[1]/img[1]");
	By SegundoProductoLocator = By.xpath(
			"//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[3]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/a[1]/div[1]/img[1]");
	By TercerProductoLocator = By.xpath(
			"//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[3]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/a[1]/div[1]/img[1]");
	By CuartoProductoLocator = By.xpath(
			"//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[3]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/a[1]/div[1]/img[1]");
	By QuintoProductoLocator = By.xpath(
			"//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[3]/div[2]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/a[1]/div[1]/img[1]");

	By NameProductoLocator = By.xpath("//*[@id=\"productTitle\"]");
	By PrecioLocator = By
			.xpath("//*[@id=\"corePrice_desktop\"]/div/table/tbody/tr/td[2]");
	
	By VolverAtras = By.linkText("Volver a resultados");

	By SeleccionarOrdenLocator = By.xpath("//*[@id=\"a-autoid-0-announce\"]");

	By OrdenMayorMenorLocator = By.xpath("//*[@id=\"s-result-sort-select_2\"]");
	
	By DisponibilidadLocator= By.xpath("//*[@id=\"p_n_availability/2661601011\"]/span/a/span");

	By SacarFiltroLocator = By.xpath("//*[@id=\"p_89/adidas\"]/span/a/span");

	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");

	}

	@Test
	public void Login() throws InterruptedException {

		driver.findElement(BuscadorLocator).sendKeys("zapatillas");
		driver.findElement(BtnBuscarLocator).click();

		driver.findElement(Deshacer).click();
		Thread.sleep(2000);

		// Filtrar por la marca Adidas e Imprimir el nombre y precio de los 5 primeros productos

		Thread.sleep(2000);
		driver.findElement(BtnMarcaLocator).click();

		driver.findElement(PrimerProductoLocator).click();
		System.out.println(driver.findElement(NameProductoLocator).getText());
		System.out.println(driver.findElement(PrecioLocator).getText());

		driver.findElement(VolverAtras).click();

		driver.findElement(SegundoProductoLocator).click();
		System.out.println(driver.findElement(NameProductoLocator).getText());
		System.out.println(driver.findElement(PrecioLocator).getText());

		driver.findElement(VolverAtras).click();

		driver.findElement(TercerProductoLocator).click();
		System.out.println(driver.findElement(NameProductoLocator).getText());
		System.out.println(driver.findElement(PrecioLocator).getText());

		driver.findElement(VolverAtras).click();

		Thread.sleep(2000);
		driver.findElement(CuartoProductoLocator).click();
		System.out.println(driver.findElement(NameProductoLocator).getText());
		System.out.println(driver.findElement(PrecioLocator).getText());
			

		driver.findElement(VolverAtras).click();

		driver.findElement(QuintoProductoLocator).click();
		System.out.println(driver.findElement(NameProductoLocator).getText());
		System.out.println(driver.findElement(PrecioLocator).getText());
				

		driver.findElement(VolverAtras).click();

		// Ordenar por el precio de mayor a menor e Imprimir el nombre y precio de los 5 primeros productos
	

		Thread.sleep(4000);
		driver.findElement(SeleccionarOrdenLocator).click();

		driver.findElement(OrdenMayorMenorLocator).click();

		System.out.println("Orden de Mayor a Menor");
		
		driver.findElement(DisponibilidadLocator).click();

		Thread.sleep(2000);
			
			driver.findElement(PrimerProductoLocator).isDisplayed();
			driver.findElement(PrimerProductoLocator).click();
			System.out.println(driver.findElement(NameProductoLocator).getText());
			System.out.println(driver.findElement(PrecioLocator).getText());
			driver.findElement(VolverAtras).click();
		
			driver.findElement(SegundoProductoLocator).isDisplayed();
			driver.findElement(SegundoProductoLocator).click();
			System.out.println(driver.findElement(NameProductoLocator).getText());
			System.out.println(driver.findElement(PrecioLocator).getText());
			driver.findElement(VolverAtras).click();
			
			driver.findElement(TercerProductoLocator).isDisplayed();
			driver.findElement(TercerProductoLocator).click();
			System.out.println(driver.findElement(NameProductoLocator).getText());
			System.out.println(driver.findElement(PrecioLocator).getText());
			driver.findElement(VolverAtras).click();
			
			driver.findElement(CuartoProductoLocator).isDisplayed();
			driver.findElement(CuartoProductoLocator).click();
			System.out.println(driver.findElement(NameProductoLocator).getText());
			System.out.println(driver.findElement(PrecioLocator).getText());
			driver.findElement(VolverAtras).click();
			
		
			driver.findElement(QuintoProductoLocator).isDisplayed();
			driver.findElement(QuintoProductoLocator).click();
			System.out.println(driver.findElement(NameProductoLocator).getText());
			driver.findElement(VolverAtras).click();
			
			


		// Deshabilitar el filtro por marca y Validar que los 5 primeros productos tengan su nombre y precio

		driver.findElement(SacarFiltroLocator).click();

		Thread.sleep(2000);
		driver.findElement(PrimerProductoLocator).click();
		driver.findElement(NameProductoLocator).isDisplayed();
		driver.findElement(PrecioLocator).isDisplayed();
	

		driver.findElement(VolverAtras).click();

		driver.findElement(SegundoProductoLocator).click();
		driver.findElement(NameProductoLocator).isDisplayed();

		driver.findElement(VolverAtras).click();

		driver.findElement(TercerProductoLocator).click();
		driver.findElement(NameProductoLocator).isDisplayed();
		driver.findElement(PrecioLocator).isDisplayed();
	

		driver.findElement(VolverAtras).click();

		driver.findElement(CuartoProductoLocator).click();
		driver.findElement(NameProductoLocator).isDisplayed();
		driver.findElement(PrecioLocator).isDisplayed();
	

		driver.findElement(VolverAtras).click();

		driver.findElement(QuintoProductoLocator).click();
		driver.findElement(NameProductoLocator).isDisplayed();
		driver.findElement(PrecioLocator).isDisplayed();

		driver.findElement(VolverAtras).click();

	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
