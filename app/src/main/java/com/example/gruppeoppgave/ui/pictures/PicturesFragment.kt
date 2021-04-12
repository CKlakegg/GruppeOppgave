package com.example.gruppeoppgave.ui.pictures

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.gruppeoppgave.R

class PicturesFragment : Fragment() {

    private lateinit var picturesViewModel: PicturesViewModel

    override fun onCreateView(

            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        picturesViewModel =
                ViewModelProvider(this).get(PicturesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_profile, container, false)

        return root
    }
}