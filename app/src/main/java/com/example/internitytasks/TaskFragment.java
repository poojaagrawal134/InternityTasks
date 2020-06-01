package com.example.internitytasks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.internitytasks.Fragments.BlueFragment;
import com.example.internitytasks.Fragments.GreenFragment;

public class TaskFragment extends AppCompatActivity implements GreenFragment.OnGreenFragmentListener{
    private static final String BLUE_TAG = "blue";
    private static final String GREEN_TAG = "green";
    BlueFragment mBlueFragment;
    GreenFragment mGreenFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_fragment);
        FragmentManager fragmentManager = getSupportFragmentManager();

        mBlueFragment = (BlueFragment) fragmentManager.findFragmentByTag(BLUE_TAG);
        if (mBlueFragment == null) {
            mBlueFragment = new BlueFragment();
            fragmentManager.beginTransaction().add(R.id.blue_fragment_container, mBlueFragment, BLUE_TAG).commit();
        }

        mGreenFragment = (GreenFragment) fragmentManager.findFragmentByTag(GREEN_TAG);
        if (mGreenFragment == null) {
            mGreenFragment = new GreenFragment();
            fragmentManager.beginTransaction().add(R.id.green_fragment_container, mGreenFragment, GREEN_TAG).commit();
        }
    }

    // The Activity handles receiving a message from one Fragment
    // and passing it on to the other Fragment
    @Override
    public void messageFromGreenFragment(String message) {
        mBlueFragment.youveGotMail(message);
    }
}
