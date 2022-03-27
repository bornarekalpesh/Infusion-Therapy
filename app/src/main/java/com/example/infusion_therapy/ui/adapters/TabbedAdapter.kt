package com.example.infusion_therapy.ui.adapters
import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.infusion_therapy.ui.fragment.Fragment_UpdatePatientTC
import com.example.infusion_therapy.ui.fragment.Fragment_Update_Patient


class TabbedAdapter(private val myContext: Context, fm: FragmentManager?, var totalTabs: Int) :
    FragmentPagerAdapter(fm!!) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                Fragment_Update_Patient()
            }
            1 -> {
                Fragment_UpdatePatientTC()
            }
            else -> Fragment_Update_Patient()
        }
    }
    override fun getCount(): Int {
        return totalTabs
    }
}