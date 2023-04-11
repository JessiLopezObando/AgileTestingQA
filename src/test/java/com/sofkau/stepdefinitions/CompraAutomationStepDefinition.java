package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

import static com.sofkau.tasks.NavegarALosProductosAutomation.navegarALosProductos;
import static com.sofkau.tasks.RefrescarAutomation.thePage;
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
}
