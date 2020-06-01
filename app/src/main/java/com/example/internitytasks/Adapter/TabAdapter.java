package com.example.internitytasks.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.internitytasks.Fragments.About;
import com.example.internitytasks.Fragments.Chat;
import com.example.internitytasks.Fragments.Fragment1;
import com.example.internitytasks.Fragments.Fragment2;
import com.example.internitytasks.Fragments.Fragment3;
import com.example.internitytasks.Fragments.Home;

public class TabAdapter extends FragmentPagerAdapter {
    private int tabscount;
    public TabAdapter(@NonNull FragmentManager fm, int behavior, int tabscount) {
        super(fm, behavior);
        this.tabscount=tabscount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
        case 0:
            return new Fragment1();
        case 1:
            return new Fragment2();
        case 2:
            return new Fragment3();
        default:
        return null;
    }
    }

    @Override
    public int getCount() {
        return tabscount;
    }
}
