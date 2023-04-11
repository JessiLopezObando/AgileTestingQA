package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicioSesionExito extends PageObject {

    public static final Target BOTON_CUENTA = Target.
            the("Campo mi cuenta ")
            .located(By.cssSelector(".vtex-menu-2-x-styledLinkIcon.vtex-menu-2-x-styledLinkIcon--header-link.mh2"));

    public static final Target INGRESAR_CON_EMAIL_Y_CONTRASENIA = Target.
            the("Boton ingresar con email y contrasenna")
            .located(By.xpath("//div[contains(@class,'vtex-login-2-x-button vtex-login-2-x-emailPasswordOptionBtn')]//button[contains(@type,'button')]"));

    public static final Target CAMPO_EMAIL = Target.
            the("Campo del email")
            .located(By.xpath("//input[@placeholder='Ingresa tu email']"));

    public static final Target CAMPO_CONTRASENIAA = Target.
            the("Campo del contrasenna")
            .located(By.xpath("//input[@type='password']"));

    public static final Target BOTON_PARA_ENTRAR = Target.
            the("Boton para entrar en la pagina")
            .located(By.xpath("//span[contains(text(), 'Entrar')]"));

}
