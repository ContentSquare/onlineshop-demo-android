package com.contentsquare.android.onlineshop.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.contentsquare.android.onlineshop.R
import com.contentsquare.android.onlineshop.databinding.ProductDetailsBinding

class ProductDetailsFragment : Fragment() {
    lateinit var binding: ProductDetailsBinding

    companion object {
        const val PRODUCT_KEY_NAME = "product"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.product_details, container, false)
        return binding.root
    }
}