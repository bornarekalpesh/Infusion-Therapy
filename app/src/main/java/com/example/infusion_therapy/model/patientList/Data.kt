package com.example.infusion_therapy.model.patientList

data class Data(
    val active: Boolean,
    val deleted: Boolean,
    val dob: String,
    val email: String,
    val fullName: String,
    val patientId: Int,
    val phone: Any,
    val srNo: Int
)