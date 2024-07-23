package com.store.model.request


import com.fasterxml.jackson.annotation.JsonValue

enum class ProductType(val type: String) {
    BOOK("book"),
    FOOD("food"),
    GADGET("gadget"),
    OTHER("other");

    @JsonValue
    fun toValue(): String {
        return this.type
    }
}