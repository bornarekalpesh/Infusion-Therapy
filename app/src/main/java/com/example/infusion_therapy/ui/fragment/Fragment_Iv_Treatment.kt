package com.example.infusion_therapy.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.infusion_therapy.R
import com.example.infusion_therapy.databinding.FragmentIvTreatmentsBinding

class Fragment_Iv_Treatment:Fragment() {
    lateinit var binding:FragmentIvTreatmentsBinding
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_iv_treatments,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.layDemoIvList.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_fragment_Iv_Treatment_to_fragment_Update_IV_Patient)
        }

    }

}