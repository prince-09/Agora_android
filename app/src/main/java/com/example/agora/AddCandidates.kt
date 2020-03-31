package com.example.agora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AddCandidates : AppCompatActivity() {
    lateinit var proceed:Button
    lateinit var candidatename:EditText
    lateinit var add:Button
    lateinit var addrecycler:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_candidates)
        proceed=findViewById(R.id.proceed)
        add=findViewById(R.id.addbtn)
        addrecycler=findViewById(R.id.addrecycler)
        addrecycler.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        candidatename=findViewById(R.id.candidatename)
        val users = ArrayList<String>()
        val adapter = AddAdapter(users,this)
        addrecycler.adapter = adapter
        proceed.setOnClickListener {
            
        }
        add.setOnClickListener { 
            if(candidatename.text.toString()!=""){
                users.add(candidatename.text.toString())
                adapter.notifyDataSetChanged()
            }
        }

    }
}
