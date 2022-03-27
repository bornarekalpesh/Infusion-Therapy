package com.example.infusion_therapy.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.infusion_therapy.R
import com.example.infusion_therapy.databinding.ActivityLoginBinding
import com.example.infusion_therapy.utils.Constants

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
            if(Constants.isOnline(it.context)){
                binding!!.layLogin.visibility=View.VISIBLE;
                binding!!.layForgotPassword.visibility=View.GONE
            }
            else{
                Constants.showMessage(it.context,it.context.getString(R.string.msg_no_internet))
            }

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