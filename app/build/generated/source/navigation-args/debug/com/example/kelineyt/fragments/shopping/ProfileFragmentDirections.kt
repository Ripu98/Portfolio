package com.example.kelineyt.fragments.shopping

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.kelineyt.R
import com.example.kelineyt.`data`.CartProduct
import kotlin.Array
import kotlin.Boolean
import kotlin.Float
import kotlin.Int

public class ProfileFragmentDirections private constructor() {
  private data class ActionProfileFragmentToBillingFragment(
    public val totalPrice: Float,
    public val products: Array<CartProduct>,
    public val payment: Boolean
  ) : NavDirections {
    public override val actionId: Int = R.id.action_profileFragment_to_billingFragment

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
    public fun actionProfileFragmentToUserAccountFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_profileFragment_to_userAccountFragment)

    public fun actionProfileFragmentToOrdersFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_profileFragment_to_ordersFragment)

    public fun actionProfileFragmentToBillingFragment(
      totalPrice: Float,
      products: Array<CartProduct>,
      payment: Boolean
    ): NavDirections = ActionProfileFragmentToBillingFragment(totalPrice, products, payment)

    public fun actionProfileFragmentToFragmentUserBookedItems(): NavDirections =
        ActionOnlyNavDirections(R.id.action_profileFragment_to_fragmentUserBookedItems)
  }
}
