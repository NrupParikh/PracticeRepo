package com.nrup.practice.task1WithInterface.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nrup.practice.R
import com.nrup.practice.databinding.ActivityMyBinding


class MyActivity : AppCompatActivity(), MyFragmentOne.InfButtonClick {
    private lateinit var binding: ActivityMyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        addTwoFragmentsToActivity()

    }

    private fun addTwoFragmentsToActivity() {
        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentOne, MyFragmentOne())
            .add(R.id.fragmentOne, MyFragmentTwo())
            .commit()
    }

    override fun onButtonClicked(text: String) {
        val textFragment: MyFragmentTwo? = supportFragmentManager
            .findFragmentById(R.id.fragmentTwo) as MyFragmentTwo?

        textFragment?.changeTextViewContent(text)
    }
}