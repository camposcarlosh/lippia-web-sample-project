package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.ProjectService;


public class ProjectSteps extends PageSteps {
    @When("The client click on create new project button")
    public void theClientClickOnCreateNewButton() {
        ProjectService.clickCreateNewButton();
    }
    @When("The client input project name {string}")
    public void theClientInputProjectName(String proy) {
        ProjectService.setProjectName(proy);
    }

    @When("The client click on create project button")
    public void theClientClickOnCreateProjectButton() {
        ProjectService.clickOnCreateProjectButton();
    }
}
