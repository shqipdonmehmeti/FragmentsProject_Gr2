package com.example.fragmentsproject_gr2.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fragmentsproject_gr2.R
import com.example.fragmentsproject_gr2.databinding.ActivityMainBinding
import com.example.fragmentsproject_gr2.fragments.FirstFragment
import com.example.fragmentsproject_gr2.fragments.SecondFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        binding.btnFirstFragment.setOnClickListener {
            setCurrentFragment(firstFragment)
        }

        binding.btnSecondFragment.setOnClickListener {
            setCurrentFragment(secondFragment)
        }

    }

    private fun setCurrentFragment(fragment : Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainerView,fragment)
            addToBackStack(null)
            commit()
        }
    }
}