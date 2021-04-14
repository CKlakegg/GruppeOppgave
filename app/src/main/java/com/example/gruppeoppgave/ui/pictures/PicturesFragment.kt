package com.example.gruppeoppgave.ui.pictures

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.android.volley.toolbox.Volley
import com.example.gruppeoppgave.PictureObject
import com.example.gruppeoppgave.R
import com.example.gruppeoppgave.ui.pictures.HomeViewModel
import com.example.gruppeoppgave.view.ImageCard
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_profile.*
import kotlinx.android.synthetic.main.fragment_profile.view.*
import kotlinx.android.synthetic.main.picture_card.*
import kotlinx.android.synthetic.main.picture_card.view.*

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var pictureCard: ImageCard


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProvider(this).get(HomeViewModel::class.java)
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        pictureCard = view.card_view_display

        return view
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

        val requestQueue = Volley.newRequestQueue(context)
        homeViewModel.fetchPicturesActivity(requestQueue) { PictureObject ->
            if (PictureObject != null){

                author_textView.text = PictureObject.author

                pictureCard.setImage(PictureObject.download_url)



                } else {
                    Toast.makeText(context,"It's not you, it's us!", Toast.LENGTH_SHORT).show()
            }
            }
        }
    }
