@Pruebas_Automatizadas
Feature: Flujo de Registro
  Como usuario nuevo deseo poder registrarme en la web

  @Rtest01
  Scenario: Ingreso y registro en web
    Given Validar que la web de registro este operativa
    When Ingresa las credenciales para registro "cupe@mail.com" y "Qull@2021"
    Then mostrar registro guardado

  @Rtest02
  Scenario: Ingreso y registro en web con datos no validos
    Given Validar que la web de registro este operativa
    When Ingresa las credenciales para registro "cupemail.com" y "2021"
    Then mostrar validacion de datos