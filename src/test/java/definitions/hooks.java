package definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class hooks {
    private static String navegador="chrome";
    public static WebDriver driver;

    @Before
    public static void setUp(){

        if(navegador.equals("chrome")){

            System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            ChromeOptions options=new ChromeOptions();
            Map<String, Object> prefs=new HashMap<String,Object>();
            options.addArguments("--disable-notifications");
            prefs.put("permissions.default_content_setting_values.notifications", 1);
//1-Allow, 2-Block, 0-default
            options.setExperimentalOption("prefs",prefs);
            //ChromeDriver driver=new ChromeDriver(options);
        }else if (navegador.equals("firefox")){
            System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }
    }
    @After
    public static void tearDown(){
        //driver.manage().deleteAllCookies();
        driver.close();
    }

}
