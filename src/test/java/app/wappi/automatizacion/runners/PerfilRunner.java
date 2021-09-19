package app.wappi.automatizacion.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/", glue="app.wappi.automatizacion.stepdefinitions", snippets = SnippetType.CAMELCASE)
public class PerfilRunner {
}

