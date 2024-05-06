package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.DashboardConstants;
import org.testng.Assert;

public class DashboardService extends ActionManager {


    public static void TestDash(String prof) {
        WebActionManager.getText(DashboardConstants.PROFILE_BUTTON);
        //Verifico si el elemento CA existe en el dashboard
        boolean ElementoExiste = WebActionManager.getElement(DashboardConstants.PROFILE_BUTTON).isDisplayed();
        Assert.assertTrue(ElementoExiste, "Exisite el perfil de usuario" );
        // Verifico que el nombre del perfil sea CA como figura en el gerkin
        String vGetText = WebActionManager.getElement(DashboardConstants.PROFILE_BUTTON).getText();
        System.out.println("El valor de Elemento existe es ..." + vGetText);
        Assert.assertEquals(vGetText,prof, "El texto No coincide con " + prof);
    }

    public static void clickProfileButton() {
        WebActionManager.click(DashboardConstants.PROFILE_BUTTON);
    }

    public static void clickLogoutButton() {
        WebActionManager.click(DashboardConstants.LOGOUT_BUTTON);
    }
}
