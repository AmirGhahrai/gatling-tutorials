package io.devqa.simulations

import io.devqa.scenarios.DynamicValuesScenario
import io.gatling.core.Predef._

import scala.concurrent.duration.DurationInt
import scala.language.postfixOps

class DynamicValuesSimulation extends Simulation {

  setUp(
    DynamicValuesScenario.dynamicValues.inject(
      nothingFor(3),
      constantUsersPerSec(1) during (60 second))
  )
}
