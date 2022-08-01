package com.orbitalsonic.advanceddatabinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.orbitalsonic.advanceddatabinding.databinding.ActivitySimpleDataBindingBinding

class SimpleDataBindingActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySimpleDataBindingBinding
    private val profileModel = ProfileModel("Fawad Khan",40,"Pakistani Actor",R.drawable.profile_pic)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_simple_data_binding)

        binding.profileData = profileModel

    }
}