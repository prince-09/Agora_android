package com.example.agora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Electiondetail : AppCompatActivity() {
    lateinit var recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_electiondetail)
        recycler = findViewById(R.id.recycleradd)
        recycler.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        //crating an arraylist to store users using the data class user
        val users = ArrayList<String>()
        users.add("College elections")
        users.add("College elections")
        users.add("College elections")
        users.add("College elections")
        users.add("College elections")
        users.add("College elections")
        users.add("College elections")
        users.add("College elections")
        users.add("College elections")
        users.add("College elections")
        users.add("College elections")
        users.add("College elections")

        //creating our adapter
        val adapter = electiondetailAdapter(users,this)

        //now adding the adapter to recyclerview
        recycler.adapter = adapter
    }
}
