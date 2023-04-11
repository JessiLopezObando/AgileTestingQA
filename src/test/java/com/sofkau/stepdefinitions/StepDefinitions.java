package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import static com.sofkau.questions.MensajeNombre.mensajeNombre;
import static com.sofkau.questions.MensajeNombreLaVaquita.mensajeNombreLaVaquita;
import static com.sofkau.tasks.IniciarSesionAutomation.iniciarSesion;
import static com.sofkau.tasks.IniciarSesionLaVaquita.iniciarSesionLaVaquita;
import static com.sofkau.tasks.NavegarAlInicioSesionAutomation.navegarAlRegistro;
import static com.sofkau.tasks.NavegarAlInicioSesionLaVaquita.navegarAlInicioSesionLaVaquita;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class StepDefinitions extends Configuracion {

    public static Logger LOGGER= Logger.getLogger(StepDefinitions.class);

    @Given("que el usuario esta en la pagina de inicio {string}")
    public void que_el_usuario_esta_en_la_pagina_de_inicio(String url) {
        configurarNavegador(url);
    }

    @When("navega hasta la opcion de iniciar sesion en la {string}")
    public void navega_hasta_la_opcion_de_iniciar_sesion_en_la(String pagina) {
        try{
            navegarHastaInicio(pagina);

        } catch (Exception exception) {
            quitarDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);
        }

    }

    @When("completa las credenciales en la {string}")
    public void completa_las_credenciales_en_la(String pagina) {
        try{
            completarCredenciales(pagina);

        } catch (Exception exception) {
            quitarDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);
        }
    }


    @Then("el usuario debera ver un texto que lo confirme en la {string}")
    public void el_usuario_debera_ver_un_texto_que_lo_confirme_en_la(String pagina) {
        try{
            asserstions(pagina);

        } catch (Exception exception) {
            quitarDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);
        }
    }

    private static void asserstions(String pagina) {
        switch (pagina){
            case "automation exercise":
                assertionAutomation();
                break;
            case "la vaquita":
                assertionLaVaquita();
                break;
            default:
                LOGGER.info("Ingrese el nombre de la pagina correcta");
                Assertions.fail();
        }
    }

    private static void assertionAutomation() {
        theActorInTheSpotlight().should(
                seeThat(mensajeNombre(), equalTo("Logged in as Jessica"))
        );
    }

    private static void assertionLaVaquita() {
        theActorInTheSpotlight().should(
                seeThat(mensajeNombreLaVaquita(), equalTo("Hola, Maria"))
        );
    }
    /**
     *
     * Métodos Automation
     */

    private static void navegarHastaInicio(String pagina) {
        switch (pagina){
            case "automation exercise":
                clickInicioAutomation();
                break;
            case "la vaquita":
                clickInicioLaVaquita();
                break;
            default:
                LOGGER.info("Ingrese el nombre de la pagina correcta");
                Assertions.fail();
        }
    }

    private static void clickInicioAutomation() {
        theActorInTheSpotlight().attemptsTo(
                navegarAlRegistro()
        );
    }

    private static void clickInicioLaVaquita() {
        theActorInTheSpotlight().attemptsTo(
                navegarAlInicioSesionLaVaquita()
        );
    }

    private static void inicioAutomation() {
        theActorInTheSpotlight().attemptsTo(
                iniciarSesion()
                        .conElUsuario("jessica@gmail.com")
                        .yConLaContrasenna("123456")
        );
    }

    private static void inicioLaVaquita() {
        theActorInTheSpotlight().attemptsTo(
                iniciarSesionLaVaquita()
                        .conElUsuario("mariaisabelgiraldorendon357@gmail.com")
                        .yConLaContrasenna("MariaGiraldo_123")
        );
    }

    private static void completarCredenciales(String pagina) {
        switch (pagina){
            case "automation exercise":
                inicioAutomation();
                break;

            case "la vaquita":
                inicioLaVaquita();
                break;
            default:
                LOGGER.info("Ingrese el nombre de la pagina correcta");
                Assertions.fail();
        }
    }
}