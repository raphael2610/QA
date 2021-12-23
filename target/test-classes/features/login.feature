@Pruebas_Automatizadas
Feature: Flujo de ingreso
  Como usuario deseo poder loguearme con mi usuario registrado en la web

  @Ltest02
  Scenario: Ingreso y logueo en la web
    Given Validar que la web este operativa
    When Ingresa las credenciales "cupe@mail.com" y "Qull@2021"
    Then mostrar logueo exitoso

  @test02
  Scenario: Ingreso y logueo en la web con datos incorrectos
    Given Validar que la web este operativa
    When Ingresa las credenciales "cupe.com" y "2021"
    Then mostrar logueo fallido

