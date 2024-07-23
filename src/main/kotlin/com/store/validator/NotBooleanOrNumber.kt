package com.store.validator

import jakarta.validation.Constraint
import jakarta.validation.Payload
import kotlin.reflect.KClass

@Target(AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER)
@Retention(AnnotationRetention.RUNTIME)
@Constraint(validatedBy = [NotBooleanOrNumberValidator::class])
annotation class NotBooleanOrNumber(
    val message: String = "Name must be a string and not a boolean or number",
    val groups: Array<KClass<*>> = [],
    val payload: Array<KClass<out Payload>> = []
)
