package io.devqa.requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object InjectDynamicValues {

  var customerId = java.util.UUID.randomUUID()
  var orderId = java.util.UUID.randomUUID()

  val setNewSession =
    exec(setSessionAttributesBulkAdd => {
      setSessionAttributesBulkAdd.setAll(
        "customerId" -> s"${customerId}",
        "orderId" -> s"${orderId}"
      )
    })

  val sendRequestWithDynamicData =
      http("Request With Dynamic Values")
        .post("/some-endpoint")
        .body(ElFileBody("jsonTemplate.json"))
        .check(status.is(200))
        .check(jsonPath("$.someParam").saveAs("someParamValue"))
}
