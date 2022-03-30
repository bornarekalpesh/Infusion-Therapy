package com.example.infusion_therapy.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.infusion_therapy.App
import com.example.infusion_therapy.R
import com.example.infusion_therapy.databinding.FragmentPatientsBinding
import com.example.infusion_therapy.ui.adapters.AdpaterPatientList
import com.example.infusion_therapy.utils.CustomProgress
import com.example.infusion_therapy.viewmodel.Fragment_Patient_ViewModel
import com.example.infusion_therapy.viewmodel.Fragment_Patient_ViewModelFactory

class Fragment_Patients:Fragment() {

    lateinit var binding: FragmentPatientsBinding
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding= DataBindingUtil.inflate(
            inflater, R.layout.fragment_patients, container, false)

        return binding.root;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val repositoryFragmentPatientList=(requireContext().applicationContext as App).repositoryFragmentPatientList

        var viewModel=ViewModelProvider(this,Fragment_Patient_ViewModelFactory(repositoryFragmentPatientList)).get(Fragment_Patient_ViewModel::class.java)
        viewModel.getPatietList("0","-1","","")

        CustomProgress.getInstance().showProgress(requireContext())

        viewModel.response.observe(requireActivity(), Observer {
            var adapterPatientsList=AdpaterPatientList(it)
            binding.rvPatientlist.layoutManager=LinearLayoutManager(activity, LinearLayoutManager.VERTICAL ,false)
            binding.rvPatientlist.adapter=adapterPatientsList
            CustomProgress.getInstance().hideProgress()
        })

    }
}