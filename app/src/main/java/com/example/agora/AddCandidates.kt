package com.example.agora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
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
            Toast.makeText(this,"You have successfully created the elecion",Toast.LENGTH_LONG).show()
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
        add.setOnClickListener { 
            if(candidatename.text.toString()!=""){
                users.add(candidatename.text.toString())
                adapter.notifyDataSetChanged()
            }
        }

    }
}
