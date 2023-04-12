package com.sofkau.ui.colanta;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmacionInicioSesionColanta extends PageObject {
    public static final Target BOTON_VALIDACION= Target.the("Boton validacion")
            .located(By.xpath("(//span[@class='vtex-login-2-x-profile truncate t-action--small order-1 pl4 gray dn db-l'])[1]"));
}
