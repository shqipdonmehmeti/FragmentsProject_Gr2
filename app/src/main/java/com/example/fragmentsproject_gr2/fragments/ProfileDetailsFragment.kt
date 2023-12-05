package com.example.fragmentsproject_gr2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentsproject_gr2.R
import com.example.fragmentsproject_gr2.databinding.FragmentProfileDetailsBinding


class ProfileDetailsFragment : Fragment() {
    private lateinit var binding : FragmentProfileDetailsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileDetailsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bundle = this.arguments
        val schoolName = bundle?.getString("schoolName")

        binding.tvShowData.text = schoolName
    }
}