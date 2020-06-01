package com.example.internitytasks;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.example.internitytasks.Adapter.TabAdapter;
import com.example.internitytasks.Fragments.About;
import com.example.internitytasks.Fragments.Chat;
import com.example.internitytasks.Fragments.Home;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class Main2Activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
     DrawerLayout drawer;
     ActionBarDrawerToggle toggle;
     NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("ChatBox");

        drawer = findViewById(R.id.drawerlayout);
        navigationView=findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.setDrawerIndicatorEnabled(true);
        toggle.syncState();

        if(savedInstanceState==null)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,new Home()).commit();
            navigationView.setCheckedItem(R.id.nav_home);
        }

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId())
        {
            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,new Home()).commit();

                break;
            case R.id.nav_About:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,new About()).commit();

                break;
            case R.id.nav_chat:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,new Chat()).commit();

                break;
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
