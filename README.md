Gatling plugin for Gradle - Scala demo project
==============================================

A simple showcase of a Gradle project using the Gatling plugin for Gradle. Refer to the plugin documentation
[on the Gatling website](https://gatling.io/docs/current/extensions/gradle_plugin/) for usage.

This project is written in Scala, others are available for [Java](https://github.com/gatling/gatling-gradle-plugin-demo-java)
and [Kotlin](https://github.com/gatling/gatling-gradle-plugin-demo-kotlin).

## How to run the simulations

To run the simulations use the following command:

`./gradlew gatlingRun-io.devqa.simulations.{simulation_class}`

Example

`./gradlew gatlingRun-io.devqa.simulations.ComputerDatabaseSimulation`
