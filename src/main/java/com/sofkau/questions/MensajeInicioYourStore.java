package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.ConfirmacionInicioYourStore.MENSAJE_INICIO_YOUR;

public class MensajeInicioYourStore implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_INICIO_YOUR.resolveFor(actor).getText();
    }

    public static MensajeInicioYourStore mensajeInicioYourStore() {
        return new MensajeInicioYourStore();
    }
}
