package com.mpi

import io.ktor.application.*
import io.ktor.auth.*
import io.ktor.features.*
import io.ktor.html.*
import io.ktor.routing.*
import kotlinx.html.*

fun Application.main() {
    install(DefaultHeaders)
    install(CallLogging)
    routing {
        get("/") {
            call.respondHtml {
                head {
                    title { +"Krasty Krab Main page" }
                }
                body {
                    val runtime = Runtime.getRuntime()
                    p { +"Hello to Krasty Krab statistics page!" }
                    p { +"Processed clients for today: ${runtime.availableProcessors()}" }
                    p { +"Current amount of money: ${runtime.freeMemory()}" }
                    p { +"Computer user: ${System.getProperty("user.name")}" }
                }
            }
        }
    }
}