package com.sofkau.ui.lavaquita;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmacionInicioSesionLaVaquita extends PageObject {

    public static Target MENSAJE_INICIO = Target.the("mensaje con nombre")
            .located(By.xpath("//span[@class='name-login']"));
}