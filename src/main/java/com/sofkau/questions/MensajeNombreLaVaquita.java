package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.lavaquita.ConfirmacionInicioSesionLaVaquita.MENSAJE_INICIO;

public class MensajeNombreLaVaquita implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_INICIO.resolveFor(actor).getText();
    }

    public static MensajeNombreLaVaquita mensajeNombreLaVaquita(){
        return new MensajeNombreLaVaquita();
    }
}
