package com.example.fragmentsproject_gr2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentsproject_gr2.R
import com.example.fragmentsproject_gr2.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {
    private lateinit var binding : FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val profileDetailsFragment = ProfileDetailsFragment()
        binding.btnGoToProfileDetails.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("schoolName","Cacttus Education")
            profileDetailsFragment.arguments = bundle
            setCurrentFragment(profileDetailsFragment)
        }
    }

    private fun setCurrentFragment(fragment : Fragment) {
        parentFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainerView,fragment)
            addToBackStack(null)
            commit()
        }
    }
}













