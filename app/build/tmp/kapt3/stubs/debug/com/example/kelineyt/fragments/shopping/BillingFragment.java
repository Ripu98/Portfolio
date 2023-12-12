package com.example.kelineyt.fragments.shopping;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J$\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u001a\u00101\u001a\u00020(2\u0006\u00102\u001a\u00020,2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u00103\u001a\u00020(H\u0002J\b\u00104\u001a\u00020(H\u0002J\b\u00105\u001a\u00020(H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010\b\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lcom/example/kelineyt/fragments/shopping/BillingFragment;", "Landroidx/fragment/app/Fragment;", "()V", "addressAdapter", "Lcom/example/kelineyt/adapters/AddressAdapter;", "getAddressAdapter", "()Lcom/example/kelineyt/adapters/AddressAdapter;", "addressAdapter$delegate", "Lkotlin/Lazy;", "args", "Lcom/example/kelineyt/fragments/shopping/BillingFragmentArgs;", "getArgs", "()Lcom/example/kelineyt/fragments/shopping/BillingFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "billingProductsAdapter", "Lcom/example/kelineyt/adapters/BillingProductsAdapter;", "getBillingProductsAdapter", "()Lcom/example/kelineyt/adapters/BillingProductsAdapter;", "billingProductsAdapter$delegate", "billingViewModel", "Lcom/example/kelineyt/viewmodel/BillingViewModel;", "getBillingViewModel", "()Lcom/example/kelineyt/viewmodel/BillingViewModel;", "billingViewModel$delegate", "binding", "Lcom/example/kelineyt/databinding/FragmentBillingBinding;", "orderViewModel", "Lcom/example/kelineyt/viewmodel/OrderViewModel;", "getOrderViewModel", "()Lcom/example/kelineyt/viewmodel/OrderViewModel;", "orderViewModel$delegate", "products", "", "Lcom/example/kelineyt/data/CartProduct;", "selectedAddress", "Lcom/example/kelineyt/data/Address;", "totalPrice", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setupAddressRv", "setupBillingProductsRv", "showOrderConfirmationDialog", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class BillingFragment extends androidx.fragment.app.Fragment {
    private com.example.kelineyt.databinding.FragmentBillingBinding binding;
    private final kotlin.Lazy addressAdapter$delegate = null;
    private final kotlin.Lazy billingProductsAdapter$delegate = null;
    private final kotlin.Lazy billingViewModel$delegate = null;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private java.util.List<com.example.kelineyt.data.CartProduct> products;
    private float totalPrice = 0.0F;
    private com.example.kelineyt.data.Address selectedAddress;
    private final kotlin.Lazy orderViewModel$delegate = null;
    
    public BillingFragment() {
        super();
    }
    
    private final com.example.kelineyt.adapters.AddressAdapter getAddressAdapter() {
        return null;
    }
    
    private final com.example.kelineyt.adapters.BillingProductsAdapter getBillingProductsAdapter() {
        return null;
    }
    
    private final com.example.kelineyt.viewmodel.BillingViewModel getBillingViewModel() {
        return null;
    }
    
    private final com.example.kelineyt.fragments.shopping.BillingFragmentArgs getArgs() {
        return null;
    }
    
    private final com.example.kelineyt.viewmodel.OrderViewModel getOrderViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showOrderConfirmationDialog() {
    }
    
    private final void setupAddressRv() {
    }
    
    private final void setupBillingProductsRv() {
    }
}