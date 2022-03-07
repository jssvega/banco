package com.choucair.www.vega.test.stepdefinitions;

import com.choucair.www.vega.test.enums.MsgError;
import com.choucair.www.vega.test.exeptions.ExceptionError;
import com.choucair.www.vega.test.questions.GetText;
import com.choucair.www.vega.test.tasks.FactaLegal;
import com.choucair.www.vega.test.tasks.Legal;
import com.choucair.www.vega.test.tasks.LoginSerenity;
import com.choucair.www.vega.test.userinterfaces.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.eclipse.jetty.websocket.api.StatusCode;

import java.util.Map;

import static com.choucair.www.vega.test.userinterfaces.ValidatePage.INPUT_MEETING_NAME;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.core.IsEqual.equalTo;

public class PersonasStepDefinition {

    @Before
    public void initialConfig() {
        setTheStage(new OnlineCast());
    }

    @Given("^(.*) goin to de web into banistmo")
    public void goinToDeWebIntoBanistmo(String name) {
        theActorCalled(name).wasAbleTo(Open.browserOn(new HomePage()), LoginSerenity.inputInfo());
    }

    @When("goin to page to download FATCA & CRS")
    public void goinToPageToDownloadFATCACRS(Map<String, String> data) {
        theActorInTheSpotlight().attemptsTo(Legal.inputInfo(), FactaLegal.Business(data));
    }

    @Then("check the status")
    public void checkTheStatus() {

        String meetingName = OnStage.theActorInTheSpotlight().recall("nameBusiness")
                .toString().replace("PJ-", "").replace(" ", "+")
                .replace("ó", "o").concat(".pdf").substring(16);
meetingName="";
        System.out.printf(meetingName);

        theActorInTheSpotlight().should(seeThat(GetText.field(INPUT_MEETING_NAME.of(meetingName)), equalTo(meetingName))
                .orComplainWith(ExceptionError.class, String.format(MsgError.MSG_ERROR_TEXT.getMsg(), meetingName,
                        GetText.field(INPUT_MEETING_NAME.of(meetingName)).answeredBy(theActorInTheSpotlight()))));
    }
}

//PJ+Autocertificacion+unificado-+Fatca+y+CRS
//PJ-Autocertificación unificado- Fatca y CRS