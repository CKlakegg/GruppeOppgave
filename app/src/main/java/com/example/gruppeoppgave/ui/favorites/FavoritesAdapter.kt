package com.example.gruppeoppgave.ui.favorites

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gruppeoppgave.PictureObject
import com.example.gruppeoppgave.view.ImageFavoriteCard
import kotlinx.android.synthetic.main.fragment_profile.view.*
import kotlinx.android.synthetic.main.picture_favourtie_card.view.*

class FavoritesAdapter(
    private var dataSet: List<PictureObject> = listOf()
) : RecyclerView.Adapter<FavoritesAdapter.FavoritesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoritesViewHolder {
        val view = ImageFavoriteCard(parent.context, null)

        view.layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )

        return FavoritesViewHolder(view)
    }

    override fun onBindViewHolder(holder: FavoritesViewHolder, position: Int) {
        val PictureObject = dataSet[position]

        holder.favoriteView.setTitle(PictureObject.author)
        holder.favoriteView.setImage(PictureObject.download_url)


        holder.favoriteView.favourite_button.setOnClickListener {
            //TODO: Remove favorite
        }

    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    inner class FavoritesViewHolder(val favoriteView: ImageFavoriteCard): RecyclerView.ViewHolder(favoriteView)
}
