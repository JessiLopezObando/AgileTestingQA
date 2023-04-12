package com.sofkau.tasks.automation;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.automation.CompraAutomation.BOTON_PAGO;

public class NavegarAlPagoAutomation implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_PAGO)
        );
    }
    public static NavegarAlPagoAutomation navegarAlPago(){
        return new NavegarAlPagoAutomation();
    }
}