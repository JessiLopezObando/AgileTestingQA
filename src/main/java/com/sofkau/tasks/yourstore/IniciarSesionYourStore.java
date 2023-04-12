package com.sofkau.tasks.yourstore;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.yourstore.PaginaInicioSesionYourStore.*;

public class IniciarSesionYourStore implements Task {


    private String email;
    private String password;

    public IniciarSesionYourStore conElUsuario(String email) {
        this.email = email;
        return this;
    }

    public IniciarSesionYourStore yConLaContrasenna(String password) {
        this.password = password;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(

                Enter.theValue(email).into(CAMPO_EMAIL),
                Enter.theValue(password).into(CAMPO_PASSWORD),
                Click.on(BOTON_INICIAR_SESION)


        );
    }

    public static IniciarSesionYourStore iniciarSesionYourStore() {
        return new IniciarSesionYourStore();
    }


}
