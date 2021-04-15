package com.example.gruppeoppgave.ui.favourites

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.gruppeoppgave.R
import com.example.gruppeoppgave.view.ImageCard
import com.example.gruppeoppgave.view.ImageFavouriteCard
import kotlinx.android.synthetic.main.fragment_favourite.view.*
import kotlinx.android.synthetic.main.fragment_profile.view.*

class FavouriteFragment : Fragment() {

    private lateinit var favouriteViewModel: FavouriteViewModel
    private lateinit var favouritePictureCard: ImageFavouriteCard

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        favouriteViewModel = ViewModelProvider(this).get(FavouriteViewModel::class.java)

        val view = inflater.inflate(R.layout.fragment_favourite, container, false)

        favouritePictureCard.picture_RecyclerView

        return view
    }
}