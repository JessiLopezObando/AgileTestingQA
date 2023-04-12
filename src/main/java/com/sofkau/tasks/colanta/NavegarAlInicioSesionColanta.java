package com.sofkau.tasks.colanta;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.colanta.PaginaInicioColanta.BOTON_MI_PERFIL;
import static com.sofkau.ui.colanta.PaginaInicioColanta.QUITAR_OPCION;

public class NavegarAlInicioSesionColanta  implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(QUITAR_OPCION),
                Click.on(BOTON_MI_PERFIL)
        );
    }
    public static NavegarAlInicioSesionColanta navegarAlInicioSesionColanta(){
        return new NavegarAlInicioSesionColanta();
    }
}
