package com.example.gruppeoppgave.ui.pictures

import androidx.lifecycle.ViewModel
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.StringRequest
import com.example.gruppeoppgave.database.AppDatabase
import com.example.gruppeoppgave.database.PictureObject
import com.google.gson.Gson
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

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

    fun saveFavorite(database: AppDatabase, favorite: PictureObject) {
        CoroutineScope(Dispatchers.IO).launch {
            val dao = database.picturesDAO()
            dao.addItem(favorite)
        }


    }

}