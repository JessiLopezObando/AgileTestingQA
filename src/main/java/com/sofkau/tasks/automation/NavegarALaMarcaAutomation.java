package com.sofkau.tasks.automation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.automation.CompraAutomation.BOTON_MARCA;
public class NavegarALaMarcaAutomation implements Task{
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_MARCA)
        );
    }
    public static NavegarALaMarcaAutomation navegarALaMarca(){
        return new NavegarALaMarcaAutomation();
    }
}
