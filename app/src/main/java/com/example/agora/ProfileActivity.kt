package com.example.agora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class ProfileActivity : Fragment() {
    lateinit var changepass: Button
    lateinit var changeemai:Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view :View
        view=inflater.inflate(R.layout.activity_profile, container, false)
        changepass=view.findViewById(R.id.changepass)
        changeemai=view.findViewById(R.id.changemail)
        changeemai.setOnClickListener {
            startActivity(Intent(context,ChangeEmail::class.java))
        }
        changepass.setOnClickListener {
            startActivity(Intent(context,ChangePassword::class.java))
        }
        return view
    }
}
