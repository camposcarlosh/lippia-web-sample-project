package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.DashboardConstants;


public class DashboardService extends ActionManager {

    public static void clickTrackerButton() {
        WebActionManager.waitPresence(DashboardConstants.TRACK_BUTTON);
        WebActionManager.getElement(DashboardConstants.TRACK_BUTTON).click();
    }
}
