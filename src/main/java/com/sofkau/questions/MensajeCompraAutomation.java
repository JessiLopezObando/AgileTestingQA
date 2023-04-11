package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.automation.ConfirmacionCompra.MENSAJE_COMPRA;

public class MensajeCompraAutomation implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_COMPRA.resolveFor(actor).getText();
    }

    public static MensajeCompraAutomation mensajeCompra(){
        return new MensajeCompraAutomation();
    }
}
