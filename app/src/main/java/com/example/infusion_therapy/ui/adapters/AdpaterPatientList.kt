package com.example.infusion_therapy.ui.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.infusion_therapy.R
import com.example.infusion_therapy.databinding.ItemPatientListBinding
import com.example.infusion_therapy.model.patientList.ModelPatientListResponse
import com.example.infusion_therapy.ui.activity.LoginActivity
import com.example.infusion_therapy.ui.activity.UpdatePatientDetailsActivity

class AdpaterPatientList(var modelPatientListResponse: ModelPatientListResponse) :RecyclerView.Adapter<AdpaterPatientList.AdpaterPatientListHolder>() {

    lateinit var binding:ItemPatientListBinding
    var count:Int=1
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdpaterPatientListHolder {
        binding=DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_patient_list,parent,false)
        return AdpaterPatientListHolder(binding.root)
    }

    override fun onBindViewHolder(holder: AdpaterPatientListHolder, position: Int) {
        binding.srno.text=count.toString()
  //      binding.tvDate.text=modelPatientListResponse.data[position].dob
        binding.tvDate.text="03/22/2022"
        //23/03/2022
        binding.tvEmail.text=modelPatientListResponse.data[position].email
        binding.tvName.text=modelPatientListResponse.data[position].fullName

        binding.lay.setOnClickListener {
            val intent = Intent(binding.tvName.context, UpdatePatientDetailsActivity::class.java)
            binding.tvName.context.startActivity(intent)
        }
        count++
    }

    override fun getItemCount(): Int {
       return modelPatientListResponse.data.size
    }

    class AdpaterPatientListHolder(itemView: View) :RecyclerView.ViewHolder(itemView){

    }
}