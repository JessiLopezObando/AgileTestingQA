package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static com.sofkau.ui.ConfirmacionRegistro.MENSAJE_INICIO;

public class MensajeNombreExito implements Question<String> {

    public static Target MENSAJE_BIENVENIDA = Target.the("mensaje con el nombre")
            .located(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div[1]/div/div[2]/div/div[2]/div/div/div/div/div[2]/div/div/div/span[2]"));

    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_BIENVENIDA.resolveFor(actor).getText();
    }

    public static MensajeNombreExito mensajeBienvenida(){
        return new MensajeNombreExito();
    }
}
