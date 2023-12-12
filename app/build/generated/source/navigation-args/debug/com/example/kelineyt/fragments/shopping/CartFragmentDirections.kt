package com.example.kelineyt.fragments.shopping

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.kelineyt.R
import com.example.kelineyt.`data`.CartProduct
import com.example.kelineyt.`data`.Product
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Array
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Suppress

public class CartFragmentDirections private constructor() {
  private data class ActionCartFragmentToProductDetailsFragment(
    public val product: Product
  ) : NavDirections {
    public override val actionId: Int = R.id.action_cartFragment_to_productDetailsFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Product::class.java)) {
          result.putParcelable("product", this.product as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(Product::class.java)) {
          result.putSerializable("product", this.product as Serializable)
        } else {
          throw UnsupportedOperationException(Product::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  private data class ActionCartFragmentToBillingFragment2(
    public val totalPrice: Float,
    public val products: Array<CartProduct>,
    public val payment: Boolean
  ) : NavDirections {
    public override val actionId: Int = R.id.action_cartFragment_to_billingFragment2

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putFloat("totalPrice", this.totalPrice)
        result.putParcelableArray("products", this.products)
        result.putBoolean("payment", this.payment)
        return result
      }
  }

  public companion object {
    public fun actionCartFragmentToProductDetailsFragment(product: Product): NavDirections =
        ActionCartFragmentToProductDetailsFragment(product)

    public fun actionCartFragmentToBillingFragment2(
      totalPrice: Float,
      products: Array<CartProduct>,
      payment: Boolean
    ): NavDirections = ActionCartFragmentToBillingFragment2(totalPrice, products, payment)
  }
}
