package com.store.service

import com.store.model.request.ProductRequest
import com.store.model.request.ProductType
import com.store.model.response.ProductDetail
import org.springframework.stereotype.Component


@Component
class ProductService {

    private val products: ArrayList<ProductDetail> = arrayListOf();

    fun addProduct(request: ProductRequest): Map<String, Any> {
        val productDetail =
            ProductDetail(products.size + 1, request.name, request.type, request.inventory, request.cost)
        products.add(productDetail);
        return mapOf(Pair("id", productDetail.id));
    }


    fun getProduct(type: ProductType): List<ProductDetail> {
        return products.filter { it.type == type };
    }
}