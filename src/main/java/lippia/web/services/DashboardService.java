package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.DashboardConstants;
import lippia.web.constants.LoginConstants;
import org.testng.Assert;

public class DashboardService extends ActionManager {


    public static void TestDash(String prof) {
        WebActionManager.getText(DashboardConstants.PERFIL_BUTTON);
        //Verifico si el elemento CA existe en el dashboard
        boolean ElementoExiste = WebActionManager.getElement(DashboardConstants.PERFIL_BUTTON).isDisplayed();
        Assert.assertTrue(ElementoExiste, "Exisite el perfil de usuario" );
        // Verifico que el nombre del perfil sea CA como figura en el gerkin
        String vGetText = WebActionManager.getElement(DashboardConstants.PERFIL_BUTTON).getText();
        System.out.println("El valor de Elemento existe es ..." + vGetText);
        Assert.assertEquals(vGetText,prof, "El texto No coincide con " + prof);
    }
}
