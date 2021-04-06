package com.example.gruppeoppgave

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class customAdapter(private val dataSet: MutableList<Housing>) :
        RecyclerView.Adapter<customAdapter.ViewHolder>() {


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val textView: TextView?
        val image: ImageView ?
        val newimage: Button
        val favourite: Button


        init {

            textView = view.findViewById(R.id.image_textView)
            image = view.findViewById(R.id.main_imageView)
            newimage = view.findViewById(R.id.new_image_button)
            favourite = view.findViewById(R.id.favourite_button)

        }
    }
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.picture_card, viewGroup, false)

        return ViewHolder(view)
    }



}