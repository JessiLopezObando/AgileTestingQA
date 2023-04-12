package com.sofkau.tasks.latam;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.latam.PaginaInicioLatam.BOTON_INICIO_SESION_LATAM;

public class NavegarInicioLatam implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_INICIO_SESION_LATAM)
        );
    }

    public static NavegarInicioLatam navegarInicioLatam() {
        return new NavegarInicioLatam();
    }
}
