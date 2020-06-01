package com.example.internitytasks.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.internitytasks.Classes.Model;
import com.example.internitytasks.Classes.MyHolder;
import com.example.internitytasks.R;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {
    Context c;
    ArrayList<Model> models;

    public MyAdapter(Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row,null);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
   holder.mtitles.setText(models.get(position).getTitle());
        holder.descrip.setText(models.get(position).getTitle());
        holder.im.setImageResource(models.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
