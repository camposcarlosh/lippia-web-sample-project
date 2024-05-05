package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.Enter_CodeConstants;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Enter_CodeService extends ActionManager {

    public static void TestEnter_Code(String mail) {
        WebElement elemento = getElement(Enter_CodeConstants.CODE1_IMPUT);
        Assert.assertTrue(elemento.isDisplayed(),"El imput para los códigos no existe");
    }
}




//        //System.out.println("El valor de EMAIL_TITLE es ... " + Texto);
//       // Assert.assertEquals(vGetText,mail, "El texto No coincide con " + mail);
