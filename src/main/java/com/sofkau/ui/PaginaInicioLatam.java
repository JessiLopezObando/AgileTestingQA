package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicioLatam extends PageObject {
    public static final Target BOTON_INICIO_SESION_LATAM = Target.the("Boton iniciar sesion")
            .located(By.id("header__profile__lnk-sign-in"));
    public static final Target CAMPO_EMAIL_LATAM = Target.the("Ingresar email usuario")
            .located(By.id("form-input--alias"));
    public static final Target BOTON_CONTINUAR = Target.the("Boton continuar")
            .located(By.id("primary-button"));
    public static final Target CAMPO_PASSWORD_LATAM = Target.the("Ingresar password usuario")
            .located(By.id("form-input--password"));
    public static final Target BOTON_INICIAR_SESION_LATAM = Target.the("Boton finalizacion inicio sesion")
            .located(By.id("primary-button"));

}
