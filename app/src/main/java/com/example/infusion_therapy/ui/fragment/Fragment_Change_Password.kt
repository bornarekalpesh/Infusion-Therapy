package com.example.infusion_therapy.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.infusion_therapy.R
import com.example.infusion_therapy.databinding.FragmentChangePasswordBinding

class Fragment_Change_Password: Fragment() {
    lateinit var binding:FragmentChangePasswordBinding
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding= DataBindingUtil.inflate(
            inflater, R.layout.fragment_change_password, container, false);

       return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvBackToLogin.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_fragment_Change_Password_to_fragment_Profile)
        }
    }
}