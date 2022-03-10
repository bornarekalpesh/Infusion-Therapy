package com.example.infusion_therapy.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.infusion_therapy.R
import com.example.infusion_therapy.databinding.FragmentEditProfileBinding
import com.example.infusion_therapy.databinding.FragmentProfileBinding
import com.google.android.material.datepicker.MaterialDatePicker

class Fragment_Edit_Profile: Fragment() {

    lateinit var  binding: FragmentEditProfileBinding
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding= DataBindingUtil.inflate(
            inflater, R.layout.fragment_edit_profile, container, false);

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvDatePicker.setOnClickListener {
            val datePicker =
                MaterialDatePicker.Builder.datePicker()
                    .setTitleText("Select date")
                    .build()
            datePicker.show(requireActivity().supportFragmentManager,"")
        }

        binding.tvBackToLogin.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_fragment_Edit_Profile_to_fragment_Profile)
        }
    }
}