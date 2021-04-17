package com.example.gruppeoppgave.ui.favorites

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gruppeoppgave.database.PictureObject
import com.example.gruppeoppgave.R
import com.example.gruppeoppgave.database.AppDatabase
import kotlinx.android.synthetic.main.fragment_favourite.view.*

class FavouriteFragment : Fragment() {

    private lateinit var favouriteViewModel: FavouriteViewModel

    private lateinit var recyclerView: RecyclerView
    private lateinit var favoritesAdapter: FavoritesAdapter
    private lateinit var favoritesLayoutManager: LinearLayoutManager

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        favouriteViewModel =
            ViewModelProvider(this).get(FavouriteViewModel::class.java)

        val view = inflater.inflate(R.layout.fragment_favourite, container, false)

        recyclerView = view.picture_RecyclerView

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bindObservers()
        initRecyclerView()
    }

    private fun bindObservers() {
        favouriteViewModel.favoriteListLiveData.observe(viewLifecycleOwner) { list ->
            favoritesAdapter.updateData(list)
        }
    }

    private fun initRecyclerView(){

        favoritesAdapter = FavoritesAdapter()
        recyclerView.adapter = favoritesAdapter

        favoritesLayoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = favoritesLayoutManager

        val database = AppDatabase.getDatabase(requireContext())
        favouriteViewModel.fetchAllFavorites(database)

    }
}