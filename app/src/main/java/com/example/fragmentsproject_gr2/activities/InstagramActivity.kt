package com.example.fragmentsproject_gr2.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fragmentsproject_gr2.R
import com.example.fragmentsproject_gr2.databinding.ActivityInstagramBinding
import com.example.fragmentsproject_gr2.fragments.ExploreFragment
import com.example.fragmentsproject_gr2.fragments.HomeFragment
import com.example.fragmentsproject_gr2.fragments.PostFragment
import com.example.fragmentsproject_gr2.fragments.ProfileFragment
import com.example.fragmentsproject_gr2.fragments.ReelsFragment

class InstagramActivity : AppCompatActivity() {
    private lateinit var binding : ActivityInstagramBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInstagramBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val homeFragment = HomeFragment()
        val exploreFragment = ExploreFragment()
        val postFragment = PostFragment()
        val reelsFragment = ReelsFragment()
        val profileFragment = ProfileFragment()
        setCurrentFragment(homeFragment)


        binding.bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId) {
                R.id.homeItem -> setCurrentFragment(homeFragment)
                R.id.exploreItem -> setCurrentFragment(exploreFragment)
                R.id.addItem -> setCurrentFragment(postFragment)
                R.id.reelsItem -> setCurrentFragment(reelsFragment)
                R.id.profileItem -> setCurrentFragment(profileFragment)
            }
            true
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