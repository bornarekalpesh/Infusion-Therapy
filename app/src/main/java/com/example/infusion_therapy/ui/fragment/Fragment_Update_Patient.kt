package com.example.infusion_therapy.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.infusion_therapy.App
import com.example.infusion_therapy.R
import com.example.infusion_therapy.databinding.FragmentUpdatePatientsBinding
import com.example.infusion_therapy.viewmodel.Fragment_PatientUpdate_ViewModelFactory
import com.example.infusion_therapy.viewmodel.Fragment_Patient_UpdateViewModel
import com.example.infusion_therapy.viewmodel.Fragment_Patient_ViewModel
import com.example.infusion_therapy.viewmodel.Fragment_Patient_ViewModelFactory


class Fragment_Update_Patient(
    var patientId:Int
     ) : Fragment() {
    lateinit var viewmodel:Fragment_Patient_UpdateViewModel
    lateinit var binding: FragmentUpdatePatientsBinding
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_update_patients,container,false);
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val repositoryFragmentPatientList=(requireContext().applicationContext as App).repositoryFragmentPatientList

        val progress=(requireContext().applicationContext as App).customProgress
        progress.showProgress(requireContext())
        var viewModel=ViewModelProvider(this,Fragment_PatientUpdate_ViewModelFactory(repositoryFragmentPatientList)).get(
            Fragment_Patient_UpdateViewModel::class.java)
        viewModel.getUserDetails(patientId)

        viewModel.response.observe(requireActivity(), Observer {
            progress.hideProgress()
            binding.patientName.setText(it.data.firstName)
            binding.patientLast.setText(it.data.lastName)
            binding.tvDatePicker.setText(it.data.dob)
            binding.patientEmail.setText(it.data.email)
            binding.patientMobile.setText(it.data.phone)
            binding.patientAddress.setText(it.data.address)
            if(it.data.isKidneyFailure){
                binding.rdKfY.isChecked=true
            }else{
                binding.rdKfN.isChecked=true
            }

            if(it.data.isCHF){
                binding.rdChfY.isChecked=true
            }else{
                binding.rdChfN.isChecked=true
            }



            if(it.data.isCKD){
                binding.rdCkdY.isChecked=true
            }else{
                binding.rdCkdN.isChecked=true
            }

            if(it.data.isOnDialysis){
             binding.rdCodY.isChecked=true
            }else{
                binding.rdCodN.isChecked=true
            }
        })

    }
}