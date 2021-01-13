package com.example.gml.kotlinmicronaut.models

import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDate

data class Hello(@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd") val date:LocalDate, val name:String)