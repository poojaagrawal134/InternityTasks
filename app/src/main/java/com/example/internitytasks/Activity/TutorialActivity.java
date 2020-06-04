package com.example.internitytasks.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.example.internitytasks.Adapter.intViewAdapter;
import com.example.internitytasks.Models.screenItem;
import com.example.internitytasks.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class TutorialActivity extends AppCompatActivity {

    private ViewPager mviewpager;
    intViewAdapter mintViewAdapter;
    TabLayout tabLayout;
    Button btnnext;
    int position=0;
    Button get;
    Animation btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        btnnext=findViewById(R.id.button);
        get=findViewById(R.id.getstarted);
        tabLayout=findViewById(R.id.tab_indicator);
        btn= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.button_animation);

        final List<screenItem> mList=new ArrayList<>();
        mList.add(new screenItem("Easy To use","It is very easy to use",R.drawable.a));
        mList.add(new screenItem("Flexible","Learn Easliy",R.drawable.b));
        mList.add(new screenItem("Happy Customers","Used By many customers",R.drawable.d));
        mviewpager=findViewById(R.id.screenvp);
        mintViewAdapter=new intViewAdapter(this,mList);
        mviewpager.setAdapter(mintViewAdapter);

        tabLayout.setupWithViewPager(mviewpager);

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                position=mviewpager.getCurrentItem();
                if(position<mList.size())
                {
                    position++;
                    mviewpager.setCurrentItem(position);
                }
                if(position==mList.size()-1)
                {
                    loadlastscreen();
                }
            }
        });
        get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TutorialActivity.this,LoginActivity.class));
            }
        });
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tab.getPosition()==mList.size())
                {
                    loadlastscreen();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
    private void loadlastscreen() {
        btnnext.setVisibility(View.INVISIBLE);
        get.setVisibility(View.VISIBLE);
        tabLayout.setVisibility(View.INVISIBLE);
        get.setAnimation(btn);

    }
}
