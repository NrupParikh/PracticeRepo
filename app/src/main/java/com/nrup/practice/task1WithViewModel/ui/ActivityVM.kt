package com.nrup.practice.task1WithViewModel.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.nrup.practice.R
import com.nrup.practice.databinding.ActivityVmBinding
import com.nrup.practice.task1WithViewModel.model.SharedViewModel

class ActivityVM : AppCompatActivity() {
    private lateinit var binding: ActivityVmBinding

    // Define VM instance by delegate
    val mySharedViewModel: SharedViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVmBinding.inflate(layoutInflater)
        setContentView(binding.root)

        addTwoFragmentsToActivity()

    }

    private fun addTwoFragmentsToActivity() {
        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentOne, FragmentOne())
            .add(R.id.fragmentTwo, FragmentTwo())
            .commit()
    }

}