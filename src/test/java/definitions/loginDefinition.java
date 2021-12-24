package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.loginWeb;
import pageObject.registerUser;

import java.io.IOException;

import static support.screenshots.evidencias;

public class loginDefinition {
    registerUser register;
     loginWeb login;


    public loginDefinition() {
      
        login = new loginWeb(hooks.driver);
        register = new registerUser(hooks.driver);
    }

    @Given("Validar que la web este operativa")
    public void validarQueLaWebEsteOperativa() throws IOException {
        hooks.driver.get("http://localhost:4000/login");
        evidencias();
    }

    @When("Ingresa las credenciales {string} y {string}")
    public void ingresaLasCredencialesY(String user, String password) throws IOException {
        login.setUser(user,password);
        evidencias();
        login.clickBtnLogin();
    }


    @When("Ingresa las credenciales para registro {string} y {string}")
    public void ingresaLasCredencialesParaRegistroY(String user, String password) throws IOException {
        register.writingUser(user, password);
        evidencias();
        register.clickBtnRegister();
    }

    @Then("mostrar registro guardado")
    public void mostrarRegistroGuardado() throws IOException {
        register.validateRegister();
        evidencias();
    }

    @Then("mostrar logueo exitoso")
    public void mostrarLogueoExitoso() throws IOException {
        login.validateLogin();
        evidencias();
    }

    @Given("Validar que la web de registro este operativa")
    public void validarQueLaWebDeRegistroEsteOperativa() throws IOException {
        hooks.driver.get("http://localhost:4000/register");
        evidencias();
    }

    @Then("mostrar validacion de datos")
    public void mostrarValidacionDeDatos() throws IOException {
        register.validateRegisterInvalid();
        evidencias();
    }

    @Then("mostrar logueo fallido")
    public void mostrarLogueoFallido() throws IOException {
        login.validateLoginInvalid();
        evidencias();
    }

    @Then("mostrar mensaje logueo fallido")
    public void mostrarMensajeLogueoFallido() throws IOException {
        login.validateLoginInvalid();
        evidencias();
    }

    @Then("mostrar mensaje de registro fallido")
    public void mostrarMensajeDeRegistroFallido() throws IOException {
        register.validateRegisterNull();
        evidencias();
    }
}
