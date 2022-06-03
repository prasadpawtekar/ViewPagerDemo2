package com.apolisrises.viewpagerdemo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.apolisrises.viewpagerdemo2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = listOf(
            R.drawable.smartphone1,
            R.drawable.smartphone2,
            R.drawable.smartphone3,
            R.drawable.smartphone4,
            R.drawable.smartphone5,
        )

        val adapter = ImagesVPAdapter(list, supportFragmentManager);
        binding.vpImages.adapter = adapter
    }
}