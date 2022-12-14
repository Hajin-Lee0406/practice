package com.example.just_practice.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.just_practice.R
import com.example.just_practice.databinding.FragmentAllBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class AllFragment : Fragment() {

    private lateinit var binding: FragmentAllBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_all, container, false)

        binding.publicTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_allFragment_to_publicFragment)
        }
        binding.privateTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_allFragment_to_privateFragment)
        }
        return binding.root
    }
}