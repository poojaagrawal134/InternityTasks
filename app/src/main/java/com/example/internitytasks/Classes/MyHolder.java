package com.example.internitytasks.Classes;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.internitytasks.R;

public class MyHolder extends RecyclerView.ViewHolder {
  public   ImageView im;
    public TextView mtitles;
    public TextView descrip;

    public MyHolder(@NonNull View itemView) {
        super(itemView);
        this.im=itemView.findViewById(R.id.Imagview);
        this.mtitles=itemView.findViewById(R.id.title);
        this.descrip=itemView.findViewById(R.id.desc);

    }
}
