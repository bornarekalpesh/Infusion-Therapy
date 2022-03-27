package com.example.infusion_therapy.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.infusion_therapy.model.patientList.ModelPatientListResponse
import com.example.infusion_therapy.network.ApiHelper
import com.example.infusion_therapy.network.ApiInterface

class RepositoryFragmentPatientList(private val apiInterface: ApiInterface) {
    var mutableLiveData= MutableLiveData<ModelPatientListResponse>()
    val liveData: LiveData<ModelPatientListResponse>
        get()=mutableLiveData
    suspend fun getPatientList(Start:String,PageSize:String,SortCol:String,SearchKey:String){
       val response=apiInterface.apiGetPatientList(Start,PageSize,SortCol,SearchKey)
        if(response.isSuccessful){
            Log.e("PatientRepository",""+response.body())
            mutableLiveData.postValue(response.body())
        }
        else{
            Log.e("PatientRepository",""+response.body())
        }
    }

}