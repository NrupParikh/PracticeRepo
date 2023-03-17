package com.nrup.practice.task1WithViewModel.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {

    private val _fragmentOneData: MutableLiveData<CharSequence> = MutableLiveData()
    private val _fragmentTwoData: MutableLiveData<CharSequence> = MutableLiveData()

    fun setFragmentOneData(input: CharSequence) {
        _fragmentOneData.value = input
    }

    fun setFragmentTwoData(input: CharSequence) {
        _fragmentTwoData.value = input
    }


    fun getFragmentOneData(): LiveData<CharSequence?> = _fragmentOneData
    fun getFragmentTwoData(): LiveData<CharSequence?> = _fragmentTwoData
}