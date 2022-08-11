package com.fathkim.dictionary

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fathkim.dictionary.data.DefinitionsItem
import com.fathkim.dictionary.data.ItemResponse
import com.fathkim.dictionary.databinding.ItemResponseBinding

class AdapterResponse: RecyclerView.Adapter<AdapterResponse.ResponseViewHolder>() {

    private val listResponse = mutableListOf<DefinitionsItem>()

    class ResponseViewHolder(val itemResponse : ItemResponseBinding): RecyclerView.ViewHolder(itemResponse.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ResponseViewHolder(
        ItemResponseBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ResponseViewHolder, position: Int) {
        holder.itemResponse.apply {
            tvdefinition.text = listResponse[0].definition
        }
    }

    override fun getItemCount() = listResponse.size

    fun setResponse(response: List<DefinitionsItem>){
        this.listResponse.clear()
        this.listResponse.addAll(response)
    }

}