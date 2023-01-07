package com.example.bookapp.presentation.screens.jetpack

import androidx.lifecycle.ViewModel
import com.example.bookapp.domain.use_cases.UseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class JetpackViewModel @Inject constructor(
    useCases: UseCases
) : ViewModel() {
    val getAllJetpacks = useCases.getAllJetpacksUseCase()
}