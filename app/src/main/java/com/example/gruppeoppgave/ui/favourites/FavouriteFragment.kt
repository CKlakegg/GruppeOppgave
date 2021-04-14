package com.example.gruppeoppgave.ui.favourites

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.gruppeoppgave.R
import com.example.gruppeoppgave.view.ImageCard

class FavouriteFragment : Fragment() {

    private lateinit var favouriteViewModel: FavouriteViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        favouriteViewModel = ViewModelProvider(this).get(FavouriteViewModel::class.java)

        val view = inflater.inflate(R.layout.fragment_favourite, container, false)

        return view
    }
}