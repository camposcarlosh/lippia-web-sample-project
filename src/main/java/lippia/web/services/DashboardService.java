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

    public static void clickWorkspaceActiveButton() {
        System.out.println("PASO POR ... WorkspaceActiveButton");
        WebActionManager.waitPresence(DashboardConstants.NO_THANKS);
        WebActionManager.getElement(DashboardConstants.NO_THANKS).click();
        System.out.println("PASO POR ... No GRACIAS");
        WebActionManager.getElement(DashboardConstants.ACTIVE_BUTTON).click();
        //WebActionManager.click(DashboardConstants.ACTIVE_BUTTON);

    }

    public static void clickManageButton() {
        WebActionManager.waitPresence(DashboardConstants.MANAGE_BUTTON);
        WebActionManager.getElement(DashboardConstants.MANAGE_BUTTON).click();
        System.out.println("PASO POR ... theClientClickOnManageButton");
        //WebActionManager.click(DashboardConstants.MANAGE_BUTTON);
    }

    public static void clickProjectButton() {
        WebActionManager.waitPresence(DashboardConstants.PROJECT_BUTTON);
        WebActionManager.getElement(DashboardConstants.PROJECT_BUTTON).click();
        //WebActionManager.click(DashboardConstants.PROJECT_BUTTON);
    }

    public static void clickConfigButton() {
        WebActionManager.waitPresence(DashboardConstants.CONFIG_BUTTON);
        WebActionManager.getElement(DashboardConstants.CONFIG_BUTTON).click();
    }

    public static void clickTrackerButton() {
        WebActionManager.waitPresence(DashboardConstants.TRACK_BUTTON);
        WebActionManager.getElement(DashboardConstants.TRACK_BUTTON).click();
    }
}
