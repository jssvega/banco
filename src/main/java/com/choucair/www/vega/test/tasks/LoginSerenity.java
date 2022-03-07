package com.choucair.www.vega.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.choucair.www.vega.test.userinterfaces.HomePage.*;

public class LoginSerenity implements Task {

    public static LoginSerenity inputInfo( ) {
        return Tasks.instrumented(LoginSerenity.class );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CLK_LEARN).andAlignToTop(),
                Click.on(CLK_LEARN)
        );
    }
}
