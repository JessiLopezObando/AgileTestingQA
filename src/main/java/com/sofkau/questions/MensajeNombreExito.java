package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class MensajeNombreExito implements Question<String> {

    public static Target MENSAJE_BIENVENIDA_EXITO = Target.the("Hola")
            .located(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div[1]/div/div[2]/div/div[2]/div/div/div/div/div[2]/div/div/div/span[2]"));

    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_BIENVENIDA_EXITO.resolveFor(actor).getText();
    }

    public static MensajeNombreExito mensajeBienvenidaExito(){
        return new MensajeNombreExito();
    }
}
