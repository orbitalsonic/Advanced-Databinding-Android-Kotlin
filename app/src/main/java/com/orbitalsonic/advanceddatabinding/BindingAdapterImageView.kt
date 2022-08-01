package com.orbitalsonic.advanceddatabinding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions

@BindingAdapter("imageFromUrl")
fun ImageView.imageFromUrl(imageUrl: Int?) {
    Glide.with(this)
        .load(imageUrl)
        .placeholder(R.drawable.ic_user)
        .centerCrop()
        .transition(DrawableTransitionOptions.withCrossFade(200))
        .into(this)
}