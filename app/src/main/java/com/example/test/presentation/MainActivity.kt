package com.example.test.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModelProvider
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.test.R
import com.example.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val vb by viewBinding ( ActivityMainBinding::bind )

    private val adapterCocktails = CocktailsAdapter()
    private val adapterSortList = SortMenuAdapter()
    private val adapterImages = CollapsedImageAdapter()

    private val viewModel = ViewModelProvider.NewInstanceFactory().create(MainViewModel::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vb.recyclerMain.adapter = adapterCocktails
        vb.sortRecycler.adapter = adapterSortList
        vb.imageRecycler.adapter = adapterImages

        viewModel.load()

        viewModel.state.observe(this){state ->
            when(state){
                is States.Content -> {
                    vb.recyclerMain.isVisible = true
                    adapterCocktails.showList(state.drinkList)
                    adapterImages.showImages(state.drinkList)
                    adapterSortList.showSort(state.sortList)
                }
                is States.Error -> {
                    Log.d("Error", " Something wrong!")
                }
            }
        }

    }

}