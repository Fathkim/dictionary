package com.fathkim.dictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.SearchView
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.fathkim.dictionary.UI.ViewModel
import com.fathkim.dictionary.data.DefinitionsItem
import com.fathkim.dictionary.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val adapterResponse = AdapterResponse()

    private var viewModel : ViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[ViewModel::class.java]

        viewModel!!.getSearchUser().observe(this){


        }
//        getDataApi(1)

        viewModel!!.listUser.observe(this){
            binding.Book.text = it[0].word
            binding.phonetic.text = it[0].phonetic
            it[0].meanings?.get(0)?.definitions?.let { it1 -> setupRecyclerView(it1 as List<DefinitionsItem>) }
        }


        gerSearch()
    }

    private fun setupRecyclerView(definitions: List<DefinitionsItem>) {
        binding.rvDefinition.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            val mAdapter = AdapterResponse()
            adapter = mAdapter
            mAdapter.setResponse(definitions)
        }
    }


    private fun gerSearch() {
        binding.Search.setOnQueryTextListener(object : SearchView.OnQueryTextListener{

            override fun onQueryTextSubmit(query: String?): Boolean {
                query?.let {
                    viewModel?.serchUser(it.toString())
                }
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return false
            }

        })
    }







}