package co.com.prueba.key.stepdefinitions;


import co.com.prueba.key.models.Credentials;
import co.com.prueba.key.tasks.Login;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class PruebaLlavesStepDefinitions {

    @Managed
    WebDriver hisDriver;

    @Before
    public void setIni(){

    }
    @Given("^that enter the page \"([^\"]*)\"$")
    public void that_enter_the_page(String url) {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Andrés");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisDriver));
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }

    @When("^enter valid credentials$")
    public void enter_valid_credentials(List<Credentials> credentialsList) {
        Credentials credentials;
        credentials = credentialsList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Login.inThePage(credentials));
    }

    @Then("^the user will be logged in correctly$")
    public void the_user_will_be_logged_in_correctly() {

    }


}
