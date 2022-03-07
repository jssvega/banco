package com.choucair.www.vega.test.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class LegalPage {

    public static final Target CLK_FACTA = Target.the("click to show me legal on FACTA").locatedBy("(//a[@class='center-block btn btn-primary'])[2]");
    public static final Target DWLD_DOCUMENT = Target.the("click to show me legal on FACTA").locatedBy("(//td[@data-th='Documento']//*[contains(text(),'{0}')]//parent::span//parent::td /following-sibling::td//*[contains(@title,' - Fatca y CRS')])[1]");
}
