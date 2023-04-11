package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmacionInicioLatam extends PageObject {
    public static Target MENSAJE_INICIO_LATAM = Target.the("mensaje con el nombre")
            .located(By.className("sc-bZQynM.iXIAiV"));
}
