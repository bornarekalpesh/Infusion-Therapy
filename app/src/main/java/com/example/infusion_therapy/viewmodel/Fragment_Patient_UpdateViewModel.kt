package com.example.infusion_therapy.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.infusion_therapy.model.patientDetails.ResponseGetPatientDetails
import com.example.infusion_therapy.model.patientList.ModelPatientListResponse
import com.example.infusion_therapy.repository.RepositoryFragmentPatientList
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import okhttp3.Dispatcher

class Fragment_Patient_UpdateViewModel(
    private var repositoryFragmentPatientList: RepositoryFragmentPatientList
     ): ViewModel() {

         fun getUserDetails(patientId:Int){
            viewModelScope.launch{
                repositoryFragmentPatientList.getPatientDetails(patientId)
            }
         }
        val response: LiveData<ResponseGetPatientDetails>
        get()=repositoryFragmentPatientList.patientDetailsliveData;

}