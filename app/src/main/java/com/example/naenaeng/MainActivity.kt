package com.example.naenaeng

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.naenaeng.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity: AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        setBottomNav()

    }
    private fun setBottomNav() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        findViewById<BottomNavigationView>(R.id.bottom_nav)
            .setupWithNavController(navController)
    }

    fun setToolbar(tag: String){
        when (tag) {
            "none" -> {
                binding.toolbar.visibility = View.GONE
                binding.bottomNav.visibility = View.VISIBLE
            }
            "none2" -> {
                binding.toolbar.visibility = View.GONE
                binding.bottomNav.visibility = View.GONE
            }
            else -> {
                binding.toolbar.visibility=View.VISIBLE
                binding.bottomNav.visibility = View.VISIBLE
                binding.tvToolbarName.text = tag
            }
        }
    }
}