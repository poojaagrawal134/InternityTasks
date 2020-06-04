package com.example.internitytasks.Activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.internitytasks.R;

public class MainActivity extends AppCompatActivity {
    Button b1;
    TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        name=(TextView)findViewById(R.id.name);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mydialog=new AlertDialog.Builder(MainActivity.this);
                mydialog.setTitle("Enter your Name");
                final EditText ed=new EditText(MainActivity.this);
                ed.setInputType(InputType.TYPE_CLASS_TEXT);
                mydialog.setView(ed);
                mydialog.setPositiveButton("Submit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String mytext=ed.getText().toString();
                        name.setText(mytext);
                    }
                });
                mydialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                mydialog.show();
            }
        });
        Toast.makeText(MainActivity.this, "Activity created", Toast.LENGTH_LONG).show();
    }
    protected void onStart() {
        super.onStart();

        Toast.makeText(MainActivity.this, "Activity Started", Toast.LENGTH_LONG).show();
    }
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this, "Activity Resumed", Toast.LENGTH_LONG).show();
    }
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this, "Activity Paused", Toast.LENGTH_LONG).show();

    }
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this, "Activity Stopped", Toast.LENGTH_LONG).show();

    }
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this, "Activity Destroyed", Toast.LENGTH_LONG).show();

    }

}
