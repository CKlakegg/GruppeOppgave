package com.example.gruppeoppgave.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatImageButton
import androidx.core.content.ContextCompat
import com.example.gruppeoppgave.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.picture_card.view.*

class ImageCard(context: Context, attrs: AttributeSet?) : FrameLayout(context,attrs) {

    private val imageView: ImageView
    private val favouritesButton: AppCompatImageButton

    init {
        val view: View = LayoutInflater.from(context).inflate(R.layout.picture_card, this)

        imageView = main_imageView
        favouritesButton = main_favourite_button
    }

    fun setImage(imageUrl: String){
        Picasso.get().load(imageUrl).into(main_imageView)
    }

    fun setFavorite(isFavorite: Boolean) {
        if (isFavorite) {
            favouritesButton.setImageDrawable(
                ContextCompat.getDrawable(
                    context,
                    R.drawable.favorite_full
                )
            )
        } else {
            favouritesButton.setImageDrawable(
                ContextCompat.getDrawable(
                    context,
                    R.drawable.favorite_empty
                )
            )
        }
    }
}