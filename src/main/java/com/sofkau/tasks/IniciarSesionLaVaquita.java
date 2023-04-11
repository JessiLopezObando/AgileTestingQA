package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.PaginaInicioLaVaquita.*;

public class IniciarSesionLaVaquita implements Task {

    private String usuario;
    private String contrasenna;

    public IniciarSesionLaVaquita conElUsuario(String usuario){
        this.usuario=usuario;
        return this;
    }

    public IniciarSesionLaVaquita yConLaContrasenna(String contrasenna){
        this.contrasenna=contrasenna;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(CAMPO_USUARIO),
                Enter.theValue(contrasenna).into(CAMPO_CONTRASENNA),
                Click.on(BOTON_INICIAR_SESION)
        );
    }

    public static IniciarSesionLaVaquita iniciarSesionLaVaquita(){
        return new IniciarSesionLaVaquita();
    }
}
