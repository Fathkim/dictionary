package com.fathkim.dictionary.data

import com.google.gson.annotations.SerializedName

data class ItemResponse(

	@field:SerializedName("ItemResponse")
	val itemResponse: List<ItemResponseItem?>? = null
)