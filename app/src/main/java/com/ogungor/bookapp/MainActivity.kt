package com.ogungor.bookapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager
    private lateinit var viewPagerAdapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        viewPager=findViewById(R.id.viewSlider)

        viewPagerAdapter=ViewPagerAdapter()

        viewPager.setAdapter(viewPagerAdapter)

    }
}