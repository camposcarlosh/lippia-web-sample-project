package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.WorkspaceService;

public class WorkspaceSteps extends PageSteps {
    public String workspace;
    @When("The client click on create new workspace button")
    public void theClientClickOnCreateNewButton() {
        WorkspaceService.clickCreateNewButton();
    }

    @When("The client input workspace name with day and hour")
    public void theClientInputWorkspaceName() {
        workspace = WorkspaceService.setWorkspaceName();
    }

    @When("The client click on create button")
    public void theClientClickOnCreateButton() {
        WorkspaceService.clickOnCreateButton();
    }

    @Then("The client verify exist the workspace")
    public void theClientVerifyExistTheWorkspace() {
        WorkspaceService.testCreatedWS(workspace);

    }

    @When("The app refresh the page")
    public void theAppRefreshThePage() {
        WorkspaceService.refreshPage();
    }
}
