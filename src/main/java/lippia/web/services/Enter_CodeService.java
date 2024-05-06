package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.Enter_CodeConstants;
import lippia.web.constants.LoginConstants;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class Enter_CodeService extends ActionManager {

    public static void TestEnter_Code(String mail) {
        //WebActionManager.setInput(Enter_CodeConstants.CODE1_IMPUT,"0");
        WebActionManager.waitPresences(Enter_CodeConstants.CODE1_IMPUT);
        WebElement elemento = getElement(Enter_CodeConstants.EMAIL_TILE);
        System.out.println("El valor de EMAIL_TITLE es ... " + elemento.getText());
        Assert.assertEquals(elemento.getText(),mail, "El texto No coincide con " + mail);
        WebElement elemento2 = getElement(Enter_CodeConstants.CODE1_IMPUT);
        Assert.assertTrue(elemento2.isDisplayed(),"El imput para los códigos no existe");
    }

    public static void NavegarWeb(String email) {
        String url = Enter_CodeConstants.VERIFY_PAGE + email;
        navigateTo(url);
    }

    public static void InputCode(String cod1, String cod2, String cod3, String cod4, String cod5, String cod6) {
        WebActionManager.waitPresences(Enter_CodeConstants.CODE1_IMPUT);
        WebActionManager.setInput(Enter_CodeConstants.CODE1_IMPUT,cod1);
        WebActionManager.waitPresences(Enter_CodeConstants.CODE2_IMPUT);
        WebActionManager.setInput(Enter_CodeConstants.CODE2_IMPUT,cod2);
        WebActionManager.waitPresences(Enter_CodeConstants.CODE3_IMPUT);
        WebActionManager.setInput(Enter_CodeConstants.CODE3_IMPUT,cod3);
        WebActionManager.waitPresences(Enter_CodeConstants.CODE4_IMPUT);
        WebActionManager.setInput(Enter_CodeConstants.CODE4_IMPUT,cod4);
        WebActionManager.waitPresences(Enter_CodeConstants.CODE5_IMPUT);
        WebActionManager.setInput(Enter_CodeConstants.CODE5_IMPUT,cod5);
        WebActionManager.waitPresences(Enter_CodeConstants.CODE6_IMPUT);
        WebActionManager.setInput(Enter_CodeConstants.CODE6_IMPUT,cod6);

    }

    public static void VerificoMensaje(String mje) {
        WebActionManager.waitPresences(Enter_CodeConstants.ERRORCODE_MESAGE);
        WebElement elemento = getElement(Enter_CodeConstants.ERRORCODE_MESAGE);
        System.out.println("El valor de EMAIL_TITLE es ... " + elemento.getText());
        Assert.assertEquals(elemento.getText(),mje, "El texto No coincide con " + mje);
    }
}

