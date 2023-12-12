package com.example.kelineyt.fragments.shopping

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.example.kelineyt.`data`.CartProduct
import java.lang.IllegalArgumentException
import kotlin.Array
import kotlin.Boolean
import kotlin.Float
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class BillingFragmentArgs(
  public val totalPrice: Float,
  public val products: Array<CartProduct>,
  public val payment: Boolean
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putFloat("totalPrice", this.totalPrice)
    result.putParcelableArray("products", this.products)
    result.putBoolean("payment", this.payment)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("totalPrice", this.totalPrice)
    result.set("products", this.products)
    result.set("payment", this.payment)
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    public fun fromBundle(bundle: Bundle): BillingFragmentArgs {
      bundle.setClassLoader(BillingFragmentArgs::class.java.classLoader)
      val __totalPrice : Float
      if (bundle.containsKey("totalPrice")) {
        __totalPrice = bundle.getFloat("totalPrice")
      } else {
        throw IllegalArgumentException("Required argument \"totalPrice\" is missing and does not have an android:defaultValue")
      }
      val __products : Array<CartProduct>?
      if (bundle.containsKey("products")) {
        __products = bundle.getParcelableArray("products")?.map { it as CartProduct
            }?.toTypedArray()
        if (__products == null) {
          throw IllegalArgumentException("Argument \"products\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"products\" is missing and does not have an android:defaultValue")
      }
      val __payment : Boolean
      if (bundle.containsKey("payment")) {
        __payment = bundle.getBoolean("payment")
      } else {
        throw IllegalArgumentException("Required argument \"payment\" is missing and does not have an android:defaultValue")
      }
      return BillingFragmentArgs(__totalPrice, __products, __payment)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): BillingFragmentArgs {
      val __totalPrice : Float?
      if (savedStateHandle.contains("totalPrice")) {
        __totalPrice = savedStateHandle["totalPrice"]
        if (__totalPrice == null) {
          throw IllegalArgumentException("Argument \"totalPrice\" of type float does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"totalPrice\" is missing and does not have an android:defaultValue")
      }
      val __products : Array<CartProduct>?
      if (savedStateHandle.contains("products")) {
        __products = savedStateHandle.get<Array<Parcelable>>("products")?.map { it as CartProduct
            }?.toTypedArray()
        if (__products == null) {
          throw IllegalArgumentException("Argument \"products\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"products\" is missing and does not have an android:defaultValue")
      }
      val __payment : Boolean?
      if (savedStateHandle.contains("payment")) {
        __payment = savedStateHandle["payment"]
        if (__payment == null) {
          throw IllegalArgumentException("Argument \"payment\" of type boolean does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"payment\" is missing and does not have an android:defaultValue")
      }
      return BillingFragmentArgs(__totalPrice, __products, __payment)
    }
  }
}
