package com.example.infusion_therapy.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.infusion_therapy.model.patientList.ModelPatientListResponse
import com.example.infusion_therapy.repository.RepositoryFragmentPatientList
import com.example.infusion_therapy.utils.CustomProgress
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class Fragment_Patient_ViewModel(
    private var repositoryFragmentPatientList: RepositoryFragmentPatientList
):ViewModel() {
    fun getPatietList(start:String,PageSize:String,sortCol:String,search:String){
        viewModelScope.launch {
            repositoryFragmentPatientList.getPatientList(start,PageSize,sortCol,search)
        }
    }

    val response:LiveData<ModelPatientListResponse>
        get()=repositoryFragmentPatientList.liveData
}