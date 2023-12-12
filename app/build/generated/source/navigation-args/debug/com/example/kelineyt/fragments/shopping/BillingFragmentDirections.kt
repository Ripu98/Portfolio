package com.example.kelineyt.fragments.shopping

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.kelineyt.R
import com.example.kelineyt.`data`.Address
import java.io.Serializable
import kotlin.Int
import kotlin.Suppress

public class BillingFragmentDirections private constructor() {
  private data class ActionBillingFragmentToAddressFragment(
    public val address: Address? = null
  ) : NavDirections {
    public override val actionId: Int = R.id.action_billingFragment_to_addressFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Address::class.java)) {
          result.putParcelable("address", this.address as Parcelable?)
        } else if (Serializable::class.java.isAssignableFrom(Address::class.java)) {
          result.putSerializable("address", this.address as Serializable?)
        }
        return result
      }
  }

  public companion object {
    public fun actionBillingFragmentToAddressFragment(address: Address? = null): NavDirections =
        ActionBillingFragmentToAddressFragment(address)
  }
}
