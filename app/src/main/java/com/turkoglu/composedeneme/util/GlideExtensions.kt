package com.turkoglu.composedeneme.util

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions.centerCropTransform
import com.turkoglu.composedeneme.R

fun ImageView.loadCircleImage(path: String?) {
    Glide.with(this.context).load(Constants.IMAGE_BASE_URL + path)
        .apply(centerCropTransform().error(R.drawable.ic_launcher_background).circleCrop()).into(this)
}

fun ImageView.loadImage(path: String?) {
    Glide.with(this.context).load(Constants.IMAGE_BASE_URL + path)
        .apply(centerCropTransform().error(R.drawable.ic_launcher_foreground)).into(this)
}