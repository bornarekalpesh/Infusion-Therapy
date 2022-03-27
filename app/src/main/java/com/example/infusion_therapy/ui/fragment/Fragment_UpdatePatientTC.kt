package com.example.infusion_therapy.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import com.example.infusion_therapy.R
import com.example.infusion_therapy.databinding.FragmentUpdatePatientTCBinding

class Fragment_UpdatePatientTC : Fragment() {

    lateinit var binding:FragmentUpdatePatientTCBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= DataBindingUtil.inflate(
            inflater, R.layout.fragment_update_patient_t_c, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.layTcTitle.setOnClickListener {
            if(binding.layTcDetails.isVisible){
                binding.layTcDetails.visibility=View.GONE
            }
            else{
                binding.layTcDetails.visibility=View.VISIBLE
            }
        }
    }
}