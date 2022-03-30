package com.example.infusion_therapy.model.patientDetails

data class ResponseGetPatientDetails(
    val `data`: Data,
    val message: String,
    val status: Boolean,
    val totalRecords: Int
)