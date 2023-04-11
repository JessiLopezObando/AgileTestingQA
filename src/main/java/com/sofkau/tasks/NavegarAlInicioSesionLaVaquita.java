package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.PaginaInicioLaVaquita.BOTON_REGISTRO;

public class NavegarAlInicioSesionLaVaquita implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_REGISTRO)
        );
    }
        public static NavegarAlInicioSesionLaVaquita navegarAlInicioSesionLaVaquita(){
            return new NavegarAlInicioSesionLaVaquita();
    }

}
