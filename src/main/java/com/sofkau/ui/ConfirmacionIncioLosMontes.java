package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmacionIncioLosMontes extends PageObject {
    public static Target MENSAJE_LOS_MONTES = Target.the("mensaje con el nombre")
            .located(By.xpath("//a[normalize-space()='Juan Manuel Gomez Fuentes']"));
}
