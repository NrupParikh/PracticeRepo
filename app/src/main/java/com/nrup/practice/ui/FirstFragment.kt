package com.nrup.practice.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import com.nrup.practice.base.BaseFragment
import com.nrup.practice.databinding.FirstFragmentBinding

class FirstFragment : BaseFragment<FirstFragmentBinding>() {

    override fun setBinding(): FirstFragmentBinding = FirstFragmentBinding.inflate(layoutInflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("TAG", "onViewCreated")
    }
}