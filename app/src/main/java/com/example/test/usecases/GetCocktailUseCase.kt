package com.example.test.usecases

import com.example.test.api.Drink
import com.example.test.repository.CocktailsRepository

class GetCocktailUseCase (private val repository: CocktailsRepository) {

    operator fun invoke (onSuccess: (List<Drink>) -> Unit, onError: (String) -> Unit) = repository.sendRequest(onSuccess, onError)

}