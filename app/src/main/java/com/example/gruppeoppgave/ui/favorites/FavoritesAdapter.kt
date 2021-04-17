package com.example.gruppeoppgave.ui.favorites

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gruppeoppgave.database.PictureObject
import com.example.gruppeoppgave.view.ImageFavoriteCard
import kotlinx.android.synthetic.main.picture_favourtie_card.view.*
class FavoritesAdapter : RecyclerView.Adapter<FavoritesAdapter.FavoritesViewHolder>() {
    private var dataSet: List<PictureObject> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoritesViewHolder {
        val view = ImageFavoriteCard(parent.context, null)

        view.layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )

        return FavoritesViewHolder(view)
    }

    override fun onBindViewHolder(holder: FavoritesViewHolder, position: Int) {
        val pictureObject = dataSet[position]

        holder.favoriteView.setTitle(pictureObject.author)
        holder.favoriteView.setImage(pictureObject.download_url)

    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    fun updateData(list: List<PictureObject>){
        dataSet = list
        notifyDataSetChanged()
    }

    inner class FavoritesViewHolder(val favoriteView: ImageFavoriteCard): RecyclerView.ViewHolder(favoriteView)
}

