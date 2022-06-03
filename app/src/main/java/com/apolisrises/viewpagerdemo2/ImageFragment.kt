package com.apolisrises.viewpagerdemo2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.apolisrises.viewpagerdemo2.databinding.FragmentImageBinding

class ImageFragment: Fragment() {

    lateinit var binding: FragmentImageBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentImageBinding.inflate(inflater, container, false)
        val iconId = arguments?.getInt("image_id")
        iconId?.let {
            binding.ivPhoto.setImageDrawable(resources.getDrawable(it))
        }
        return binding.root
    }
}