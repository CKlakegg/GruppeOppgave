package com.example.gruppeoppgave.ui.favorites


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.gruppeoppgave.database.AppDatabase
import com.example.gruppeoppgave.database.PictureObject
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import okhttp3.Dispatcher

class FavouriteViewModel : ViewModel() {
    val favoriteListLiveData: MutableLiveData<List<PictureObject>> = MutableLiveData()

    fun fetchAllFavorites(database: AppDatabase) {
        CoroutineScope(Dispatchers.IO).launch {
            val picturesDAO = database.picturesDAO()
            val list = picturesDAO.getAllItems()

            favoriteListLiveData.postValue(list)
        }
    }

    fun deleteFavorite(database: AppDatabase, favoriteToDelete: PictureObject){
        CoroutineScope(Dispatchers.IO).launch {
            val picturesDAO = database.picturesDAO()
            picturesDAO.deleteItem(favoriteToDelete)

            fetchAllFavorites(database)
        }
    }
}
