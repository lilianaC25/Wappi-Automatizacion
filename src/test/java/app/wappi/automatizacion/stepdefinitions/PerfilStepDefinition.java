package app.wappi.automatizacion.stepdefinitions;

import app.wappi.automatizacion.tasks.Ingresar;
import cucumber.api.DataTable;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class PerfilStepDefinition {

    Actor usuario = Actor.named("El usuario");

    @Managed(driver= "chrome")
    WebDriver driver;

    @Before
    public void iniciarNavegador() {
        usuario.can(BrowseTheWeb.with(driver));
        usuario.wasAbleTo(Open.url("https://automation-wappi.vercel.app/login"));
    }


    @Cuando("^se ingresa el usuario y la contrasena$")
    public void seIngresaElUsuarioYLaContrasena(DataTable tabla) {
usuario.attemptsTo(

        Ingresar.usuarioYContrasena(tabla)
);
    }


    @Dado("^que al dar clic en la opcion informacion Personal$")
    public void queAlDarClicEnLaOpcionInformacionPersonal() {

    }

    @Cuando("^se dejan los campos en blanco y se habilita el boton Guardar$")
    public void seDejanLosCamposEnBlancoYSeHabilitaElBotonGuardar() {

    }

    @Entonces("^el sistema muestra un mensaje indicando que el campo es Obligatoria$")
    public void elSistemaMuestraUnMensajeIndicandoQueElCampoEsObligatoria() {

    }

    @Cuando("^se completan todo los campo y se habilita el boton Guardar$")
    public void seCompletanTodoLosCampoYSeHabilitaElBotonGuardar(DataTable arg1) {

    }

    @Entonces("^el sistema muestra un mensaje \"([^\"]*)\"$")
    public void elSistemaMuestraUnMensaje(String arg1) {

    }

    @Cuando("^habilito el boton Guardar$")
    public void habilitoElBotonGuardar() {

    }

    @Entonces("^se valida que los campos esten inicializdos con cualquier valor$")
    public void seValidaQueLosCamposEstenInicializdosConCualquierValor() {

    }


}


