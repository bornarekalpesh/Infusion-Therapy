package com.example.infusion_therapy.model.patientList

data class ModelPatientListResponse(
    val `data`: List<Data>,
    val draw: String,
    val listCounts: Any,
    val message: String,
    val recordsFiltered: Int,
    val recordsTotal: Int,
    val status: Boolean
)