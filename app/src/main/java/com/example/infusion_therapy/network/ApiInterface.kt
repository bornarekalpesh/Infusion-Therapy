package com.example.infusion_therapy.network

import com.example.infusion_therapy.model.patientDetails.RequestGetPatientDetails
import com.example.infusion_therapy.model.patientDetails.ResponseGetPatientDetails
import com.example.infusion_therapy.model.patientList.ModelPatientListResponse
import com.example.infusion_therapy.model.patientList.PatientRequest
import retrofit2.Response
import retrofit2.http.*
import retrofit2.Call

interface ApiInterface {

    @POST("/api/patient/list")
    suspend fun apiGetPatientList(
        @Header("Authorization") authHeader:String,
        @Body patientRequest: PatientRequest):Response<ModelPatientListResponse>

    @POST("/api/patient/get")
    fun getPatientDetails(
        @Header("Authorization") authHeader:String,
        @Body requestGetPatientDetails: RequestGetPatientDetails
    ): Call<ResponseGetPatientDetails>

}