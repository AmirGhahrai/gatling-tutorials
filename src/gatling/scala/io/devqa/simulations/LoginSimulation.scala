package io.devqa.simulations

import io.devqa.scenarios.LoginScenarios
import io.gatling.core.Predef._

import scala.concurrent.duration.DurationInt
import scala.language.postfixOps

class LoginSimulation extends Simulation {

  setUp(
    LoginScenarios.adminLoginScenario.inject(
      nothingFor(3),
      constantUsersPerSec(1) during(60 second))
  )
}
