package com.nrup.practice.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import com.nrup.practice.base.BaseFragment
import com.nrup.practice.databinding.SecondFragmentBinding

class SecondFragment : BaseFragment<SecondFragmentBinding>() {

    override fun setBinding(): SecondFragmentBinding = SecondFragmentBinding.inflate(layoutInflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("TAG", "onViewCreated")
    }
}