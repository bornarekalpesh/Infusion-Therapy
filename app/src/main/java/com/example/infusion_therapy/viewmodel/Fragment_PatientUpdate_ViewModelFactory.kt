package com.example.infusion_therapy.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.infusion_therapy.repository.RepositoryFragmentPatientList

class Fragment_PatientUpdate_ViewModelFactory(private val repositoryFragmentPatientList: RepositoryFragmentPatientList):
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return Fragment_Patient_UpdateViewModel(repositoryFragmentPatientList) as T
    }
}