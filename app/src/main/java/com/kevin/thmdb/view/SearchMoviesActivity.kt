package com.kevin.thmdb.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kevin.thmdb.databinding.ActivityHomeBinding
import com.kevin.thmdb.databinding.ActivitySearchMoviesBinding

class SearchMoviesActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySearchMoviesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchMoviesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}