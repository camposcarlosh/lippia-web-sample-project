package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.HomeService;
import lippia.web.services.LoginService;

public class LoginSteps extends PageSteps {

    @When("The client click on log in button on landing page")
    public void theClientClickOnLogInButtonOnLandingPage() {
        HomeService.clickLogin();
    }

    @When("The client click on log in Manually button")
    public void theClientClickOnLogInManuallyButton() {
        LoginService.clickLoginManually();
    }

    @When("The client set the email {string}")
    public void theClientSetTheEmail(String mail) {
        LoginService.setEmail(mail);
    }

    @When("The client set the password {string}")
    public void theClientSetThePassword(String pass) {
        LoginService.setPassword(pass);
    }

    @When("The client click on log in button")
    public void theClientClickOnLogInButton() {
        LoginService.clicLogInButton();
    }

    @Then("the 'Iniciar Sesión' button is enabled")
    public void theLogInButtonisEnabled() {
        LoginService.EnableLogInButton();
    }

    @When("Set the email (.*)$")
    public void setTheEmail(String mail) {
        LoginService.setEmail(mail);
    }

    @When("Set the password (.*)$")
    public void setThePassword(String pass) {
        LoginService.setPassword(pass);
    }

    @Then("Show error Message {} : {}")
    public void ShowMessage(Integer caso, String mensaje) {
        LoginService.ShowMessage(caso, mensaje);
    }

    @Then("The client verify is in the login page")
    public void theClientVerifyIsInTheLoginPage() {
        LoginService.isInLoginPage();
    }
}

