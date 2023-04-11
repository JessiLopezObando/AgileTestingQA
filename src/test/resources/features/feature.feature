Feature: Iniciar sesión
  yo
  quiero
  para

  @InicioSesión
  Scenario Outline: Iniciar sesion
    Given que el usuario esta en la pagina de inicio <url>
    When navega hasta la opcion de iniciar sesion en la <pagina>
    And completa las credenciales en la <pagina>
    Then el usuario debera ver un texto que lo confirme en la <pagina>

    Examples:
      | url                               | pagina                |
      | "https://automationexercise.com/" | "automation exercise" |
      | "https://vaquitaexpress.com.co/"  | "la vaquita"          |
    