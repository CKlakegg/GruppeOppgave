package com.example.gruppeoppgave.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatButton
import androidx.cardview.widget.CardView
import com.example.gruppeoppgave.R
import kotlinx.android.synthetic.main.picture_card.view.*

class ImageCard(context: Context, attrs: AttributeSet) : CardView(context,attrs) {

    private val imageview: ImageView
    private val favouritesButton: AppCompatButton


    init {
        val view: View = LayoutInflater.from(context).inflate(R.layout.picture_card, this)

        imageview= main_imageView
        favouritesButton= main_favourite_button

    }

    fun setFavoritesButtonClicked(clickListener: () -> Unit) {
        favouritesButton.setOnClickListener {
            clickListener()
        }
    }


}