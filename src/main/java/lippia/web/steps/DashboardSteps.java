package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.DashboardService;
import lippia.web.services.HomeService;
import lippia.web.services.LoginService;

public class DashboardSteps extends PageSteps {

    @Given("The client is on Dashboard page logged with email {string} and password {string}")
    public void theClientIsOnWorkspacePage(String mail, String pass) {
        HomeService.navegarWeb();
        HomeService.clickLogin();
        LoginService.clickLoginManually();
        LoginService.setEmail(mail);
        LoginService.setPassword(pass);
        LoginService.clicLogInButton();
    }

    @When("The client click on tracker button")
    public void theClientClickOnTrackerButton() {
        DashboardService.clickTrackerButton();
    }
}