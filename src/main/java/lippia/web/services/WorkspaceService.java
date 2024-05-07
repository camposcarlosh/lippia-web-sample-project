package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.DashboardConstants;
import lippia.web.constants.WorkspaceConstants;
import org.openqa.selenium.By;
import org.testng.Assert;

public class WorkspaceService extends ActionManager {

    public static void clickCreateNewButton() {
        System.out.println("PASO POR ... clickCreateNewButton");
        WebActionManager.waitPresence(WorkspaceConstants.CREATENEW_BUTTON);
        WebActionManager.waitClickable(WorkspaceConstants.CREATENEW_BUTTON);
        WebActionManager.click(WorkspaceConstants.CREATENEW_BUTTON);
        String vGetText = WebActionManager.getElement(WorkspaceConstants.WSNAME_TEXT).getText();
        System.out.println("El valor de Elemento existe es ..." + vGetText);
        Assert.assertEquals(vGetText,"CarlosWS", "El texto No coincide con " + "CarlosWS");
        //
        System.out.println("PASO POR ... clickCreateNewButton2");
    }

    public static void setWorkspaceName(String proy) {
        System.out.println("PASO POR ... setWorkspaceName");
        WebActionManager.setInput(WorkspaceConstants.WORKSPACE_INPUT,proy);
    }

    public static void clickOnCreateButton() {
        WebActionManager.click(WorkspaceConstants.CREATE_BUTTON);
    }
}
