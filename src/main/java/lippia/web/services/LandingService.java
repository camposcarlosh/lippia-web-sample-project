package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LandingConstants;


public class LandingService extends ActionManager {

    public static void clickTrackerButton() {
        WebActionManager.waitPresence(LandingConstants.TRACK_BUTTON);
        WebActionManager.getElement(LandingConstants.TRACK_BUTTON).click();
    }
}
