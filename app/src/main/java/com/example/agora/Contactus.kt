package com.example.agora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment

class Contactus : Fragment() {
    lateinit var gitter:LinearLayout
    lateinit var gitla:LinearLayout
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view:View
        view=inflater.inflate(R.layout.activity_contactus, container, false)
        gitter=view.findViewById(R.id.gitterlay)
        gitla=view.findViewById(R.id.gitlablay)
        gitla.setOnClickListener{
            startActivity(Intent(context,GitLab::class.java))
        }
        gitter.setOnClickListener{
            startActivity(Intent(context,Gitter::class.java))
        }
        return view
    }
}
