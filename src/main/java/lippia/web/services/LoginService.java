package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.Enter_CodeConstants;
import lippia.web.constants.LoginConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginService extends ActionManager {

    public static void clickLoginManually() {
        WebActionManager.click(LoginConstants.LOGIN_MANUALLY_BUTTON);
    }

    public static void setEmail(String mail) {
        WebActionManager.setInput(LoginConstants.EMAIL_INPUT,mail);
    }
    public static void setPassword(String pass) {
        WebActionManager.setInput(LoginConstants.PASSWORD_INPUT,pass);
    }

    public static void clicLogInButton() {
        WebActionManager.click(LoginConstants.LOGIN_BUTTON);
    }

    public static void EnableLogInButton() {
        boolean elemento = WebActionManager.isEnabled(LoginConstants.LOGIN_BUTTON);
        Assert.assertTrue(elemento, "El botón no esta habilitado" );
    }

    public static void ShowMessage(Integer caso, String mensaje) {
        String vGetText;
        if (caso == 1 ) {
            vGetText = WebActionManager.getElement(LoginConstants.ERROR_MESSAGE1).getText();
        } else {
            vGetText = WebActionManager.getElement(LoginConstants.ERROR_MESSAGE2).getText();
        }
        System.out.println("El mensaje de error es ... " + vGetText);
        Assert.assertEquals(vGetText,mensaje, "El mensaje No coincide con " + mensaje);
    }

    public static void isInLoginPage() {
        WebActionManager.waitVisibility(LoginConstants.ACCOUNT_TITLE);
        WebElement elemento = getElement(LoginConstants.ACCOUNT_TITLE);
        Assert.assertEquals(elemento.getText(),"Don't have an account?");
        WebElement elemento2 = getElement(LoginConstants.SIGNUP_TITLE);
        Assert.assertEquals(elemento2.getText(),"Sign up");
    }
}
