package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.CompraAutomation.BOTON_PRODUCTOS;

public class NavegarALosProductos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_PRODUCTOS)
        );
    }
    public static NavegarALosProductos navegarALosProductos(){
        return new NavegarALosProductos();
    }
}
