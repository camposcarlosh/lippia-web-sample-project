package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.TrackerService;

public class TrackerSteps extends PageSteps {
    public String timeEntry;
    @When("The client input Time-Entry-Desciption name with day and hour")
    public void theClientInputTimeEntryDesciption() {
        timeEntry = TrackerService.setTimeEntryDescription();
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
    @Then("The client verify exist time entry")
    public void theClientVerifyExistTimeEntry() {
        TrackerService.testCreatedTimeEntry(timeEntry);
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
}
