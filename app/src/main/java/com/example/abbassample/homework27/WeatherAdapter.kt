package com.example.abbassample.homework27

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.abbassample.databinding.ItemWeatherBinding

class WeatherAdapter: RecyclerView.Adapter<WeatherAdapter.ViewHolder>() {

    private var dataList = mutableListOf<WeatherData2>()

    inner class ViewHolder(var binding: ItemWeatherBinding): RecyclerView.ViewHolder(binding.root){

    }

    fun updateData(newList: List<WeatherData2>) {
        dataList.clear()
        dataList.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemWeatherBinding.inflate(inflater,parent,false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = dataList[position]
        holder.binding.day.text = data.day
        holder.binding.temp.text = data.temp.toString()
        val url = "https:${data.icon}"
        holder.binding.status.load(url)
    }

}