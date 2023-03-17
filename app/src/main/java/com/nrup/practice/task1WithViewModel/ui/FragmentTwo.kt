package com.nrup.practice.task1WithViewModel.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.nrup.practice.databinding.FragmentTwoBinding
import com.nrup.practice.task1WithViewModel.model.SharedViewModel

class FragmentTwo : Fragment() {
    private lateinit var binding: FragmentTwoBinding
    private lateinit var viewModel: SharedViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Accessing shared view model defined in ActivityVM
        viewModel = (activity as ActivityVM).mySharedViewModel

        binding = FragmentTwoBinding.inflate(layoutInflater)

        binding.btnSend.setOnClickListener {
            viewModel.setFragmentTwoData(binding.edtInput.text.toString())
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Observe Fragment One Data
        viewModel.getFragmentOneData().observe(viewLifecycleOwner) { charSequence ->
            binding.tvData.text = charSequence
        }
    }

}