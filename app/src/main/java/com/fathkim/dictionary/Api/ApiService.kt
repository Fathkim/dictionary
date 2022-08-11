package com.fathkim.dictionary.Api

import com.fathkim.dictionary.data.ItemResponseItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("{word}")
    fun searchWord(@Path("word") word: String) : Call<ArrayList<ItemResponseItem>>
}