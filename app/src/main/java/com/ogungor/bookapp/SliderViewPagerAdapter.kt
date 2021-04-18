package com.ogungor.bookapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.getSystemService
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager

class SliderViewPagerAdapter (private val sliderHolder: List<SliderHolder>) :
    RecyclerView.Adapter<SliderViewPagerAdapter.SliderViewHolder>() {

    inner class SliderViewHolder(view:View) :RecyclerView.ViewHolder(view)
    {
        private val imageIcon=view.findViewById<ImageView>(R.id.imageIcon)

        fun bind(sliderHolder: SliderHolder)
        {
            imageIcon.setImageResource(sliderHolder.icon)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SliderViewHolder {
        return SliderViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.slider_item,parent,false
            )
        )
    }

    override fun onBindViewHolder(holder: SliderViewHolder, position: Int) {
        holder.bind(sliderHolder[position])
    }

    override fun getItemCount(): Int {
        return sliderHolder.size
    }


}