package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.WorkspaceConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class WorkspaceService extends ActionManager {

    public static void clickCreateNewButton() {
        WebActionManager.waitPresence(WorkspaceConstants.CREATENEW_BUTTON);
        WebActionManager.waitClickable(WorkspaceConstants.CREATENEW_BUTTON);
        WebActionManager.getElement(WorkspaceConstants.CREATENEW_BUTTON).click();
        System.out.println("PASO POR ... clickCreateNewButton");
    }

    public static String setWorkspaceName() {
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        // Formatear la fecha y hora
        String workspaceName = "WS_" + fechaHoraActual.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        WebActionManager.waitPresence(WorkspaceConstants.WORKSPACE_INPUT);
        WebActionManager.getElement(WorkspaceConstants.WORKSPACE_INPUT).click();
        WebActionManager.setInput(WorkspaceConstants.WORKSPACE_INPUT,workspaceName);
        System.out.println("PASO POR ... setWorkspaceName = " + workspaceName);
        return workspaceName;
    }

    public static void clickOnCreateButton() {
        WebActionManager.click(WorkspaceConstants.CREATE_BUTTON);
    }

    public static void testCreatedWS(String workspace) {
        String WSNAME_TEXT = "xpath://span[contains( text(),'" + workspace + "')]";
        WebActionManager.waitPresence(WSNAME_TEXT);
        WebElement elemento = getElement(WSNAME_TEXT);
        String textoGrilla;
        textoGrilla = elemento.getText();
        boolean encuentra = false;
        if (textoGrilla.contains(workspace)) {
            encuentra = true;
        }
      //  boolean encuentra = textoGrilla.contains(workspace);
        Assert.assertTrue(encuentra, "El workspace credo no existe");
    }

    public static void refreshPage() {
        String url = WorkspaceConstants.WS_PAGE;
        navigateTo(url);
    }

    public static void setWsName(String workspace) {
        WebActionManager.setInput(WorkspaceConstants.WORKSPACE_INPUT,workspace);
    }
}
