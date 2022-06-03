package com.apolisrises.viewpagerdemo2

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ImagesVPAdapter(val images: List<Int>, fm: FragmentManager): FragmentPagerAdapter(fm) {
    override fun getCount() = images.size

    override fun getItem(position: Int): Fragment {
        val imageFragment = ImageFragment()

        val bundle = Bundle()
        bundle.putInt("image_id", images[position])
        imageFragment.arguments = bundle

        return imageFragment
    }
}