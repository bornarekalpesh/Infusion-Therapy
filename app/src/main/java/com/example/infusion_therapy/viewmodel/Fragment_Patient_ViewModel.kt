package com.example.infusion_therapy.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.infusion_therapy.model.patientList.ModelPatientListResponse
import com.example.infusion_therapy.repository.RepositoryFragmentPatientList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class Fragment_Patient_ViewModel(
    private var repositoryFragmentPatientList: RepositoryFragmentPatientList
):ViewModel() {
    init {
        GlobalScope.launch(Dispatchers.Main) {
            repositoryFragmentPatientList.getPatientList("0","-1","null","")
        }
    }
    val response:LiveData<ModelPatientListResponse>
        get()=repositoryFragmentPatientList.liveData
}