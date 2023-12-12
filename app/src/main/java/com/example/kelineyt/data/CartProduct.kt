package com.example.kelineyt.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CartProduct(
    // Data types for cart products
    val product: Product,
    val quantity: Int,
    val selectedColor: Int? = null,
    val selectedSize: String? = null
): Parcelable {
    constructor() : this(Product(), 1, null, null)
}
