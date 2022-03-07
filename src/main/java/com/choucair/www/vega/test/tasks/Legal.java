package com.choucair.www.vega.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.choucair.www.vega.test.userinterfaces.HomePage.CLK_LEARN;
import static com.choucair.www.vega.test.userinterfaces.LearnIsEasyPage.CLK_LEGAL;

public class Legal implements Task {


    public static Legal inputInfo() {
        return Tasks.instrumented(Legal.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
//        String nameBusiness = actor.recall("nameBusiness").toString();
        actor.attemptsTo(
                Scroll.to(CLK_LEGAL).andAlignToBottom(),
                Click.on(CLK_LEGAL)
        );
//        actor.remember("MEETINGNAME", meetingData.getNameBussinesUnit());
    }
}
