package com.example.agora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.Toast

import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView
import com.shrikanthravi.customnavigationdrawer2.widget.SNavigationDrawer
import java.util.ArrayList

class HomePage : Fragment() {
    lateinit var createElection:Button
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view:View
        view=inflater.inflate(R.layout.activity_home_page, container, false)
        createElection= view?.findViewById(R.id.createelection)!!
        createElection.setOnClickListener {
            startActivity(Intent(context,Uploadelections::class.java))
        }
        return view
    }
}
