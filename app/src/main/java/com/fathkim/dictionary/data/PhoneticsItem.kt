package com.fathkim.dictionary.data

import com.google.gson.annotations.SerializedName

data class PhoneticsItem(

	@field:SerializedName("sourceUrl")
	val sourceUrl: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("audio")
	val audio: String? = null,

	@field:SerializedName("license")
	val license: License? = null
)