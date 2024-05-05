package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Then;
import lippia.web.services.Enter_CodeService;

public class Enter_CodeSteps extends PageSteps {

    @Then("The client verify is in the Enter Code Page with email {string}")
    public void theClientVerifyIsInTheEnter_Code(String mail) {
        Enter_CodeService.TestEnter_Code(mail);
    }
}