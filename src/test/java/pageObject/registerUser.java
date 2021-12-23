package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class registerUser extends util {

    @FindBy(xpath = "//input[@id='email']") private WebElement tbxemail;
    @FindBy(xpath = "//input[@id='password']") private WebElement txbpassword;
    @FindBy(xpath = "//label[contains(text(),'SAVED')]") private WebElement lblConfirmacion;
    @FindBy(xpath = "//label[contains(text(),'INVALID')]") private WebElement lblinvalido;
    @FindBy(xpath = "//label[contains(text(),'REQUIRED')]") private WebElement lblNoNull;
    @FindBy(xpath = "//button[@id='register']") private WebElement btnRegister;
    @FindBy(xpath = "//h1[contains(text(),'Registro')]") private WebElement lblRegister ;



    public registerUser(WebDriver driver){

        PageFactory.initElements(driver,this);

    }

    public void writingUser(String user,String password){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wait.until(ExpectedConditions.visibilityOf(lblRegister));

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
    public void clickBtnRegister(){

        btnRegister.click();
    }
    public void validateRegister(){

       if (lblConfirmacion.isDisplayed()){
            System.out.println("Se realizo registro correctamente");
        }else {

               System.out.println("Error..! Inesperado");
       }

    }
    public void validateRegisterInvalid(){


            if (lblinvalido.isDisplayed()) {
                System.out.println("Error..! Datos incorrectos");
            }else {

                System.out.println("Error..! Inesperado");
                }
            }
    public void validateRegisterNull(){


                if (lblNoNull.isDisplayed()) {
                    System.out.println("Error..! Datos requeridos");
                }else{
                    System.out.println("Error..! Inesperado");
                }


    }

}
