package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.Enter_CodeConstants;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class Enter_CodeService extends ActionManager {

    public static void TestEnter_Code(String mail) {
        WebElement elemento = getElement(Enter_CodeConstants.EMAIL_TILE);
        System.out.println("El valor de EMAIL_TITLE es ... " + elemento.getText());
        Assert.assertEquals(elemento.getText(),mail, "El texto No coincide con " + mail);
        WebElement elemento2 = getElement(Enter_CodeConstants.CODE1_IMPUT);
        Assert.assertTrue(elemento2.isDisplayed(),"El imput para los códigos no existe");
    }

    public static void NavegarWeb() {
        navigateTo(Enter_CodeConstants.VERIFY_PAGE);
    }
}

