package com.example.infusion_therapy.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.infusion_therapy.model.patientDetails.RequestGetPatientDetails
import com.example.infusion_therapy.model.patientDetails.ResponseGetPatientDetails
import com.example.infusion_therapy.model.patientList.ModelPatientListResponse
import com.example.infusion_therapy.model.patientList.PatientRequest
import com.example.infusion_therapy.network.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RepositoryFragmentPatientList(private val apiInterface: ApiInterface) {
    var mutableLiveData= MutableLiveData<ModelPatientListResponse>()
    val liveData: LiveData<ModelPatientListResponse>
        get()=mutableLiveData
    suspend fun getPatientList(Start:String,PageSize:String,SortCol:String,SearchKey:String){
       val response=apiInterface.apiGetPatientList("",PatientRequest(-1,SearchKey,SortCol,0))
        if(response.isSuccessful){
            Log.e("Success",""+response)
            mutableLiveData.postValue(response.body())
        }
        else{
            Log.e("PatientRepository Failure",""+response)
        }
    }


    var patientDetailsMutableLiveData=MutableLiveData<ResponseGetPatientDetails>()
    val patientDetailsliveData: LiveData<ResponseGetPatientDetails>
        get()=patientDetailsMutableLiveData

    suspend fun getPatientDetails(patienId:Int){
        var ResponseGetPatientDetails: Call<ResponseGetPatientDetails> = apiInterface.getPatientDetails(
            "", RequestGetPatientDetails(patienId)
        )

        ResponseGetPatientDetails.enqueue(object : Callback<ResponseGetPatientDetails> {
            override fun onResponse(call: Call<ResponseGetPatientDetails>, response: Response<ResponseGetPatientDetails>) {
                if (response.isSuccessful) {
                    patientDetailsMutableLiveData.postValue(response.body())
                }else{

                }
            }
            override fun onFailure(call: Call<ResponseGetPatientDetails>, t: Throwable) {
                Log.e("Make Appointment",""+t.toString())
            }
        })
    }


}