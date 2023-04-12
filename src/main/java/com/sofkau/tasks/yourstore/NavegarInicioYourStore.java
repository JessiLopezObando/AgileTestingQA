package com.sofkau.tasks.yourstore;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.yourstore.PaginaInicioSesionYourStore.BOTON_ICON_MYACCOUNT;
import static com.sofkau.ui.yourstore.PaginaInicioSesionYourStore.BOTON_LOGIN;

public class NavegarInicioYourStore implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_ICON_MYACCOUNT),
                Click.on(BOTON_LOGIN)

        );
    }

    public static NavegarInicioYourStore navegarInicioYourStore() {
        return new NavegarInicioYourStore();
    }
}
