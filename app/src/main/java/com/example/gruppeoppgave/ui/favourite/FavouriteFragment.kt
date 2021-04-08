package com.example.gruppeoppgave.ui.favourite

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.gruppeoppgave.R
import com.example.gruppeoppgave.view.DoCard

class FavouriteFragment : Fragment() {

    private lateinit var favouriteViewModel: FavouriteViewModel

    private lateinit var picture_card: DoCard

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        favouriteViewModel = ViewModelProvider(this).get(FavouriteViewModel::class.java)

        val root = inflater.inflate(R.layout.fragment_favourite, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        picture_card.setFavoritesButtonClicked {
            Toast.makeText(context, "Favourite clicked", Toast.LENGTH_LONG).show()

        }

    }
}