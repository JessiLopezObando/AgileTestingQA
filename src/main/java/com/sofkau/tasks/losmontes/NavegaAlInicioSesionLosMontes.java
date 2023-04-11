package com.sofkau.tasks.losmontes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.losmontes.PaginaIncioLosMontes.BOTON_INICIAR_SESION;
import static com.sofkau.ui.losmontes.PaginaIncioLosMontes.MENSAJE_COOKIES;


public class NavegaAlInicioSesionLosMontes implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENSAJE_COOKIES),
                Click.on(BOTON_INICIAR_SESION)
        );
    }
    public static NavegaAlInicioSesionLosMontes navegaAlInicioSesionLosMontes(){
        return new NavegaAlInicioSesionLosMontes();
    }
}
