package com.meals.app.binding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.meals.ext.image.loadImage

object ImageBinding {

    @JvmStatic
    @BindingAdapter("loadImage")
    fun loadImageFromUrl(view: ImageView?, url: String?) {
        view?.loadImage(url)
    }

}