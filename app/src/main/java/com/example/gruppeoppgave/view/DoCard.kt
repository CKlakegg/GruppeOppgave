package com.example.gruppeoppgave.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import androidx.cardview.widget.CardView
import com.example.gruppeoppgave.R
import java.util.jar.Attributes

class DoCard(context: Context, attrs: Attributes): CardView(context, attrs) {

init {
    val view: View = LayoutInflater.from(context).inflate(R.layout.picture_card,this)

}
}