package com.example.infusion_therapy.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.infusion_therapy.R
import com.example.infusion_therapy.databinding.FragmentProfileBinding

class Fragment_Profile:Fragment() {

    lateinit var  binding: FragmentProfileBinding
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding= DataBindingUtil.inflate(
            inflater, R.layout.fragment_profile, container, false);

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvEditProfile.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_fragment_Profile_to_fragment_Edit_Profile)
        }

        binding.tvChangePassword.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_fragment_Profile_to_fragment_Change_Password)
        }
    }


}