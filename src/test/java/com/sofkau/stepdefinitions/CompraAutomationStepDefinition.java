package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class CompraAutomationStepDefinition extends Configuracion{
    @When("navega hasta los productos y selecciona una marca")
    public void navegaHastaLosProductosYSeleccionaUnaMarca(){
        theActorInTheSpotlight().attemptsTo(
                navegarALosProductos(),
                thePage(),
                navegarALaMarca()
        );
    }
}
