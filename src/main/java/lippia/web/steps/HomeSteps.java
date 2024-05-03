package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import lippia.web.services.HomeService;

public class HomeSteps extends PageSteps {

    @Given("The client is on home page")
    public void theClientIsOnHomePage() {
        HomeService.navegarWeb();
    }
}
