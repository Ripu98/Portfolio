package com.example.kelineyt.fragments.shopping;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0013\u001a\u00020\bH\u00c6\u0003J2\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\""}, d2 = {"Lcom/example/kelineyt/fragments/shopping/BillingFragmentArgs;", "Landroidx/navigation/NavArgs;", "totalPrice", "", "products", "", "Lcom/example/kelineyt/data/CartProduct;", "payment", "", "(F[Lcom/example/kelineyt/data/CartProduct;Z)V", "getPayment", "()Z", "getProducts", "()[Lcom/example/kelineyt/data/CartProduct;", "[Lcom/example/kelineyt/data/CartProduct;", "getTotalPrice", "()F", "component1", "component2", "component3", "copy", "(F[Lcom/example/kelineyt/data/CartProduct;Z)Lcom/example/kelineyt/fragments/shopping/BillingFragmentArgs;", "equals", "other", "", "hashCode", "", "toBundle", "Landroid/os/Bundle;", "toSavedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "toString", "", "Companion", "app_debug"})
public final class BillingFragmentArgs implements androidx.navigation.NavArgs {
    private final float totalPrice = 0.0F;
    @org.jetbrains.annotations.NotNull
    private final com.example.kelineyt.data.CartProduct[] products = null;
    private final boolean payment = false;
    @org.jetbrains.annotations.NotNull
    public static final com.example.kelineyt.fragments.shopping.BillingFragmentArgs.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.kelineyt.fragments.shopping.BillingFragmentArgs copy(float totalPrice, @org.jetbrains.annotations.NotNull
    com.example.kelineyt.data.CartProduct[] products, boolean payment) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public BillingFragmentArgs(float totalPrice, @org.jetbrains.annotations.NotNull
    com.example.kelineyt.data.CartProduct[] products, boolean payment) {
        super();
    }
    
    public final float component1() {
        return 0.0F;
    }
    
    public final float getTotalPrice() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.kelineyt.data.CartProduct[] component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.kelineyt.data.CartProduct[] getProducts() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean getPayment() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.os.Bundle toBundle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.SavedStateHandle toSavedStateHandle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @kotlin.jvm.JvmStatic
    public static final com.example.kelineyt.fragments.shopping.BillingFragmentArgs fromBundle(@org.jetbrains.annotations.NotNull
    android.os.Bundle bundle) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmStatic
    public static final com.example.kelineyt.fragments.shopping.BillingFragmentArgs fromSavedStateHandle(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lcom/example/kelineyt/fragments/shopping/BillingFragmentArgs$Companion;", "", "()V", "fromBundle", "Lcom/example/kelineyt/fragments/shopping/BillingFragmentArgs;", "bundle", "Landroid/os/Bundle;", "fromSavedStateHandle", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @kotlin.jvm.JvmStatic
        public final com.example.kelineyt.fragments.shopping.BillingFragmentArgs fromBundle(@org.jetbrains.annotations.NotNull
        android.os.Bundle bundle) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @kotlin.jvm.JvmStatic
        public final com.example.kelineyt.fragments.shopping.BillingFragmentArgs fromSavedStateHandle(@org.jetbrains.annotations.NotNull
        androidx.lifecycle.SavedStateHandle savedStateHandle) {
            return null;
        }
    }
}