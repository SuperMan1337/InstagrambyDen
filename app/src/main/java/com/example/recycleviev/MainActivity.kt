package com.example.recycleviev

import HomeFragment
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {








    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val homeFragment = HomeFragment()
        val profileFragment = ProfileFragment()
        val recomendationFragment = RecomendationFragment()
        val shortsFragment = ShortsFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment1, homeFragment)
            commit()
        }

        val btnFragment1 = findViewById<ImageButton>(R.id.btnFragmentHome)
        btnFragment1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment1, homeFragment)
                addToBackStack(null)
                commit()
            }
        }

        val btnFragment2 = findViewById<ImageButton>(R.id.btnFragmentProfile)
        btnFragment2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment1, profileFragment)
                addToBackStack(null)
                commit()
            }
        }

        val btnFragment3 = findViewById<ImageButton>(R.id.btnFragmentRecomendation)
        btnFragment3.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment1, recomendationFragment)
                addToBackStack(null)
                commit()
            }
        }

        val btnFragment4 = findViewById<ImageButton>(R.id.btnFragmentShorts)
        btnFragment4.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment1, shortsFragment)
                addToBackStack(null)
                commit()
            }
        }

    }
}


