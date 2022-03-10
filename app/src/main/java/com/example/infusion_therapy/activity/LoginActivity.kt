package com.example.infusion_therapy.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.infusion_therapy.R
import com.example.infusion_therapy.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    var binding:ActivityLoginBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_login)
        binding?.tvForgetPassword?.setOnClickListener {
            binding!!.layLogin.visibility=View.GONE;
            binding!!.layForgotPassword.visibility=View.VISIBLE
        }

        binding?.tvBackToLogin?.setOnClickListener {
            binding!!.layLogin.visibility=View.VISIBLE;
            binding!!.layForgotPassword.visibility=View.GONE
        }

        binding?.btnResetPassword?.setOnClickListener {
            binding!!.layForgotPassword.visibility=View.GONE
            binding!!.layResetPassword.visibility=View.VISIBLE
        }

        binding?.btnSignIn?.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }

    }
}