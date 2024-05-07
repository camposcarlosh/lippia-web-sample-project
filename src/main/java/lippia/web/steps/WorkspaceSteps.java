package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginService;
import lippia.web.services.WorkspaceService;


public class WorkspaceSteps extends PageSteps {
    @When("The client click on create new workspace button")
    public void theClientClickOnCreateNewButton() {
        WorkspaceService.clickCreateNewButton();
    }

    @When("The client input workspace name {string}")
    public void theClientInputWorkspaceName(String proy) {
        WorkspaceService.setWorkspaceName(proy);
    }

    @When("The client click on create button")
    public void theClientClickOnCreateButton() {
        WorkspaceService.clickOnCreateButton();
    }

    @Then("The client verify exist the workspace")
    public void theClientVerifyExistTheWorkspace() {
    }
}
