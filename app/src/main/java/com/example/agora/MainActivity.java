package com.example.agora;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ShareActionProvider;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    Fragment fragment;
    NavigationView navView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);
        navView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle =new  ActionBarDrawerToggle(
                this, drawerLayout, toolbar, 0, 0
        );
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navView.setNavigationItemSelectedListener(this);
        if(savedInstanceState==null){
            fragment=new HomePage();
            getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).addToBackStack(null).commit();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.dashboard :
                fragment=new HomePage();
                Toast.makeText(this, "Dashboard clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.profile : {
                fragment=new ProfileActivity();
                Toast.makeText(this, "Profile clicked", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.about :
                Toast.makeText(this, "About clicked", Toast.LENGTH_SHORT).show();
                fragment=new AboutActiviy();
                break;

            case R.id.contact_us :
                Toast.makeText(this, "Contact Us clicked", Toast.LENGTH_SHORT).show();
                fragment=new Contactus();
                break;

            case R.id.report_a_bug :
                Toast.makeText(this, "report a bug out clicked", Toast.LENGTH_SHORT).show();
                fragment=new ReportaBug();
                break;

            case R.id.share_with_others :
                Toast.makeText(this, "share out clicked", Toast.LENGTH_SHORT).show();
                break;
        }
        if(fragment!=null){
            getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).addToBackStack(null).commit();
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
