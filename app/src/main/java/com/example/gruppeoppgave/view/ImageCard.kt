package com.example.gruppeoppgave.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatButton
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.example.gruppeoppgave.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_profile.view.*
import kotlinx.android.synthetic.main.picture_card.*
import kotlinx.android.synthetic.main.picture_card.view.*

class ImageCard(context: Context, attrs: AttributeSet) : FrameLayout(context,attrs) {

    private val imageview: ImageView
    private val favouritesButton: AppCompatButton

    init {
        val view: View = LayoutInflater.from(context).inflate(R.layout.picture_card, this)

        var imageUrl = "https://i.picsum.photos/id/32/4032/3024.jpg?hmac=n7I3OdGszMIwuGcvplNthgBmAxvAZ3rNBBSuDFZaItQ"
        Picasso.get().load(imageUrl).into(main_imageView)

        imageview = main_imageView
        favouritesButton = main_favourite_button as AppCompatButton

    }

    fun setFavoritesButtonClicked(clickListner: OnClickListener) {
        favouritesButton.setOnClickListener(clickListner)
    }



}