package com.example.test.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.lifecycle.viewmodel.CreationExtras
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.test.R
import com.example.test.databinding.ActivityMainBinding
import com.example.test.presentation.adapters.CocktailsAdapter
import com.example.test.presentation.adapters.CollapsedImageAdapter
import com.example.test.presentation.adapters.SortMenuAdapter
import com.example.test.repository.CocktailsRepository
import com.example.test.usecases.GetCocktailUseCase
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    private val vb by viewBinding(ActivityMainBinding::bind)

    private val adapterCocktails = CocktailsAdapter()
    private val adapterSortList = SortMenuAdapter()
    private val adapterImages = CollapsedImageAdapter()

    private val useCase = GetCocktailUseCase(repository = CocktailsRepository())
    private val factory = MainViewModel.MainViewModelFactory(useCase)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProvider(this, factory)[MainViewModel::class.java]

        vb.recyclerMain.adapter = adapterCocktails
        vb.sortRecycler.adapter = adapterSortList
        vb.imageRecycler.adapter = adapterImages

        viewModel.load()

        viewModel.state.observe(this) { state ->
            when (state) {
                is States.Loading -> {
                    vb.progressBar.isVisible = true
                }
                is States.Content -> {
                    vb.recyclerMain.isVisible = true
                    vb.progressBar.isVisible = false
                    adapterCocktails.showList(state.drinkList)
                    adapterImages.showImages(state.drinkList)
                    adapterSortList.showSort(state.sortList)
                }
                is States.Error -> {
                    vb.recyclerMain.isVisible = false
                    vb.progressBar.isVisible = false
                    vb.errorText.isVisible = true
                    vb.errorText.text = state.message
                    vb.recyclerMain.isVisible = false
                    vb.imageRecycler.isVisible = false
                    vb.sortRecycler.isVisible = false
                }
            }
        }

    }

}