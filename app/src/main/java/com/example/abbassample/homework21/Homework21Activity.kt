package com.example.abbassample.homework21

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.toColorInt
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.abbassample.databinding.ActivityHomework21Binding

class Homework21Activity : AppCompatActivity() {

    private var binding:ActivityHomework21Binding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityHomework21Binding.inflate(layoutInflater)
        setContentView(binding?.root)

        val noteAdapter=NoteAdapter(createNoteList())
        binding?.recyclerView?.layoutManager= LinearLayoutManager(this)
        binding?.recyclerView?.adapter=noteAdapter

    }


    private fun createNoteList():List<Notes>{
        return listOf(
            Notes(notes = "UI concepts worth exsisting","#F44336".toColorInt()),
            Notes(notes="Book Review : The Design of Everyday Things by Don Norman","#E91E63".toColorInt()),
            Notes(notes="Animes produced by Ufotable","#9C27B0".toColorInt()),
            Notes(notes="Mangas planned to read","#673AB7".toColorInt()),
            Notes(notes="Awesome tweets collection","#3F51B5".toColorInt()),
            Notes(notes="kfvberjejfvnkjfvkjsnvjfbvlqhrlvqdvkqldhv","#03A9F4".toColorInt())


        )
    }
}