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

        // https://picsum.photos/v2/list?page=2&limit=100 for list with objects
        val url = "https://picsum.photos/id/32/info"

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


        //TODO: Gi svar tilbake til fragmentet med Pictures aktivitet - hvis det gikk bra
    }

}