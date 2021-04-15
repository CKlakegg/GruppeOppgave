package com.example.gruppeoppgave.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatButton
import com.example.gruppeoppgave.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.picture_card.view.*
import kotlinx.android.synthetic.main.picture_favourtie_card.view.*

class ImageFavoriteCard(context: Context, attrs: AttributeSet?) : FrameLayout(context,attrs) {
    fun setTitle(author: String) {
            author_favorite_textView.text = "$author"

    }

    fun setImage(imageUrl: String) {
        Picasso.get().load(imageUrl).into(imageView_favourites)

    }

    val imageFavouriteview: ImageView
     val favFavouriteButton: AppCompatButton

    init {

        val view: View = LayoutInflater.from(context).inflate(R.layout.picture_favourtie_card, this)

        imageFavouriteview = imageView_favourites
        favFavouriteButton = favourite_button

    }

}