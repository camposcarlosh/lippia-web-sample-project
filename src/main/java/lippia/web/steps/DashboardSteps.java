package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.DashboardService;
import lippia.web.services.HomeService;
import lippia.web.services.LoginService;

public class DashboardSteps extends PageSteps {

    @Then("The client verify is in the Dashboard with profile {string}")
    public void theClientVerifyIsInTheDashboard(String prof) {
        DashboardService.TestDash(prof);
    }

    @When("The client click on profile button")
    public void theClientClickOnProfileButton() {
        DashboardService.clickProfileButton();
    }

    @When("The client click on close session button")
    public void theClientClickOnCloseSessionButton() {
        DashboardService.clickLogoutButton();
    }

    @Given("The client is on Dashboard page logged with email {string} and password {string}")
    public void theClientIsOnWorkspacePage(String mail, String pass) {
        HomeService.navegarWeb();
        HomeService.clickLogin();
        LoginService.clickLoginManually();
        LoginService.setEmail(mail);
        LoginService.setPassword(pass);
        LoginService.clicLogInButton();
    }

    @When("The client click on workspace active button {string}")
    public void theClientClickOnWorkspaceActiveButton(String name) {
        DashboardService.clickWorkspaceActiveButton(name);
    }

    @When("The client click on manage button")
    public void theClientClickOnManageButton() {
        DashboardService.clickManageButton();
    }

    @When("The client click on project button")
    public void theClientClickOnProjectButton() {
        DashboardService.clickProjectButton();
    }
}