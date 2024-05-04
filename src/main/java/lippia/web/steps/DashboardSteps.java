package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.DashboardService;

public class DashboardSteps extends PageSteps {

    @Then("The client verify is in the Dashboard with profile {string}")
    public void theClientVerifyIsInTheDashboard(String prof) {
        DashboardService.TestDash(prof);
    }
}