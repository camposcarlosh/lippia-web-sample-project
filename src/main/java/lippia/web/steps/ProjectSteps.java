package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.ProjectService;
import lippia.web.services.WorkspaceService;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class ProjectSteps extends PageSteps {
    public String project;
    @When("The client click on create new project button")
    public void theClientClickOnCreateNewButton() {
        ProjectService.clickCreateNewButton();
    }
    @When("The client input project name with day and hour")
    public void theClientInputProjectName() {
        project = ProjectService.setProjectName();
    }

    @When("The client click on create project button")
    public void theClientClickOnCreateProjectButton() {
        ProjectService.clickOnCreateProjectButton();
    }
    @Then("The client verify exist the project")
    public void theClientVerifyExistTheProject() {
        ProjectService.testCreatedPY(project);
    }
}
