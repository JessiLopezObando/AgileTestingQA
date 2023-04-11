package com.sofkau.ui.automation;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CompraAutomation extends PageObject{
    public static final Target BOTON_PRODUCTOS= Target.the("boton de productos")
            .located(By.xpath("(//a[@href='/products'])"));
    public static final Target BOTON_MARCA=Target.the("boton marca")
            .located(By.xpath("(//a[@href='/brand_products/H&M'])"));
}
