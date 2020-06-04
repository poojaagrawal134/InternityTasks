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

public class SignupActivity extends AppCompatActivity {

    Button mSignupbtn;
    TextView mloginbtn;
    ProgressBar pbar;
    SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        final EditText mEmail=(EditText)findViewById(R.id.Second);

        final EditText mPassword=(EditText)findViewById(R.id.Third);
        mSignupbtn=(Button)findViewById(R.id.button2);
        mloginbtn=(TextView)findViewById(R.id.textView7);
        pbar=(ProgressBar)findViewById(R.id.progressBar);
        preferences=getSharedPreferences("MYPREF",0);

        final EditText mPhone=(EditText)findViewById(R.id.editText8);
        mSignupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nemail=mEmail.getText().toString();
                String npassword=mPassword.getText().toString();
                String nphone=mPhone.getText().toString();
                pbar.setVisibility(View.VISIBLE);
                SharedPreferences.Editor editor=preferences.edit();
                editor.putString("email",nemail);
                editor.putString("password",npassword);
                editor.putString("phone",nphone);
                editor.apply();
                Toast.makeText(SignupActivity.this ,"User Registered", Toast.LENGTH_SHORT).show();
                editor.commit();
                startActivity(new Intent(SignupActivity.this,LoginActivity.class));

            }
        });
    }

}
