package com.fathkim.dictionary.data

import com.google.gson.annotations.SerializedName

data class MeaningsItem(

	@field:SerializedName("synonyms")
	val synonyms: List<String?>? = null,

	@field:SerializedName("partOfSpeech")
	val partOfSpeech: String? = null,

	@field:SerializedName("antonyms")
	val antonyms: List<Any?>? = null,

	@field:SerializedName("definitions")
	val definitions: List<DefinitionsItem?>? = null
)