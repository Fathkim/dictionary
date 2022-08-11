package com.fathkim.dictionary.data

import com.google.gson.annotations.SerializedName

data class DefinitionsItem(

	@field:SerializedName("synonyms")
	val synonyms: List<Any?>? = null,

	@field:SerializedName("antonyms")
	val antonyms: List<Any?>? = null,

	@field:SerializedName("definition")
	val definition: String? = null,

	@field:SerializedName("example")
	val example: String? = null
)