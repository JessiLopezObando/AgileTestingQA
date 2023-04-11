package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaIncioLosMontes extends PageObject {
    public static final Target MENSAJE_COOKIES = Target.the("Mensaje cookies")
            .located(By.className("closeFontAwesome"));
    public static final Target BOTON_INICIAR_SESION = Target.the("Botón pagina iniciar sesión")
            .located(By.xpath("(//*[@class='account'])[1]"));
    public static final Target CAMPO_EMAIL = Target.the("Campo email")
            .located(By.name("email"));
    public static final Target CAMPO_CONTRASENNA = Target.the("Campo contraseña")
            .located(By.name("password"));
    public static final Target BOTON_INGRESAR = Target.the("Botón iniciar sesión")
            .located(By.id("submit-login"));
}
