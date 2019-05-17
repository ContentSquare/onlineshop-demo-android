package com.contentsquare.android.onlineshop.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.contentsquare.android.onlineshop.R
import com.contentsquare.android.onlineshop.databinding.ProductsListBinding

class ProductsListFragment : Fragment() {

    lateinit var binding: ProductsListBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.products_list, container, false)
        return binding.root
    }
}