package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.ProjectConstants;
import org.testng.Assert;

public class ProjectService extends ActionManager {

    public static void clickCreateNewButton() {
        WebActionManager.setInput(ProjectConstants.FIND_IMPUT,"lala");
        WebActionManager.waitPresence(ProjectConstants.NEW_BUTTON);
        WebActionManager.getElement(ProjectConstants.NEW_BUTTON).click();
    }

    public static void setProjectName(String proy) {
        WebActionManager.setInput(ProjectConstants.NAME_INPUT,proy);
    }

    public static void clickOnCreateProjectButton() {
        WebActionManager.click(ProjectConstants.CREATE_BUTTON);
    }
}
