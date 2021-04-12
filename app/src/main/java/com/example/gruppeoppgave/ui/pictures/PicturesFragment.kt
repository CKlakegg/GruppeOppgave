package com.example.gruppeoppgave.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.gruppeoppgave.R
import com.example.gruppeoppgave.ui.pictures.PicturesViewModel
import com.example.gruppeoppgave.view.DoCard

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: PicturesViewModel


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProvider(this).get(PicturesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_profile, container, false)



        return root

    }

}