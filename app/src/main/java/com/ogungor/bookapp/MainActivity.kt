package com.ogungor.bookapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2


class MainActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager2


    private val sliderViewPagerAdapter = SliderViewPagerAdapter(
        listOf(
            SliderHolder(
                R.drawable.between
            )
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        /*viewPager=findViewById(R.id.sliderViewPager)
        viewPager.adapter=sliderViewPagerAdapter*/


    }
}