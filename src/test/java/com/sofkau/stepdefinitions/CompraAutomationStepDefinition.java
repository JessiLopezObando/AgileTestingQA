package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

import static com.sofkau.questions.MensajeCompraAutomation.mensajeCompra;
import static com.sofkau.tasks.automation.FinalizarCompraAutomation.finalizarCompra;
import static com.sofkau.tasks.automation.IngresoTarjetaAutomation.ingresoTarjeta;
import static com.sofkau.tasks.automation.NavegarALaMarcaAutomation.navegarALaMarca;
import static com.sofkau.tasks.automation.NavegarALosProductosAutomation.navegarALosProductos;
import static com.sofkau.tasks.automation.NavegarAlCarritoAutomation.navegarAlCarrito;
import static com.sofkau.tasks.automation.NavegarAlPagoAutomation.navegarAlPago;
import static com.sofkau.tasks.automation.RefrescarAutomation.thePage;
import static com.sofkau.tasks.automation.SeleccionarProductosAutomation.seleccionarProductos;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class CompraAutomationStepDefinition extends Configuracion{
    public static Logger LOGGER = Logger.getLogger(CompraAutomationStepDefinition.class);
    @When("navega hasta los productos y selecciona una marca")
    public void navegaHastaLosProductosYSeleccionaUnaMarca(){
        theActorInTheSpotlight().attemptsTo(
                navegarALosProductos(),
                thePage(),
                navegarALaMarca()
        );
    }
    @When("selecciona tres de ellos")
    public void seleccionaTresDeEllos() {
        theActorInTheSpotlight().attemptsTo(
                seleccionarProductos()
        );
    }
    @When("va al carrito de compras y hace el proceso de checkout")
    public void vaAlCarritoDeComprasYHaceElProcesoDeCheckout() {
        theActorInTheSpotlight().attemptsTo(
                navegarAlCarrito(),
                navegarAlPago(),
                finalizarCompra(),
                ingresoTarjeta().conNombre("Juan Pineda")
                        .conNumeroTarjeta("123456783")
                        .conCvc("311")
                        .conExpiration("09")
                        .yConExpirationAnno("2027")
        );
    }
    @Then("se le indicara al usuario que se hizo su orden")
    public void seLeIndicaAlUsuarioQueSeHizoSuOrden() {
        theActorInTheSpotlight().should(
                seeThat(mensajeCompra(), equalTo("ORDER PLACED!"))
        );
        quitarDriver();
    }
}
