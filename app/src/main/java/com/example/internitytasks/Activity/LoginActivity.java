package com.example.internitytasks.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.internitytasks.R;

public class LoginActivity extends AppCompatActivity {

    Button mloginbtn;
    TextView mcreatebtn;
    ProgressBar pbar;
    SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       final EditText mEmail=(EditText)findViewById(R.id.editText);
        final EditText mPassword=(EditText)findViewById(R.id.editText3);
        mloginbtn=(Button)findViewById(R.id.button);
        mcreatebtn=(TextView)findViewById(R.id.textView5);
        pbar=(ProgressBar)findViewById(R.id.progressBar2);
        preferences=getSharedPreferences("MYPREF",0);
        mloginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=mEmail.getText().toString();
                String password=mPassword.getText().toString();
                String uemail=preferences.getString("email","");
                String upass=preferences.getString("password","");
                pbar.setVisibility(View.VISIBLE);
                if(email.equals(uemail)&& password.equals(upass))
                {
                Intent intent=new Intent(LoginActivity.this,DashBoardActivity.class);
                startActivity(intent);
            }else
                {
                    Toast.makeText(LoginActivity.this,"Wrong Email and Password",Toast.LENGTH_SHORT).show();
                }
            }
        });
        mcreatebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,SignupActivity.class));
            }
        });

    }
}
