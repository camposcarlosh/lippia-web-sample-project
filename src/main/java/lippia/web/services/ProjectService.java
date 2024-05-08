package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.ProjectConstants;
import lippia.web.constants.WorkspaceConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProjectService extends ActionManager {

    public static void clickCreateNewButton() {
        WebActionManager.setInput(ProjectConstants.FIND_IMPUT,"lala");
        WebActionManager.waitPresence(ProjectConstants.NEW_BUTTON);
        WebActionManager.getElement(ProjectConstants.NEW_BUTTON).click();
    }

    public static String setProjectName() {
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        // Formatear la fecha y hora
        String projectName = "PY_" + fechaHoraActual.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        WebActionManager.waitPresence(ProjectConstants.NAME_INPUT);
        WebActionManager.getElement(ProjectConstants.NAME_INPUT).click();
        WebActionManager.setInput(ProjectConstants.NAME_INPUT,projectName);
        System.out.println("PASO POR ... setWorkspaceName = " + projectName);
        return projectName;
    }

    public static void clickOnCreateProjectButton() {
        WebActionManager.click(ProjectConstants.CREATE_BUTTON);
    }

    public static void testCreatedPY(String project) {
        String PYNAME_TEXT = "xpath://span[contains( text(),'" + project + "')]";
        WebActionManager.waitPresence(PYNAME_TEXT);
        WebElement elemento = getElement(PYNAME_TEXT);
        String textoGrilla;
        textoGrilla = elemento.getText();
        boolean encuentra = false;
        if (textoGrilla.contains(project)) {
            encuentra = true;
        }
        //  boolean encuentra = textoGrilla.contains(workspace);
        Assert.assertTrue(encuentra, "El workspace credo no existe");
    }
}
