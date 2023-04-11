package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.sofkau.ui.PaginaIncioLosMontes.*;


public class IniciarSesionLosMontes implements Task {
    private String email;
    private String contrasenna;

    public IniciarSesionLosMontes conElEmail(String email){
        this.email=email;
        return this;
    }

    public IniciarSesionLosMontes yConLaContrasenna(String contrasenna){
        this.contrasenna=contrasenna;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Enter.theValue(email).into(CAMPO_EMAIL),
                Enter.theValue(contrasenna).into(CAMPO_CONTRASENNA),
                Click.on(BOTON_INGRESAR)
        );
    }
    public static IniciarSesionLosMontes iniciarSesionLosMontes() {return new IniciarSesionLosMontes();}



}
