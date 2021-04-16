package com.ogungor.bookapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.getSystemService
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager

class ViewPagerAdapter : PagerAdapter() {

    private lateinit var context:Context
    private lateinit var layoutInflater: LayoutInflater
    private var images: IntArray= intArrayOf(R.drawable.between)

    fun ViewPagerAdapter(){


    }

    override fun getCount(): Int {
        return images.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view==`object`
    }

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun instantiateItem(container: View, position: Int): Any {

        layoutInflater= context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var view= layoutInflater.inflate(R.layout.custom_layout,null)
        var imageView= view.findViewById(R.id.imageView) as ImageView

        imageView.setImageResource(images[position])

        val viewPager= container as ViewPager
        viewPager.addView(view)

        return view

    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val viewPager= container as ViewPager
        val view=`object` as View
        viewPager.removeView(view)
    }
}