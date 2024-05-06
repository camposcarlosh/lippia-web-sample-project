package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.Enter_CodeService;

public class Enter_CodeSteps extends PageSteps {

    @Then("The client verify is in the Enter Code Page with email {string}")
    public void theClientVerifyIsInTheEnter_Code(String mail) {
        Enter_CodeService.TestEnter_Code(mail);
    }

    @Given("The client is on verify code page with mail {}")
    public void theClientIsOnVerifyCodePageWithMail(String email) {
        Enter_CodeService.NavegarWeb(email);
    }

    @When("The client set the code {}-{}-{}-{}-{}-{} that recived for email")
    public void theClientSetTheCodeThatRecivedForEmail(String cod1, String cod2, String cod3, String cod4, String cod5, String cod6) {
        Enter_CodeService.InputCode(cod1, cod2, cod3, cod4, cod5, cod6);
    }

    @Then("Show error Message: {string}")
    public void showErrorMessage(String mje) {
        Enter_CodeService.VerificoMensaje(mje);
    }
}