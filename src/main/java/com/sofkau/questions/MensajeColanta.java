package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

<<<<<<< HEAD
import static com.sofkau.ui.ConfirmacionInicioSesionColanta.BOTON_VALIDACION;
=======
import static com.sofkau.ui.colanta.ConfirmacionInicioSesionColanta.BOTON_VALIDACION;
>>>>>>> feature/melissa


public class MensajeColanta implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return BOTON_VALIDACION.resolveFor(actor).getText();
    }
    public static MensajeColanta mensajeColanta(){
        return new MensajeColanta();
    }
}
