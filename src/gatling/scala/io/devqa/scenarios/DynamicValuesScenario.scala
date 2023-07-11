package io.devqa.scenarios

import io.devqa.requests.InjectDynamicValues
import io.gatling.core.Predef._

object DynamicValuesScenario {

  val dynamicValues = scenario("Scenario that injects dynamic values")
    .exec(InjectDynamicValues.setNewSession)
    .exec(InjectDynamicValues.sendRequestWithDynamicData)

}
