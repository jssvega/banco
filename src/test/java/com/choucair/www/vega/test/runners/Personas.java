package com.choucair.www.vega.test.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = { "com.choucair.www.vega.test.stepdefinitions", "com.choucair.www.vega.test.hooks" },
        features = "src/test/resources/com/choucair/www/vega/test/features/personas.feature",

        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Personas {
}
