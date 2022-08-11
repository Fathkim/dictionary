package com.fathkim.dictionary.data

import com.google.gson.annotations.SerializedName

data class License(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("url")
	val url: String? = null
)