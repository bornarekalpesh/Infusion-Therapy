package com.example.infusion_therapy.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.infusion_therapy.repository.RepositoryFragmentPatientList

class Fragment_Patient_ViewModelFactory(private val repositoryFragmentPatientList: RepositoryFragmentPatientList):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return Fragment_Patient_ViewModel(repositoryFragmentPatientList) as T
    }
}