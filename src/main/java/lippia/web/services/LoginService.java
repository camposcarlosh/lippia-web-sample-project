package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.HomeConstants;
import lippia.web.constants.LoginConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.LoginConstants.LOGIN_MANUALLY_BUTTON;

public class LoginService extends ActionManager {

    public static void clickLoginManually() {
        WebActionManager.click(LoginConstants.LOGIN_MANUALLY_BUTTON);
    }

    public static void setEmail(String mail) {
        WebActionManager.setInput(LoginConstants.EMAIL_INPUT,mail);
    }
    public static void setPassword(String pass) {
        WebActionManager.setInput(LoginConstants.PASSWORD_INPUT,pass);
    }

    public static void clicLogInButton() {
        WebActionManager.click(LoginConstants.LOGIN_BUTTON);
    }
}
