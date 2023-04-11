package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmacionInicioSesionColanta extends PageObject {
    public static final Target BOTON_VALIDACION= Target.the("Boton validacion")
            .located(By.xpath("(//div[@class='flex pv2 items-center'])[1]"));
}
