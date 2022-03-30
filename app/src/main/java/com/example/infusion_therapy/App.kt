package com.example.infusion_therapy

import android.app.Application
import com.example.infusion_therapy.network.ApiHelper
import com.example.infusion_therapy.network.ApiInterface
import com.example.infusion_therapy.repository.RepositoryFragmentPatientList
import com.example.infusion_therapy.utils.Constants
import com.example.infusion_therapy.utils.CustomProgress

class App:Application() {
    lateinit var repositoryFragmentPatientList: RepositoryFragmentPatientList
    lateinit var customProgress: CustomProgress

    override fun onCreate() {
        super.onCreate()
        initialer()

    }

    private fun initialer() {
        val apiHelpers=ApiHelper.getInstance().create(ApiInterface::class.java)
        repositoryFragmentPatientList= RepositoryFragmentPatientList(apiHelpers)
        customProgress=CustomProgress.getInstance();
    }
}