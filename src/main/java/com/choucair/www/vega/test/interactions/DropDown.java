package com.choucair.www.vega.test.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;


public class DropDown implements Interaction {

    private Target element;
    private Target fields;

    public DropDown(Target element, Target fields) {
        this.element = element;
        this.fields = fields;
    }

    public static DropDown toElement(Target element, Target fields) {
        return Tasks.instrumented(DropDown.class, element, fields);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(element),
                Click.on(fields)
        );
    }
}
