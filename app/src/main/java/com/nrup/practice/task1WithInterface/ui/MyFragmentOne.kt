package com.nrup.practice.task1WithInterface.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.nrup.practice.databinding.MyFragmentOneBinding

class MyFragmentOne : Fragment() {
    private lateinit var binding: MyFragmentOneBinding
    private var callback: InfButtonClick? = null


    interface InfButtonClick {
        fun onButtonClicked(text: String)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            callback = activity as InfButtonClick
        } catch (e: ClassCastException) {
            throw ClassCastException(activity.toString() + " must implement InfButtonClick")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = MyFragmentOneBinding.inflate(layoutInflater)

        binding.btnSend.setOnClickListener {
            callback?.onButtonClicked(binding.edtInput.text.toString())
        }
        return binding.root
    }

}