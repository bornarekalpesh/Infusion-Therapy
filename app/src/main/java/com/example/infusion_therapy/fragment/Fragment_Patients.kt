package com.example.infusion_therapy.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.infusion_therapy.R
import com.example.infusion_therapy.activity.UpdatePatientDetailsActivity
import com.example.infusion_therapy.databinding.FragmentPatientsBinding

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
            binding.layMaterialCard.setOnClickListener {
                val intent = Intent (getActivity(), UpdatePatientDetailsActivity::class.java)
                getActivity()?.startActivity(intent)
            }
    }
}