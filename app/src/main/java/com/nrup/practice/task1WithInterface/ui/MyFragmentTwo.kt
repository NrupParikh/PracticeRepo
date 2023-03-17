package com.nrup.practice.task1WithInterface.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.nrup.practice.databinding.MyFragmentTwoBinding

class MyFragmentTwo : Fragment() {
    private lateinit var binding: MyFragmentTwoBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = MyFragmentTwoBinding.inflate(layoutInflater)
        return binding.root
    }

    fun changeTextViewContent(string: String) {
        binding.textView.text = string
    }
}