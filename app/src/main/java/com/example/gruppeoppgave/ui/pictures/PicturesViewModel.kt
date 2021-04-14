package com.example.gruppeoppgave.ui.pictures

import androidx.lifecycle.ViewModel
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.StringRequest
import com.example.gruppeoppgave.PictureObject
import com.google.gson.Gson
import javax.security.auth.callback.Callback

class HomeViewModel : ViewModel() {
    fun fetchPicturesActivity(requestQueue: RequestQueue, callback: (PictureObject?) -> Unit) {

        val randomPicture = (1..250).random()

        val url = "https://picsum.photos/id/$randomPicture/info"

        val stringRequest = StringRequest(
            Request.Method.GET,
            url,
            { jsonResponse ->
                val convertedObject = Gson().fromJson(jsonResponse, PictureObject::class.java)
                callback(convertedObject)
            },
            { error ->
                callback(null)
            }
        )

        requestQueue.add(stringRequest)
    }

}