package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.PaginaInicioSesionExito.BOTON_CUENTA;
import static com.sofkau.ui.PaginaInicioSesionExito.INGRESAR_CON_EMAIL_Y_CONTRASENIA;

public class NavegarAlInicioSesionExito implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_CUENTA),
                Click.on(INGRESAR_CON_EMAIL_Y_CONTRASENIA)
        );
    }
        public static NavegarAlInicioSesionExito navegarAlRegistroPaginaExito(){
            return new NavegarAlInicioSesionExito();
    }

}
