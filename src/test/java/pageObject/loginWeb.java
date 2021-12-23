package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class loginWeb extends util {


    @FindBy(xpath = "//input[@id='email']") private WebElement tbxemail;
    @FindBy(xpath = "//input[@id='password']") private WebElement txbpassword;
    @FindBy(xpath = "//label[contains(text(),'LOGIN VALID')]") private WebElement lblConfirmacion;
    @FindBy(xpath = "//label[contains(text(),'REQUIRED')]") private WebElement lblNoNull;
    @FindBy(xpath = "//button[@id='login']") private WebElement btnLogin;
    @FindBy(xpath = "//h1[contains(text(),'Login')]") private WebElement lblLogin;




    public loginWeb(WebDriver driver){

        PageFactory.initElements(driver,this);

    }
    public void setUser(String user,String password){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOf(lblLogin));
        if(user.contains("@") && user.length()>=5)
        {
            tbxemail.sendKeys(user);
        }
        else
        {
            tbxemail.sendKeys(user);
            System.out.println("Error...! Email debe tener como minimo 5 caracteres y @");
        }
        ;
        if (password.length()>=5){
            txbpassword.sendKeys(password);
        }else{
            txbpassword.sendKeys(password);
            System.out.println("Error...! Contraseña debe tener como minimo 5 caracteres");
        }



    }
    public void clickBtnLogin(){

        btnLogin.click();
    }
    public void validateLogin(){
        if (lblConfirmacion.isDisplayed()){
            System.out.println("Se realizo registro correctamente");
        }else {
            if (lblNoNull.isDisplayed()) {
                System.out.println("Error..! Datos requeridos");
            }
        }
    }
    public void validateLoginInvalid(){

            if (lblNoNull.isDisplayed()) {
                System.out.println("Error..! Datos requeridos");
            }else {
                System.out.println("Error..! Inesperado");
            }
        }


}

