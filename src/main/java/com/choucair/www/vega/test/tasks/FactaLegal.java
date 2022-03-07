package com.choucair.www.vega.test.tasks;

import com.choucair.www.vega.test.userinterfaces.LegalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;

import java.util.Map;

public class FactaLegal implements Task {

    private Map<String, String> info;

    public FactaLegal(Map<String, String> data) {
        this.info = data;
    }

    public static FactaLegal Business(Map<String, String> data) {
        return Tasks.instrumented(FactaLegal.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(LegalPage.CLK_FACTA),
                Click.on(LegalPage.CLK_FACTA),
                Scroll.to(LegalPage.DWLD_DOCUMENT.of(info.get("document"))),
                Click.on(LegalPage.DWLD_DOCUMENT.of(info.get("document")))
        );
        actor.attemptsTo(Switch.toWindow(BrowseTheWeb.as(actor).getDriver().getWindowHandles().stream()
                .reduce((first, second) -> second).get()));
        actor.remember("nameBusiness", info.get("document"));

    }
}
