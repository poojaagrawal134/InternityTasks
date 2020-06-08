package com.example.internitytasks.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.internitytasks.Database.UserEntity;
import com.example.internitytasks.Fragments.About;
import com.example.internitytasks.Fragments.Chat;
import com.example.internitytasks.Fragments.Home;
import com.example.internitytasks.Fragments.Profile;
import com.example.internitytasks.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.textfield.TextInputEditText;

public class DashBoardActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
     DrawerLayout drawer;
     ActionBarDrawerToggle toggle;
     BottomNavigationView bottomNavigationView;
     NavigationView navigationView;
     FloatingActionButton floatbutton;
     String n,a,p;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        floatbutton=findViewById(R.id.fab);
        getSupportActionBar().setTitle("ChatBox");
        bottomNavigationView=(BottomNavigationView)findViewById(R.id.bottom_view);
        drawer = findViewById(R.id.drawerlayout);
        navigationView=findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.setDrawerIndicatorEnabled(true);
        toggle.syncState();

        floatbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customAlertDialog();

            }
        });

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.nav_home2:

                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,new Home()).commit();

                        break;
                    case R.id.nav_About:

                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,new About()).commit();
                        break;
                    case R.id.nav_pro2:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,new Profile()).commit();
                        break;
                    case R.id.nav_help:

                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,new Chat()).commit();
                        break;
                }

                return true;
            }
        });
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
                bottomNavigationView.setSelectedItemId(R.id.nav_home2);

                break;
            case R.id.nav_About:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,new About()).commit();

                break;
            case R.id.nav_chat:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,new Chat()).commit();
                bottomNavigationView.setSelectedItemId(R.id.nav_pro2);

                break;
            case R.id.nav_profile:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,new Profile()).commit();

                break;
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.home_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.men_log :
                alert();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void alert() {

        AlertDialog.Builder abuilder=new AlertDialog.Builder(DashBoardActivity.this);
        //Setting message manually and performing action on button click
        abuilder.setMessage("Do you want to close this application ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        SharedPreferences preferences =getSharedPreferences("MYPREF",0);
                        SharedPreferences.Editor editor = preferences.edit();
                        editor.clear();
                        editor.apply();
                        finish();
                        startActivity(new Intent(DashBoardActivity.this,LoginActivity.class));

                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //  Action for 'NO' Button
                        dialog.cancel();
                        Toast.makeText(getApplicationContext(),"you choose no action for alertbox",
                                Toast.LENGTH_SHORT).show();
                    }
                });
        //Creating dialog box
        AlertDialog alert = abuilder.create();
        //Setting the title manually
        alert.setTitle("Log Out");
        alert.show();
    }
    public void customAlertDialog (){
        AlertDialog.Builder mydialog = new AlertDialog.Builder(DashBoardActivity.this);
        LayoutInflater inflater = LayoutInflater.from(DashBoardActivity.this);
        View myview = inflater.inflate(R.layout.custom_dialog,null);

        final AlertDialog dialog = mydialog.create();
        dialog.setView(myview);
        dialog.show();

        final TextInputEditText nameet = myview.findViewById(R.id.named);
        final TextInputEditText ageet = myview.findViewById(R.id.aged);
        final TextInputEditText phoneet = myview.findViewById(R.id.phoned);
        Button CancelButton = myview.findViewById(R.id.btncancel);
        Button SubmitButton = myview.findViewById(R.id.btmsubmit);
        CancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });

        SubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uName = nameet.getText().toString().trim();
                String uAge = ageet.getText().toString().trim();
                String uPhone = phoneet.getText().toString().trim();
                if(uName.isEmpty()){
                    dialog.dismiss();
                    Toast.makeText(DashBoardActivity.this,"Name can not be blank",Toast.LENGTH_LONG).show();
                    return;
                }

                UserEntity newuser = new UserEntity(uName,uAge,uPhone);
              //  mtodoTaskViewModel.insert(newuser);
                dialog.dismiss();
                Toast.makeText(DashBoardActivity.this,"User added to your list",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

