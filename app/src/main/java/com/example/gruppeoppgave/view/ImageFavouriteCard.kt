package com.example.gruppeoppgave.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import com.example.gruppeoppgave.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.picture_favourtie_card.view.*

class ImageFavoriteCard(context: Context, attrs: AttributeSet?) : FrameLayout(context,attrs) {

    private val favoriteAuthor: TextView
    private val imageFavourite: ImageView
    private val favFavouriteButton: AppCompatButton

    fun setTitle(author: String) {
            author_favorite_textView.text = "$author"
    }

    fun setImage(imageUrl: String) {
        Picasso.get().load(imageUrl).into(imageView_favourites)
    }

    init {

        val view: View = LayoutInflater.from(context).inflate(R.layout.picture_favourtie_card, this)

        imageFavourite = imageView_favourites
        favFavouriteButton = favourite_button
        favoriteAuthor = author_favorite_textView
    }
}