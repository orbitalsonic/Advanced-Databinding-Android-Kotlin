package com.orbitalsonic.advanceddatabinding

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.orbitalsonic.advanceddatabinding.databinding.ActivityTwoWayBindingBinding

class TwoWayBindingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTwoWayBindingBinding
    private val exampleViewModel: ExampleViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_two_way_binding)


        binding.lifecycleOwner = this
        binding.myViewModel = exampleViewModel
    }
}