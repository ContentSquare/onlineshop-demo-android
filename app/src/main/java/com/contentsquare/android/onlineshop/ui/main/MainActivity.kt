package com.contentsquare.android.onlineshop.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.contentsquare.android.onlineshop.R
import com.contentsquare.android.onlineshop.databinding.ActivityMainBinding
import com.contentsquare.android.onlineshop.model.Product

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setSupportActionBar(binding.includeToolbarLayout.myToolbar)
    }

}
