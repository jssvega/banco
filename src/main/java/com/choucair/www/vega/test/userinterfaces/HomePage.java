package com.choucair.www.vega.test.userinterfaces;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/personas/")
public class HomePage extends PageObject {
    public static final Target CLK_LEARN =Target.the("click to go to learn is easy").locatedBy("//a[contains(text(),'Aprender es ')]");
}
