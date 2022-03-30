package com.example.infusion_therapy.model.patientList

data class PatientRequest(
    val PageSize: Int,
    val SearchKey: String,
    val SortCol: String,
    val start: Int
)