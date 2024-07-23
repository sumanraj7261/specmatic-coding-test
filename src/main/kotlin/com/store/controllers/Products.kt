package com.store.controllers

import com.store.model.request.ProductRequest
import com.store.model.request.ProductType
import com.store.model.response.ProductDetail
import com.store.service.ProductService
import com.store.validator.NotBooleanOrNumber
import jakarta.annotation.Nullable
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.net.URI


@RestController
class Products(
    @Autowired val productService: ProductService
) {

    @PostMapping("/products")
    fun addProduct(@Valid @RequestBody request: ProductRequest): ResponseEntity<Map<String, Any>> {
        return ResponseEntity.created(URI.create("")).body(productService.addProduct(request))
    }

    @GetMapping("/products")
    fun getProduct(@Nullable @NotBooleanOrNumber type: String = "other"): List<ProductDetail> {
        val productType = ProductType.valueOf(type.uppercase())
        return productService.getProduct(productType)
    }
}

