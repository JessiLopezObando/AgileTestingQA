package com.sofkau.ui.colanta;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicioColanta extends PageObject {
    public static final Target QUITAR_OPCION = Target.the("quitar opcion ")
            .located(By.xpath("//button[normalize-space()='Cerrar']"));
    public static final Target BOTON_MI_PERFIL = Target.the("Boton ir a mi perfil")
            .located(By.xpath("//div[@class='flex pv2 items-center']"));
    public static final Target BOTON_EMAIL_CONTRA = Target.the("Boton con email y contrasenna")
            .located(By.cssSelector("div[class='vtex-login-2-x-button vtex-login-2-x-emailPasswordOptionBtn'] button[type='button']"));
    public static final Target CORREO_OPCION= Target.the("opcion correo")
            .located(By.xpath("//input[contains(@placeholder,'Correo')]"));
    public static final Target CONTRASENNA_OPCION = Target.the("opcion contrasenna")
            .located(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/label[1]/div[1]/input[1]"));
    public static final Target BOTON_ENTRAR= Target.the("Boton entrar")
            .located(By.xpath("//button[@type='submit']"));


}
