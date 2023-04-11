package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmacionInicioYourStore extends PageObject {
    public static Target MENSAJE_INICIO_YOUR = Target.the("mensaje My Account")
            .located(By.xpath("(//h2[normalize-space()='My Account'])[1]"));
}
