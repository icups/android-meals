package com.meals.ext.image

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import com.meals.app.R
import de.hdodenhof.circleimageview.CircleImageView
import java.net.HttpURLConnection
import java.net.URL

fun ImageView.loadImage(url: String?, placeholder: Boolean = true, request: RequestListener<Bitmap?>? = null) {
    if (url != null && url.isEmpty()) return
    Glide.with(this)
        .asBitmap()
        .apply(RequestOptions().fitCenter())
        .skipMemoryCache(false)
        .diskCacheStrategy(DiskCacheStrategy.ALL)
        .dontTransform()
        .placeholder(R.color.colorPrimaryDark)
        .load(url)
        .listener(request)
        .into(this)
}

fun ImageView.loadBanner(url: String?, request: RequestListener<Bitmap>? = null) {
    if (url != null && url.isEmpty()) return
    Glide.with(this)
        .asBitmap()
        .apply(RequestOptions().fitCenter())
        .skipMemoryCache(false)
        .diskCacheStrategy(DiskCacheStrategy.ALL)
        .dontTransform()
        .load(url)
        .listener(request)
        .into(this)
}

fun ImageView.loadFromLocal(resourcesId: Int) {
    Glide.with(this)
        .asBitmap()
        .apply(RequestOptions().fitCenter())
        .skipMemoryCache(false)
        .diskCacheStrategy(DiskCacheStrategy.ALL)
        .dontTransform()
        .load(resourcesId)
        .error(R.mipmap.ic_launcher)
        .into(this)
}

fun getBitmapFromURL(imageUrl: String?): Bitmap? {
    var bitmap: Bitmap? = null

    try {
        val url = URL(imageUrl)
        val connection = url.openConnection() as HttpURLConnection

        connection.setDoInput(true)
        connection.connect()

        val input = connection.getInputStream()
        bitmap = BitmapFactory.decodeStream(input)
    } catch (e: Exception) {
        e.printStackTrace()
    }

    return bitmap
}

fun CircleImageView?.loadCircleView(url: String?) {
    if (this == null || url != null && url.isEmpty()) return

    Glide.with(this)
        .load(url)
        .into(this)
}