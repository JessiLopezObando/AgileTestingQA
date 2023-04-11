package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import static com.sofkau.questions.MensajeColanta.mensajeColanta;
import static com.sofkau.questions.MensajeInicioYourStore.mensajeInicioYourStore;
import static com.sofkau.questions.MensajeNombre.mensajeNombre;
import static com.sofkau.questions.MensajeNombreExito.mensajeBienvenidaExito;
import static com.sofkau.questions.MensajeNombreLosMontes.mensajeNombreLosMontes;
import static com.sofkau.tasks.IniciarSesionAutomation.iniciarSesion;


import static com.sofkau.tasks.IniciarSesionColanta.iniciarSesionColanta;


import static com.sofkau.tasks.IniciarSesionLosMontes.iniciarSesionLosMontes;
import static com.sofkau.tasks.NavegaAlInicioSesionLosMontes.navegaAlInicioSesionLosMontes;
import static com.sofkau.tasks.IniciarSesionYourStore.iniciarSesionYourStore;
import static com.sofkau.tasks.NavegarAlInicioSesionAutomation.navegarAlRegistro;

import static com.sofkau.tasks.NavegarAlInicioSesionColanta.navegarAlInicioSesionColanta;

import static com.sofkau.tasks.NavegarAlInicioSesionExito.navegarAlRegistroPaginaExito;
import static com.sofkau.tasks.PaginaInicioSesionExitoTasks.iniciarSesionExito;

import static com.sofkau.tasks.NavegarInicioYourStore.navegarInicioYourStore;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class StepDefinitions extends Configuracion {


    public static Logger LOGGER = Logger.getLogger(StepDefinitions.class);

    @Given("que el usuario esta en la pagina de inicio {string}")
    public void que_el_usuario_esta_en_la_pagina_de_inicio(String url) {
        configurarNavegador(url);
    }

    @When("navega hasta la opcion de iniciar sesion en la {string}")
    public void navega_hasta_la_opcion_de_iniciar_sesion_en_la(String pagina) {
        try {
            navegarHastaInicio(pagina);

        } catch (Exception exception) {
            quitarDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);
        }

    }

    @When("completa las credenciales en la {string}")
    public void completa_las_credenciales_en_la(String pagina) {
        try {
            completarCredenciales(pagina);

        } catch (Exception exception) {
            quitarDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);
        }

    }


    @Then("el usuario debera ver un texto que lo confirme en la {string}")
    public void el_usuario_debera_ver_un_texto_que_lo_confirme_en_la(String pagina) {
        try {
            asserstions(pagina);

        } catch (Exception exception) {
            quitarDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);
        }

    }

    private static void asserstions(String pagina) {
        switch (pagina) {
            case "automation exercise":
                assertionAutomation();
                break;
            case "pagina exito":
                assertionExito();
                break;
            case "supermercado los montes":
                assertionLosMontes();
                break;

            case "Your Store":
                assertionYourStore();
                break;
            case "pideColanta":
                assertionColanta();
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

    private static void assertionExito() {
        theActorInTheSpotlight().should(
                seeThat(mensajeBienvenidaExito(), equalTo("Hola"))
        );
    }


    private static void assertionYourStore() {
        theActorInTheSpotlight().should(
                seeThat(mensajeInicioYourStore(), equalTo("My Account"))
        );
    }
    private static void assertionColanta() {
        theActorInTheSpotlight().should(
                seeThat(mensajeColanta(), equalTo("Mi Perfil"))
        );
    }


    /**
     *
     *
     * Métodos
     */

    //When Navega hasta la opcion de iniciar sesion - General
    private static void navegarHastaInicio(String pagina) {
        switch (pagina) {
            case "automation exercise":
                clickInicioAutomation();
                break;
            case "pagina exito":
                clickInicioSesionExito();

            case "supermercado los montes":
                clickIncioLosMontes();
                break;

            case "Your Store":
                clickInicioYourStore();
                break;
            case "pideColanta":
                clickInicioColanta();
                break;
            default:
                LOGGER.info("Ingrese el nombre de la pagina correcta");
                Assertions.fail();
        }
    }

    //Método iniciar Sesion Automation
    private static void clickInicioAutomation() {
        theActorInTheSpotlight().attemptsTo(
                navegarAlRegistro()
        );
    }
    private static void clickInicioSesionExito() {
        theActorInTheSpotlight().attemptsTo(
                navegarAlRegistroPaginaExito()
        );
    }


    private static void clickInicioYourStore() {
        theActorInTheSpotlight().attemptsTo(
                navegarInicioYourStore()
        );
    }
    private static void clickInicioColanta() {
        theActorInTheSpotlight().attemptsTo(
                navegarAlInicioSesionColanta()
        );
    }




    //Metodo que contiene las credenciales de Automation

    private static void inicioAutomation() {
        theActorInTheSpotlight().attemptsTo(
                iniciarSesion()
                        .conElUsuario("jessica@gmail.com")
                        .yConLaContrasenna("123456")
        );
    }


    private static void registroUsuarioExito() {
        theActorInTheSpotlight().attemptsTo(
                iniciarSesionExito()
                        .conUsuario("ospina_88@hotmail.com")
                        .conPassword("Emilia#2019"));


    }

    private static void inicioYourStore() {
        theActorInTheSpotlight().attemptsTo(
                iniciarSesionYourStore()
                        .conElUsuario("yeisonbuitrago1010@gmail.com")
                        .yConLaContrasenna("72qMXaw5rK29sB")

        );
    }
    private static void inicioColanta() {
        theActorInTheSpotlight().attemptsTo(
                iniciarSesionColanta()
                        .conElEmail("rominamene2023@gmail.com")
                        .yConLaContrasenna("Lupita01")
        );
    }



    //When - completa credenciales para iniciar sesion - General

    private static void completarCredenciales(String pagina) {
        switch (pagina) {
            case "automation exercise":
                inicioAutomation();
                break;
            case "pagina exito":
                registroUsuarioExito();
                break;

            case "supermercado los montes":
                inicioLosMontes();
                break;

            case "Your Store":
                inicioYourStore();

                break;
            case "pideColanta":
                inicioColanta();
                break;
            default:
                LOGGER.info("Ingrese el nombre de la pagina correcta");
                Assertions.fail();
        }
    }

    /**
     *
     * Métodos Supermercado Los Montes
     */



    private static void clickIncioLosMontes() {
        theActorInTheSpotlight().attemptsTo(
                navegaAlInicioSesionLosMontes()
        );
    }

    private static void inicioLosMontes() {
        theActorInTheSpotlight().attemptsTo(
                iniciarSesionLosMontes()
                        .conElEmail("juanmanuelgofu@gmail.com")
                        .yConLaContrasenna("Juan1997")
        );
    }
    private static void assertionLosMontes() {
        theActorInTheSpotlight().should(
                seeThat(mensajeNombreLosMontes(), equalTo("Juan Manuel Gomez Fuentes"))
        );
    }

}
