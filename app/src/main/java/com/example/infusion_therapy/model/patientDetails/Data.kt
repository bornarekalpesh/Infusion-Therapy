package com.example.infusion_therapy.model.patientDetails

data class Data(
    val address: String,
    val createdBy: String,
    val dob: String,
    val email: String,
    val encrypT_KEY_ID: Any,
    val firstName: String,
    val isCHF: Boolean,
    val isCKD: Boolean,
    val isKidneyFailure: Boolean,
    val isOnDialysis: Boolean,
    val lastName: String,
    val patientId: Int,
    val phone: String,
    val signature: String,
    val updatedBy: String
)