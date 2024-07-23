package com.store.model.response

import com.store.model.request.ProductType

data class ProductDetail(
    val id: Int,
    val name: String,
    val type: ProductType,
    val inventory: Int,
    val cost: Int
)