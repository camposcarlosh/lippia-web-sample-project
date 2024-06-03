package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.MainService;
import lippia.web.services.TrackerService;

public class TrackerSteps extends PageSteps {
    public String description;
    public String descProject;
    public String descTag;
    @When("The client input {} Time-Entry-Desciption name with day and hour")
    public void theClientInputTimeEntryDesciption(String tipo) {
        description = MainService.getDescription(tipo);
        TrackerService.setTimeEntryDescription(description);
    }

    @When("The client click on Temporizador option")
    public void theClientClickOnTempOption() {
        TrackerService.clickOnTempOption();
    }

    @When("The client click on Manual option")
    public void theClientClickOnManualOption() {
        TrackerService.clickOnManualOption();
    }

    @When("The client input Time-Init {} Time-Out {} Day {}")
    public void theClientInputTimeInitTimeOutDay(String timeIn, String timeOut, String day) {
        TrackerService.setTimeEntry(timeIn, timeOut, day);
    }

    @When("The client click on init button")
    public void theClientClickOnInitButton() {
        TrackerService.clickOnInitButton();
    }

    @When("The client click on stop button")
    public void theClientClickOnStopButton() {
        TrackerService.clickOnStopButton();
    }
    @Then("The client verify {} exist time entry")
    public void theClientVerifyExistTimeEntry(String SiNo) {
        TrackerService.testCreatedTimeEntry(SiNo, description);
    }

    @When("The client click on manage time entry button")
    public void theClientClickOnManageButton() {
        TrackerService.clickManageButton();
    }
    @When("The client click on Discard option")
    public void theClientClickOnDiscardOption() {
        TrackerService.clickDiscardOption();
    }
    @When("The client click on Discard button")
    public void theClientClickOnDiscardButton() {
        TrackerService.clickDiscardButton();
    }

    @Given("The client add a new tracker entry")
    public void theClientAddANewTrackerEntry() {
        TrackerService.clickOnTempOption();
        description = MainService.getDescription("new");
        TrackerService.setTimeEntryDescription(description);
        TrackerService.clickOnInitButton();
        TrackerService.clickOnStopButton();
    }

    @When("The client update Time-Entry-Desciption name")
    public void theClientUpdateDesciptionName() {
        description = MainService.getDescription("update");
        TrackerService.updateTimeEntryDescription(description);
    }

    @When("The client update input Time-Init = {} Time-Out = {}")
    public void theClientInputNewTimeInitTimeOut$(String timeIn, String timeOut) {
        TrackerService.updateDataEntry(timeIn, timeOut);
    }

    @When("The client select the project option, enter a new project and associate")
    public void theClientSelectTheProjectOptionEnterANewProjectAndAssociate() {
        TrackerService.clickOnProjectOption();
        descProject = MainService.getDescription("project");
        TrackerService.setNewProject(descProject);
        TrackerService.clickOnAsociateProject();
    }

    @When("The client select the tag option, enter a new tag and associate")
    public void theClientSelectTheTagOptionEnterANewTagAndAssociate() {
        TrackerService.clickOnTagOption();
        descTag = MainService.getDescription("tag");
        TrackerService.setNewTag(descTag);
        TrackerService.clickOnAsociateTag();
    }

    @When("The client update billable")
    public void theClientUpdateBillable() {
        TrackerService.setBillable();
    }
}
