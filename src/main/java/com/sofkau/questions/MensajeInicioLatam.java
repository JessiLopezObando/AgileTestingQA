package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.ConfirmacionInicioLatam.MENSAJE_INICIO_LATAM;

public class MensajeInicioLatam implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_INICIO_LATAM.resolveFor(actor).getText();
    }
    public static MensajeInicioLatam mensajeInicioLatam(){
        return  new MensajeInicioLatam();
    }
}
