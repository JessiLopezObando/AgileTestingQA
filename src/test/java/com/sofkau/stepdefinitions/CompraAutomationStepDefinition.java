package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

import static com.sofkau.tasks.automation.NavegarALaMarcaAutomation.navegarALaMarca;
import static com.sofkau.tasks.automation.NavegarALosProductosAutomation.navegarALosProductos;
import static com.sofkau.tasks.automation.RefrescarAutomation.thePage;
import static com.sofkau.tasks.automation.SeleccionarProductosAutomation.seleccionarProductos;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
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
}
