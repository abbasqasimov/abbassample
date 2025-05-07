package com.example.abbassample.homework21

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.abbassample.databinding.ItemNoteBinding
import com.example.abbassample.databinding.Noteview2Binding

class NoteAdapter(private val dataList:List<Notes>):RecyclerView.Adapter<NoteViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val inflater=LayoutInflater.from(parent.context)
        val binding=Noteview2Binding.inflate(inflater,parent,false)
        val viewHolder = NoteViewHolder(binding)
        return viewHolder
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        Log.e("abbas","item=$position")
        val note=dataList[position]
        holder.binding.note3.text= note.notes
        holder.binding.note2.setCardBackgroundColor(note.color)

    }
}