package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicioLaVaquita extends PageObject {
    public static final Target BOTON_REGISTRO = Target.the("Botón ir al registro")
            .located(By.xpath("(//i[@class='icon--user-vqt'])"));

    public static final Target CAMPO_USUARIO = Target.the("campo usuario")
            .located(By.id("email"));

    public static final Target CAMPO_CONTRASENNA = Target.the("campo contraseña")
            .located(By.id("pass"));

    public static final Target BOTON_INICIAR_SESION = Target.the("Botón iniciar sesion")
            .located(By.id("send2"));
}