package com.store.model.request


import com.store.validator.NotBooleanOrNumber
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull


data class ProductRequest(
    @field:NotNull
    @field:NotBooleanOrNumber
    val name: String,
    @field:NotNull
    val type: ProductType,
    @field:Max(9999)
    @field:Min(1)
    @field:NotNull
    val inventory: Int,
    @field:Min(1)
    @field:NotNull
    val cost: Int
)