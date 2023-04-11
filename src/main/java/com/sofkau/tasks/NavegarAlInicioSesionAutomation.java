package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.PaginaInicioAutomation.BOTON_REGISTRO;

public class NavegarAlInicioSesionAutomation implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_REGISTRO)
        );
    }
        public static NavegarAlInicioSesionAutomation navegarAlRegistro(){
            return new NavegarAlInicioSesionAutomation();
    }

}
