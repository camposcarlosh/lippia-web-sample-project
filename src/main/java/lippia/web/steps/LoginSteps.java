package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.HomeService;

public class LoginSteps extends PageSteps {

    @When("The client click on log in button on landing page")
    public void theClientClickOnLogInButtonOnLandingPage() {
        HomeService.clickLogin();
    }

    @When("The client click on log in Manually button")
    public void theClientClickOnLogInManuallyButton() {
        
    }

    @When("The client set the email {string}")
    public void theClientSetTheEmail(String arg0) {
        
    }

    @When("The client set the password {string}")
    public void theClientSetThePassword(String arg0) {
        
    }

    @When("The client click on log in button")
    public void theClientClickOnLogInButton() {
    }
}
