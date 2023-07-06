package io.devqa.requests

import io.devqa.config.Config.{AM_ADMIN_LOGIN_URL, AM_ADMIN_PWD, CLIENT_SECRET}
import io.gatling.core.Predef._
import io.gatling.http.Predef._



object AdminLogin {

  val login = exec(http("Login as admin and save access token")
    .post(AM_ADMIN_LOGIN_URL)
    .header("Content-type", "application/x-www-form-urlencoded")
    .formParam("grant_type", "password")
    .formParam("client_id", "YOUR_CLIENT_ID")
    .formParam("client_secret", s"${CLIENT_SECRET}")
    .formParam("scope", "*")
    .formParam("username", "amadmin")
    .formParam("password", s"${AM_ADMIN_PWD}")
    .check(status.is(200))
    .check(jsonPath("$.access_token").saveAs("access_token"))
  )

}
