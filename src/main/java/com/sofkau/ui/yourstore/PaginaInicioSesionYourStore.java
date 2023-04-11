package com.sofkau.ui.yourstore;


import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicioSesionYourStore extends PageObject {


    public static final Target BOTON_ICON_MYACCOUNT = Target.the("Boton MY Account")
            .located(By.xpath("//span[normalize-space()='My Account']"));


    public static final Target BOTON_LOGIN = Target.the("Boton del login")
            .located(By.xpath("//a[normalize-space()='Login']"));


    public static final Target CAMPO_EMAIL = Target.the("campo para ingresar el email")
            .located(By.id("input-email"));


    public static final Target CAMPO_PASSWORD = Target.the("campo paraingresar el password")
            .located(By.id("input-password"));


    public static final Target BOTON_INICIAR_SESION = Target.the("boton para iniciar la sesion")
            .located(By.xpath("//input[@value='Login']"));


}
