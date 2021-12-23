package support;

import definitions.hooks;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class util  extends hooks{

    public static WebDriverWait wait;

    public util() {
        wait = new WebDriverWait(driver,40);
    }

    public void ventanaActiva(){
        Set<String> identificadores = hooks.driver.getWindowHandles();
        for (String identificador:identificadores) {
            hooks.driver.switchTo().window(identificador);
        }
    }
    public void ventanaInicial(){
        hooks.driver.close();
        hooks.driver.switchTo().window("");
    }
}
