package io.devqa.config

object Config {

  val ENV: String = System.getProperty("ENV")
  val AM_ADMIN_PWD: String = System.getProperty("ADMIN_PWD")
  val CLIENT_SECRET: String = System.getProperty("CLIENT_SECRET")
  val AM_ADMIN_LOGIN_URL: String = ENV+"/am/oauth2/realms/root/access_token"
}
