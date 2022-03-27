package com.example.infusion_therapy.network

import com.example.infusion_therapy.model.patientList.ModelPatientListResponse
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiInterface {
    @FormUrlEncoded
    @POST("/api/patient/list")
    suspend fun apiGetPatientList(
        @Field("Start") Start: String,
        @Field("PageSize") PageSize: String,
        @Field("SortCol") SortCol: String,
        @Field("SearchKey") SearchKey: String):Response<ModelPatientListResponse>
}