package no.java

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import no.java.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureHTTP()
        configureMonitoring()
        configureRouting()
        configureTemplating()
        configureSerialization()
        configureSecurity()
    }.start(wait = true)
}
