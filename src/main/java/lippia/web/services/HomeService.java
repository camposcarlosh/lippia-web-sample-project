package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.HomeConstants;
import org.openqa.selenium.WebElement;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class HomeService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    //public static void enterSearchCriteria(String text) {
    //    setInput(HomeConstants.INPUT_SEARCH_XPATH, text);
    //}

    //public static void clickSearchButton() {
    //    click(HomeConstants.SEARCH_BUTTON_NAME);
    //}

    public static void clickLogin() {
        WebActionManager.click(HomeConstants.LOGIN_BUTTON);
        //Con estas funciones puedo guardar el elemento en una variable y reutilizarlo con distintos métodos que necesite.
        //WebElement  elements = getElement(HomeConstants.LOGIN_BUTTON);
        //elements.click();

    }
}
