package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.LandingService;
import lippia.web.services.HomeService;
import lippia.web.services.LoginService;

public class LandingSteps extends PageSteps {

    @Given("The client is on tracker page logged with email {string} and password {string}")
    public void theClientIsOnWorkspacePage(String mail, String pass) {
        HomeService.navegarWeb();
        HomeService.clickLogin();
        LoginService.clickLoginManually();
        LoginService.setEmail(mail);
        LoginService.setPassword(pass);
        LoginService.clicLogInButton();
        LandingService.clickTrackerButton();
    }
}