package com.example.kelineyt.fragments.settings

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kelineyt.R
import com.example.kelineyt.adapters.UserBookedItemsAdapter
import com.example.kelineyt.databinding.FragmentUserBookedItemsBinding
import com.example.kelineyt.firebase.FirebaseCommon
import com.example.kelineyt.util.Resource
import com.example.kelineyt.util.VerticalItemDecoration
import com.example.kelineyt.viewmodel.UserBookedViewModel
import kotlinx.coroutines.flow.collectLatest

class FragmentUserBookedItems : Fragment(R.layout.fragment_user_booked_items) {
    //Fragment used to list the booked items component in the profile section
    private lateinit var binding: FragmentUserBookedItemsBinding
    private val userBookedItemsAdapter by lazy { UserBookedItemsAdapter() }
    private val viewModel by activityViewModels<UserBookedViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentUserBookedItemsBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupCartRv()

        var totalPrice = 0f
        lifecycleScope.launchWhenStarted {
            viewModel.productsPrice.collectLatest { price ->
                price?.let {
                    totalPrice = it
                    binding.tvTotalPrice.text = "$ $price"
                }
            }
        }

        binding.imageCloseBookedItems.setOnClickListener {
            findNavController().navigateUp()
        }


            userBookedItemsAdapter.onProductClick = {
            val b = Bundle().apply {
                putParcelable("product", it.product)
            }
            findNavController().navigate(R.id.action_fragmentUserBookedItems_to_productDetailsFragment, b)
        }

        userBookedItemsAdapter.onPlusClick = {
            viewModel.changeQuantity(it, FirebaseCommon.QuantityChanging.INCREASE)
        }

        userBookedItemsAdapter.onMinusClick = {
            viewModel.changeQuantity(it, FirebaseCommon.QuantityChanging.DECREASE)
        }

        //We can simply add alert when booked item
//        binding.buttonCheckout.setOnClickListener {
//// This has been commented out for avoiding the billing logic
////            val action = CartFragmentDirections.actionCartFragmentToBillingFragment2(totalPrice,cartAdapter.differ.currentList.toTypedArray(),true)
////            findNavController().navigate(action)
//
//            val alertDialog = AlertDialog.Builder(requireContext()).apply {
//                setTitle("Book Information")
//                setMessage("Your items will be booked and you will receive an email for further confirmation. Thank-you.")
//                setPositiveButton("Okay") { dialog, _ ->
//                    binding.progressbarCart.visibility = View.GONE
//                    dialog.dismiss()
//                }
//            }
//            binding.progressbarCart.visibility = View.VISIBLE
//            alertDialog.create()
//            alertDialog.show()
//        }



        lifecycleScope.launchWhenStarted {
            viewModel.deleteDialog.collectLatest {
                val alertDialog = AlertDialog.Builder(requireContext()).apply {
                    setTitle("Delete item from cart")
                    setMessage("Do you want to delete this item from your cart?")
                    setNegativeButton("Cancel") { dialog, _ ->
                        dialog.dismiss()
                    }
                    setPositiveButton("Yes") { dialog, _ ->
                        viewModel.deleteCartProduct(it)
                        dialog.dismiss()
                    }
                }
                alertDialog.create()
                alertDialog.show()
            }
        }

        //The below code displays the list of added items of cart
        lifecycleScope.launchWhenStarted {
            viewModel.cartProducts.collectLatest {
                when (it) {
                    is Resource.Loading -> {
                        binding.progressbarCart.visibility = View.VISIBLE
                    }
                    is Resource.Success -> {
                        binding.progressbarCart.visibility = View.INVISIBLE
                        if (it.data!!.isEmpty()) {
                            showEmptyCart()
                            hideOtherViews()
                        } else {
                            hideEmptyCart()
                            showOtherViews()
                            userBookedItemsAdapter.differ.submitList(it.data)
                        }
                    }
                    is Resource.Error -> {
                        binding.progressbarCart.visibility = View.INVISIBLE
                        Toast.makeText(requireContext(), it.message, Toast.LENGTH_SHORT).show()
                    }
                    else -> Unit
                }
            }
        }
    }

    private fun showOtherViews() {
        binding.apply {
            rvCart.visibility = View.VISIBLE
            totalBoxContainer.visibility = View.VISIBLE
//            buttonCheckout.visibility = View.VISIBLE
        }
    }

    private fun hideOtherViews() {
        binding.apply {
            rvCart.visibility = View.GONE
            totalBoxContainer.visibility = View.GONE
//            buttonCheckout.visibility = View.GONE
        }
    }

    private fun hideEmptyCart() {
        binding.apply {
            layoutCartEmpty.visibility = View.GONE
        }
    }

    private fun showEmptyCart() {
        binding.apply {
            layoutCartEmpty.visibility = View.VISIBLE
        }
    }

    private fun setupCartRv() {
        binding.rvCart.apply {
            layoutManager = LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
            adapter = userBookedItemsAdapter
            addItemDecoration(VerticalItemDecoration())
        }
    }
}