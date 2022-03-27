package com.example.infusion_therapy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.databinding.DataBindingUtil
import com.example.infusion_therapy.ui.activity.LoginActivity
import com.example.infusion_therapy.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    var binding:ActivitySplashBinding?=null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, 5000)

    }
}