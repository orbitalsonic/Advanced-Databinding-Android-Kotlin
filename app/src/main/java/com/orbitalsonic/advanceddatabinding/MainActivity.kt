package com.orbitalsonic.advanceddatabinding

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.orbitalsonic.advanceddatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.btnSdb.setOnClickListener {
            startActivity(Intent(this,SimpleDataBindingActivity::class.java))
        }

        binding.btnTwb.setOnClickListener {

        }

        binding.btnVmb.setOnClickListener {

        }

    }
}