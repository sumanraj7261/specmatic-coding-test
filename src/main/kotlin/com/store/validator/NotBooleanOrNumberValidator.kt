package com.store.validator

import jakarta.validation.ConstraintValidator
import jakarta.validation.ConstraintValidatorContext
import org.springframework.util.StringUtils


class NotBooleanOrNumberValidator : ConstraintValidator<NotBooleanOrNumber, String> {

    override fun isValid(value: String?, context: ConstraintValidatorContext): Boolean {
        return try {
            value?.toBigDecimalOrNull() == null &&
            value?.toBooleanStrictOrNull() == null
        } catch (e: NumberFormatException) {
            true
        }
    }
}
