package com.orbitalsonic.advanceddatabinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ExampleViewModel  : ViewModel(){
    val textMutableLiveData = MutableLiveData("My Example Data")

    fun updateData() {
        textMutableLiveData.value = "Updated Data using Button!"
    }
}