package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.PaginaInicioLatam.*;

public class IniciarSesionLatam implements Task {

    private String email;
    private String password;

    public IniciarSesionLatam conElUsuario(String email) {
        this.email = email;
        return this;
    }

    public IniciarSesionLatam yConLaContrasenna(String password) {
        this.password = password;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(email).into(CAMPO_EMAIL_LATAM),
                Click.on(BOTON_CONTINUAR),
                Enter.theValue(password).into(CAMPO_PASSWORD_LATAM),
                Click.on(BOTON_INICIAR_SESION_LATAM)


        );
    }

    public static IniciarSesionLatam iniciarSesionLatam() {
        return new IniciarSesionLatam();
    }
}
