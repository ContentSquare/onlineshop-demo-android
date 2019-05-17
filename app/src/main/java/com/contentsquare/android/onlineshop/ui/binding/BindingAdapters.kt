package com.contentsquare.android.onlineshop.ui.binding

import android.view.View
import androidx.databinding.BindingAdapter


@set:BindingAdapter("visibleOrGone")
var View.visibleOrGone: Boolean
    get() = visibility == View.GONE
    set(value) {
        visibility = (if (value) View.VISIBLE else View.GONE)
    }