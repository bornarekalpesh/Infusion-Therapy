package com.example.infusion_therapy.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.infusion_therapy.R
import com.example.infusion_therapy.ui.adapters.TabbedAdapter
import com.example.infusion_therapy.databinding.ActivityUpdatePatientDetailsBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.google.android.material.tabs.TabLayout.TabLayoutOnPageChangeListener

class UpdatePatientDetailsActivity : AppCompatActivity() {

    var binding:ActivityUpdatePatientDetailsBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_update_patient_details)

        binding!!.layTabLayout.addTab(binding!!.layTabLayout.newTab().setText("Patient Information").setIcon(R.drawable.ic_round_eliipse))
        binding!!.layTabLayout.addTab(binding!!.layTabLayout.newTab().setText("Term & Conditions").setIcon(R.drawable.ic_round_eliipse))
        binding!!.layTabLayout.tabGravity=TabLayout.GRAVITY_FILL

        val adapter = TabbedAdapter(this, supportFragmentManager, binding!!.layTabLayout.getTabCount())

        binding!!.layTabLayoutViewPager.setAdapter(adapter)

        binding!!.layTabLayoutViewPager.addOnPageChangeListener(TabLayoutOnPageChangeListener(binding!!.layTabLayout))

        binding!!.layTabLayout.addOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                binding!!.layTabLayoutViewPager.setCurrentItem(tab.position)
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })

    }
}