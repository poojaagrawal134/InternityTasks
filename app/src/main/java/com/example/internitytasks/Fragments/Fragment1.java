package com.example.internitytasks.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.internitytasks.Adapter.MyAdapter;
import com.example.internitytasks.Models.Model;
import com.example.internitytasks.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {

    RecyclerView recyclerView;
    MyAdapter myAdapter;
    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v= inflater.inflate(R.layout.fragment_fragment1, container, false);
        recyclerView=v.findViewById(R.id.recview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        myAdapter=new MyAdapter(getContext(),getMyList());
        recyclerView.setAdapter(myAdapter);
        return v;
    }
    private ArrayList<Model> getMyList()
    {
        ArrayList<Model> models=new ArrayList<>();
        Model m=new Model();
        m.setTitle("Pooja Agrawal");
        m.setDesc("B.Tech CS 3rd year");
        m.setImage(R.drawable.imae);
        models.add(m);


        m=new Model();
        m.setTitle("Priya Agrawal");
        m.setDesc("BCA 2nd Year");
        m.setImage(R.drawable.e);
        models.add(m);

        m=new Model();
        m.setTitle("Peeyush Agrawal");
        m.setDesc("B.com 3rd year");
        m.setImage(R.drawable.a);
        models.add(m);

        m=new Model();
        m.setTitle("Papa");
        m.setDesc("last seen 12:00, Thursday");
        m.setImage(R.drawable.f);
        models.add(m);

        m=new Model();
        m.setTitle("Uncle");
        m.setDesc("on Work");
        m.setImage(R.drawable.b);
        models.add(m);

        m=new Model();
        m.setTitle("Pooja Agrawal");
        m.setDesc("B.Tech CS 3rd year");
        m.setImage(R.drawable.imae);
        models.add(m);


        m=new Model();
        m.setTitle("Priya Agrawal");
        m.setDesc("BCA 2nd Year");
        m.setImage(R.drawable.e);
        models.add(m);

        m=new Model();
        m.setTitle("Peeyush Agrawal");
        m.setDesc("B.com 3rd year");
        m.setImage(R.drawable.a);
        models.add(m);

        m=new Model();
        m.setTitle("Papa");
        m.setDesc("last seen 12:00, Thursday");
        m.setImage(R.drawable.f);
        models.add(m);

        m=new Model();
        m.setTitle("Uncle");
        m.setDesc("on Work");
        m.setImage(R.drawable.b);

        m=new Model();
        m.setTitle("Pooja Agrawal");
        m.setDesc("B.Tech CS 3rd year");
        m.setImage(R.drawable.imae);
        models.add(m);


        m=new Model();
        m.setTitle("Priya Agrawal");
        m.setDesc("BCA 2nd Year");
        m.setImage(R.drawable.e);
        models.add(m);

        m=new Model();
        m.setTitle("Peeyush Agrawal");
        m.setDesc("B.com 3rd year");
        m.setImage(R.drawable.a);
        models.add(m);

        m=new Model();
        m.setTitle("Papa");
        m.setDesc("last seen 12:00, Thursday");
        m.setImage(R.drawable.f);
        models.add(m);

        m=new Model();
        m.setTitle("Uncle");
        m.setDesc("on Work");
        m.setImage(R.drawable.b);

        m=new Model();
        m.setTitle("Pooja Agrawal");
        m.setDesc("B.Tech CS 3rd year");
        m.setImage(R.drawable.imae);
        models.add(m);


        m=new Model();
        m.setTitle("Priya Agrawal");
        m.setDesc("BCA 2nd Year");
        m.setImage(R.drawable.e);
        models.add(m);

        m=new Model();
        m.setTitle("Peeyush Agrawal");
        m.setDesc("B.com 3rd year");
        m.setImage(R.drawable.a);
        models.add(m);

        m=new Model();
        m.setTitle("Papa");
        m.setDesc("last seen 12:00, Thursday");
        m.setImage(R.drawable.f);
        models.add(m);

        m=new Model();
        m.setTitle("Uncle");
        m.setDesc("on Work");
        m.setImage(R.drawable.b);

        m=new Model();
        m.setTitle("Pooja Agrawal");
        m.setDesc("B.Tech CS 3rd year");
        m.setImage(R.drawable.imae);
        models.add(m);


        m=new Model();
        m.setTitle("Priya Agrawal");
        m.setDesc("BCA 2nd Year");
        m.setImage(R.drawable.e);
        models.add(m);

        m=new Model();
        m.setTitle("Peeyush Agrawal");
        m.setDesc("B.com 3rd year");
        m.setImage(R.drawable.a);
        models.add(m);

        m=new Model();
        m.setTitle("Papa");
        m.setDesc("last seen 12:00, Thursday");
        m.setImage(R.drawable.f);
        models.add(m);

        m=new Model();
        m.setTitle("Uncle");
        m.setDesc("on Work");
        m.setImage(R.drawable.b);

        m=new Model();
        m.setTitle("Pooja Agrawal");
        m.setDesc("B.Tech CS 3rd year");
        m.setImage(R.drawable.imae);
        models.add(m);


        m=new Model();
        m.setTitle("Priya Agrawal");
        m.setDesc("BCA 2nd Year");
        m.setImage(R.drawable.gi);
        models.add(m);

        m=new Model();
        m.setTitle("Peeyush Agrawal");
        m.setDesc("B.com 3rd year");
        m.setImage(R.drawable.a);
        models.add(m);

        m=new Model();
        m.setTitle("Papa");
        m.setDesc("last seen 12:00, Thursday");
        m.setImage(R.drawable.f);
        models.add(m);

        m=new Model();
        m.setTitle("Uncle");
        m.setDesc("on Work");
        m.setImage(R.drawable.b);


        return models;
    }

}
