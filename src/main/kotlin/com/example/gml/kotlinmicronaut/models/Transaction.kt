package com.example.gml.kotlinmicronaut.models

import java.math.BigDecimal

data class Transaction(
        val id:String,
        val title: String,
        val description: String,
        val value: BigDecimal,
        val account: Account
)