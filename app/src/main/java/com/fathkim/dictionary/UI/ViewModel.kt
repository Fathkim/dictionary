package com.fathkim.dictionary.UI

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.fathkim.dictionary.Api.ApiConfig
import com.fathkim.dictionary.data.ItemResponseItem
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ViewModel : ViewModel() {
     val listUser = MutableLiveData<ArrayList<ItemResponseItem>>()

    fun serchUser(word : String){
        ApiConfig.getApiService().searchWord(word).enqueue(object : Callback<ArrayList<ItemResponseItem>> {
            override fun onResponse(
                call: Call<ArrayList<ItemResponseItem>>,
                response: Response<ArrayList<ItemResponseItem>>
            ) {
                listUser.value = response.body()
            }

            override fun onFailure(call: Call<ArrayList<ItemResponseItem>>, t: Throwable) {
            }

        })
    }

    fun getSearchUser(): LiveData<ArrayList<ItemResponseItem>> = listUser
}