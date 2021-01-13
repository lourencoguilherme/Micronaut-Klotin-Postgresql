package com.example.gml.kotlinmicronaut.controllers

import com.example.gml.kotlinmicronaut.models.Hello
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import java.time.LocalDate

@Controller("/hello")
class HelloController {

    @Get("/")
    @Produces(MediaType.APPLICATION_JSON)
    fun index(): Hello {
        return Hello(LocalDate.now(), "hello micronaut")
    }
}