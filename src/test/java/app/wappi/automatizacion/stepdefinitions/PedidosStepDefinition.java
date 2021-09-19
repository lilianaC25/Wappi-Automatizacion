package app.wappi.automatizacion.stepdefinitions;

import app.wappi.automatizacion.questions.CampoObligatorio;
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

public class PedidosStepDefinition {

    Actor usuario = Actor.named("El usuario");

    @Managed(driver= "chrome")
    WebDriver driver;



    @Dado("^que se ingresa a Wappi$")
    public void queSeIngresaAWappi() {
        usuario.can(BrowseTheWeb.with(driver));
        usuario.wasAbleTo(Open.url("https://automation-wappi.vercel.app/home"));
    }


    @Entonces("^Se valida el ingreso a la pagina \"([^\"]*)\"$")
    public void seValidaElIngresoALaPagina(String inicio) {
usuario.should(seeThat(CampoObligatorio.validarCampo(),Matchers.is(inicio)));
    }
    @Dado("^Que al seleccionar una Oferta y dar clic en la opcion Pedir$")
    public void queAlSeleccionarUnaOfertaYDarClicEnLaOpcionPedir() {

    }

    @Cuando("^Damos clir en la opcion Confirmar Pedido$")
    public void damosClirEnLaOpcionConfirmarPedido() {

    }

    @Entonces("^El sistema muestra el mensaje \"([^\"]*)\"$")
    public void elSistemaMuestraElMensaje(String arg1) {

    }

    @Dado("^Que se obtiene un cupon$")
    public void queSeObtieneUnCupon() {

    }

    @Cuando("^Que se realiza un pedido$")
    public void queSeRealizaUnPedido() {

    }

    @Cuando("^se aplica un cupon$")
    public void seAplicaUnCupon() {

    }

    @Entonces("^El sistema muestra el pedido con los mismos datos del pedido realizado y muestra \"([^\"]*)\" en la opcion Uso cupon$")
    public void elSistemaMuestraElPedidoConLosMismosDatosDelPedidoRealizadoYMuestraEnLaOpcionUsoCupon(String arg1) {


    }

    @Cuando("^Se confirma el Pedido$")
    public void seConfirmaElPedido() {

    }

    @Entonces("^El sistema muestra el pedido con los mismos datos del pedido realizado y muestra \"([^\"]*)\" en la opcion Uso$")
    public void elSistemaMuestraElPedidoConLosMismosDatosDelPedidoRealizadoYMuestraEnLaOpcionUso(String arg1) {

    }

    @Cuando("^se aplica un cupon invalido$")
    public void seAplicaUnCuponInvalido() {

    }

    @Cuando("^se realizan mas de dos pedidos con el mismo Cupon$")
    public void seRealizanMasDeDosPedidosConElMismoCupon() {

    }

    @Cuando("^Se da clic en la opcion Mis pedidos$")
    public void seDaClicEnLaOpcionMisPedidos() {

    }

    @Entonces("^El sistema muestar la misma informacion de la Oferta$")
    public void elSistemaMuestarLaMismaInformacionDeLaOferta() {

    }


}
