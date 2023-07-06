package io.devqa.scenarios

import io.devqa.requests.AdminLogin
import io.gatling.core.Predef.scenario

object LoginScenarios {

  val adminLoginScenario = scenario("")
    .exec(AdminLogin.login)
}
