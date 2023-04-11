package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.ConfirmacionIncioLosMontes.MENSAJE_LOS_MONTES;

public class MensajeNombreLosMontes implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_LOS_MONTES.resolveFor(actor).getText();
    }

    public static MensajeNombreLosMontes mensajeNombreLosMontes() {return new MensajeNombreLosMontes();}
}
